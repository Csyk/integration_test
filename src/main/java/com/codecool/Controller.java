package com.codecool;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by csyk on 2017.04.04..
 */

@RestController
public class Controller {

    @RequestMapping("/")
    public String hello(){
        String response = "hello";
        return response;
    }
}
