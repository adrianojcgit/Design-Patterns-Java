package dao;

import model.User;

public class UserPostgresDao implements UserDao{
    @Override
    public void save(User user) {
        System.out.println("Saving the user in the Postgres Database!");
    }
}
