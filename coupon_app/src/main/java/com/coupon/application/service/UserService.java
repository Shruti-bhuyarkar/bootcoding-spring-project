package com.coupon.application.service;

import com.coupon.application.model.User;
import com.coupon.application.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;



    public static String generateNewCoupon() {
        UUID uuid = UUID.randomUUID();
        return uuid.toString();
    }

    public void saveUser(User user){
        userRepository.save(user);
    }
    public void saveUser(List<User> users){
        for (User user: users){
            userRepository.save(user);

        }
    }
}
