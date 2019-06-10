package com.anderson.cadastro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by Anderson on 19/05/2019.
 */

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {

        return "/home";
    }
}
