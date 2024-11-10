package com.practical.java8.features.app.practicejavaeight.controller;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class DemoController {

    @PutMapping("/update")
    public String updateElement(@RequestParam(name = "id") Optional<Integer> id) {
        System.out.println("ID from Request " + id);
        return id.map(integer -> "SuccessFully Received Id with " + integer).orElse("Id is not Present in the Request");
    }
}
