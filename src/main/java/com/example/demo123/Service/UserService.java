package com.example.demo123.Service;

import com.example.demo123.Entity.User;
import com.example.demo123.Pojo.UserPojo;


import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

public interface UserService {
    List<User> getAllUsers();

    Optional<User> getUserById(Integer id);

    User saveUser(UserPojo userPojo);

    void deleteUser(Long id);

    User updateUser(Long id, User userDetails);

}
