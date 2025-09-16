package core.ports;

import core.model.User;

import java.util.List;

public interface UserRepository {
    void save(User user);
    List<User> getAll();
}
