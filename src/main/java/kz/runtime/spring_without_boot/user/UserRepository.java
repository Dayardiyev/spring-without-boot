package kz.runtime.spring_without_boot.user;

import java.util.List;

public interface UserRepository {
    List<User> findAll();
    User save(User user);
}
