package com.arij.hrms.controllers;

import com.arij.hrms.dto.auth.AuthenticationResponse;
import com.arij.hrms.dto.auth.LoginRequest;
import com.arij.hrms.dto.auth.RegisterRequest;
import com.arij.hrms.services.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping("/register")
    public AuthenticationResponse register(@RequestBody RegisterRequest request) {
        return authService.register(request);
    }

    @PostMapping("/login")
    public AuthenticationResponse login(@RequestBody LoginRequest request) {
        return authService.login(request);
    }
}