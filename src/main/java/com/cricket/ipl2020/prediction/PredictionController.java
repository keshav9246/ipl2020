package com.cricket.ipl2020.prediction;

import com.cricket.ipl2020.prediction.entity.Users;
import com.cricket.ipl2020.prediction.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PredictionController {

    @Autowired
    UserService userService;

    @PostMapping(value = "/login")
    public List<Users> login(@RequestParam("username") String username, @RequestParam("password")String pwd) {
            return userService.loginUser(username, pwd);
    }


}
