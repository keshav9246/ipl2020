package com.cricket.ipl2020.prediction.service;


import com.cricket.ipl2020.prediction.entity.Game;
import com.cricket.ipl2020.prediction.entity.Users;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface UserService {

     List<Users> loginUser(String userName, String password);

    public Optional<Game> fetchGame(Integer gameId);
    public List<Game> fetchGameByDate(LocalDate date);
}
