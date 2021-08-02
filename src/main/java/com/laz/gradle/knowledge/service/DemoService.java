package com.laz.gradle.knowledge.service;

import org.springframework.stereotype.Service;

@Service
public class DemoService {
    public int test(int i) {
        if (i == 1) {
            return 1;
        }
        if (i == 2) {
            return 2;
        }
        return 3;
    }
}
