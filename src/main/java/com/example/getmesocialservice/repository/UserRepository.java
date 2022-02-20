package com.example.getmesocialservice.repository;

import com.example.getmesocialservice.model.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {
    public User getUser() {
        User user = new User("Daniel", "123 Avenue", 21, "google.com");
        return user;
    }
}
