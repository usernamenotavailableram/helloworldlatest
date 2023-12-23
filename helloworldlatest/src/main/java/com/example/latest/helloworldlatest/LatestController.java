package com.example.latest.helloworldlatest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LatestController {
    @GetMapping("api")
    public String nothing()
    {
        return "Hello api";
    }
}

