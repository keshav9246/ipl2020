package com.cricket.ipl2020.prediction;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class controller {


    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public  void login(String username, String pwd)
    {
        System.out.print(username+""+pwd);
    }
}
