package com.cricket.ipl2020.prediction.service.impl;

import com.cricket.ipl2020.prediction.entity.Game;
import com.cricket.ipl2020.prediction.entity.Users;
import com.cricket.ipl2020.prediction.repository.GameRepository;
import com.cricket.ipl2020.prediction.repository.UserRepository;
import com.cricket.ipl2020.prediction.service.UserService;
import org.apache.tomcat.jni.Local;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    GameRepository gameRepository;

    @Override
    public List<Users> loginUser(String username, String password) {
        return userRepository.loginUser(username, password);

    }

    @Override
    public Optional<Game> fetchGame(Integer gameId)
    {
        return gameRepository.findById(gameId);
    }

    @Override
    public List<Game> fetchGameByDate(LocalDate date)
    {
        return gameRepository.findGamesByDate(date);
    }
}
