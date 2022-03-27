package controllers;

import lombok.RequiredArgsConstructor;
import models.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import services.UserService;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/user")

public class UserController {
    private final UserService userService;

    @GetMapping("/{id}")
    public User findById(@PathVariable Long id) {
        return userService.findById(id).orElseThrow(() -> new IllegalArgumentException("Product id = " + id + " not found"));
    }
}
