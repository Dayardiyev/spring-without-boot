package kz.runtime.spring_without_boot.user;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    User saveUser(User user);
}
