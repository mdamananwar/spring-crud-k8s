package com.kubernetes.trial.controller;

import com.kubernetes.trial.entity.User;
import com.kubernetes.trial.services.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("trial")
public class TestController {

    private final UserService userService;

    public TestController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/hello")
    public ResponseEntity<?> hello(){
        return  ResponseEntity.ok("hello");
    }

    @PostMapping("/users")
    public ResponseEntity<?> user(@RequestBody User user){
        return userService.user(user);
    }
}
