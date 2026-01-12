package in.sigma.user_service.service;

import in.sigma.user_service.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    User createUser(User user);
    Optional<?> getUserById(Long id);
    List<User> getAllUsers();
}
