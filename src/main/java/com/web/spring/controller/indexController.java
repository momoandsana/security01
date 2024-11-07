package com.web.spring.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class indexController {

    @GetMapping("/")
    public String index() {
        log.info("/ 요청되었습니다...");
        return "index result";
    }
}

