package com.example.getmesocialservice.resource;

import com.example.getmesocialservice.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserResource {

    @GetMapping("/user")
    public User getUser() {
        User user = new User("Daniel", "123 Avenue", 21, "google.com");
        return user;
    }
}
