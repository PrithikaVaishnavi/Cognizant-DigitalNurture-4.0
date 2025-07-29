package com.cognizant.JWTAuthentication.controller;

import java.security.Key;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;

@RestController
public class AuthenticationController {

    private static final String SECRET_KEY = "your-256-bit-secret-key-that-is-long-enough-123456";
    private static final Key key = Keys.hmacShaKeyFor(SECRET_KEY.getBytes());

    @GetMapping("/authenticate")
    public Map<String, String> authenticate(Authentication authentication) {
        String username = authentication.getName(); 

        String token = Jwts.builder()
                .setSubject(username)
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + 1000 * 60 * 60)) 
                .signWith(key, SignatureAlgorithm.HS256) 
                .compact();

        Map<String, String> response = new HashMap<>();
        response.put("token", token);
        return response;
    }
}
