package com.example.demo.service;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TestService {
    public List<String> getTestService() {
        return Arrays.asList("Jayant", "Google", "Doodle");
    }
}
