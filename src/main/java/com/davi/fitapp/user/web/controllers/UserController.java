package com.davi.fitapp.user.web.controllers;

import com.davi.fitapp.user.domain.dtos.UserRequest;
import com.davi.fitapp.user.domain.dtos.UserResponse;
import com.davi.fitapp.user.domain.services.impl.UserServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("users")
public class UserController {
    private final UserServiceImpl userService;

    public UserController(UserServiceImpl userService) {
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity<UserResponse> saveUser(@RequestBody UserRequest userRequest) {
        UserResponse user = this.userService.createUser(userRequest);
        return ResponseEntity.status(201).body(user);
    }

    @GetMapping("{uuid}")
    public ResponseEntity<UserResponse> findUserByUuid(@PathVariable UUID uuid) {
        UserResponse userResponse = this.userService.findUserByUuid(uuid);
        return ResponseEntity.ok(userResponse);
    }

    @PutMapping("{uuid}")
    public ResponseEntity<UserResponse> updateUser(@PathVariable UUID uuid, @RequestBody UserRequest userRequest) {
        UserResponse userResponse = this.userService.updateUser(uuid, userRequest);
        return ResponseEntity.ok(userResponse);
    }

    @DeleteMapping("{uuid}")
    public ResponseEntity<Void> deleteUser(@PathVariable UUID uuid) {
        this.userService.deleteUserByUuid(uuid);
        return ResponseEntity.noContent().build();
    }
}
