package com.hospital.Hospital.service;

import com.hospital.Hospital.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    User addUser(User user);
    List<User> getUser();
    String updateUser(User user, int id);
    void deleteUser(int id);

}
