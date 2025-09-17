package services;

import dao.UserDao;
import model.User;

public class UserRest extends UserService{
    public UserRest(UserDao dao) {
        super(dao);
    }
    @Override
    public void save(User user) {

    }
}
