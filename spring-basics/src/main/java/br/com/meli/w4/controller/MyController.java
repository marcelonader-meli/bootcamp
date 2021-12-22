package br.com.meli.w4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

    @GetMapping("/ping")
    @ResponseBody
    public String ping(){
        return "ping";
    }
}
