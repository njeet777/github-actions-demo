package com.example.configDemo.demo.controller;


import com.example.configDemo.demo.config.UserConfig;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/config")
@RequiredArgsConstructor
@Slf4j
public class UserController {

    private final UserConfig userConfig;

    @GetMapping("/user")
    public UserConfig getUserConfig() {
        log.info("user config has loaded succesfully, hence returning the response");
        return userConfig;
    }
}
