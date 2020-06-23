package com.practice.authcodeserver.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data @AllArgsConstructor
public class UserProfile {
    private String name;
    private String email;
}
