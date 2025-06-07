package com.userservice.userservice.service;




import com.userservice.userservice.model.User;
import com.userservice.userservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    // Service method to register a user
    public User registerUser(User user) {
        // Add any custom logic like checking for existing users
        return userRepository.save(user);
    }
}
