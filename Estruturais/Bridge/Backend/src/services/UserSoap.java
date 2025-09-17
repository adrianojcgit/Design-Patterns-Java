package services;

import dao.UserDao;
import model.User;

public class UserSoap extends UserService{
    public UserSoap(UserDao dao) {
        super(dao);
    }
    @Override
    public void save(User user) {
        System.out.println("Starting a save operation through Soap Protocol!");
        dao.save(user);
    }
}
