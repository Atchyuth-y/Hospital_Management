package com.hospital.Hospital.serviceImpl;

import com.hospital.Hospital.entity.User;
import com.hospital.Hospital.repository.UserRepository;
import com.hospital.Hospital.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User addUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> getUser() {
        return userRepository.findAll();
    }

    @Override
    public String updateUser(User user, int id) {
        Optional<User> user1 = userRepository.findById(id);
        if(user1.isPresent()){
            User user2 = user1.get();
            user2.setId(user.getId());
            user2.setFullName(user.getFullName());
            user2.setAge(user.getAge());
            user2.setEmail(user.getEmail());
            user2.setPassword(user.getPassword());
            userRepository.save(user2);
            return "User details updated" + user2;
        }
        else {
            return "No user with these details " + user + "was found";
        }
    }

    @Override
    public void deleteUser(int id) {
        userRepository.deleteById(id);
    }
}
