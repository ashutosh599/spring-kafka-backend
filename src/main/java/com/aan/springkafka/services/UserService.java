package com.aan.springkafka.services;

import com.aan.springkafka.entities.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    List<User> getUsers();
    Optional<User> getUserById(long id);
    User getUserByEmail(String email);
    User addUser(User user);
    User updateUser(User user);
    User deleteUser(int id);
}
