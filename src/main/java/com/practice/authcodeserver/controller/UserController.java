package com.practice.authcodeserver.controller;

import com.practice.authcodeserver.model.UserProfile;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserController {

    @CrossOrigin
    @GetMapping("/profile")
    public UserProfile profile(){
        User user = (User) SecurityContextHolder.getContext()
                .getAuthentication()
                .getPrincipal();
        String email = user.getUsername() + "@123.com";

        UserProfile profile = new UserProfile(user.getUsername(), email);
            return profile;
    }
}
