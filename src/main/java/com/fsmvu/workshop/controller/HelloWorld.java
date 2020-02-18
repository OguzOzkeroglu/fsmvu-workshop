package com.fsmvu.workshop.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Oguz Ozkeroglu
 * Created on 2020.02.18
 */

@RestController
@RequestMapping("/api/v1")
public class HelloWorld {

    @GetMapping("/hello-world")
    public ResponseEntity<String> helloWorld() {
        return ResponseEntity.ok("Hello World.");
    }
}
