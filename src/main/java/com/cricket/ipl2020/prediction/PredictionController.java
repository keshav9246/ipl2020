package com.cricket.ipl2020.prediction;

import com.cricket.ipl2020.prediction.entity.Game;
import com.cricket.ipl2020.prediction.entity.Users;
import com.cricket.ipl2020.prediction.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@RestController
public class PredictionController {

    @Autowired
    UserService userService;

    @PostMapping(value = "/login")
    public List<Users> login(@RequestParam("username") String username, @RequestParam("password")String pwd) {
            return userService.loginUser(username, pwd);
    }

    @RequestMapping(value="/fetchGame", method = RequestMethod.GET)
    public Optional<Game> fetchGame(@RequestParam("gameId") Integer gameId){
        return userService.fetchGame(gameId);
    }

    @RequestMapping(value="/fetchGamesTomorrow", method = RequestMethod.GET)
    public List<Game> fetchGameByDate() {
        return userService.fetchGameByDate(LocalDate.now().plusDays(1));
    }
}
