package com.cricket.ipl2020.prediction.service.impl;

import com.cricket.ipl2020.prediction.entity.Users;
import com.cricket.ipl2020.prediction.repository.UserRepository;
import com.cricket.ipl2020.prediction.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public List<Users> loginUser(String username, String password)
    {
        return userRepository.loginUser(username, password);

    }
}
