package com.cricket.ipl2020.prediction.service;


import com.cricket.ipl2020.prediction.entity.Users;

import java.util.List;

public interface UserService {

     List<Users> loginUser(String userName, String password);
}
