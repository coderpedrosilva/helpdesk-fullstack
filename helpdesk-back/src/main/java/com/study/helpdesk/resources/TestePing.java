package com.study.helpdesk.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ping")
public class TestePing {

    @GetMapping
    public String ping() {
        return "Pong";
    }
}