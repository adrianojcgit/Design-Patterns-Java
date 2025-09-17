package services;

import dao.UserDao;
import model.User;

public abstract class UserService {
    protected UserDao dao;

    public UserService(UserDao dao) {
        this.dao = dao;
    }
    public abstract void save(User user);
}
