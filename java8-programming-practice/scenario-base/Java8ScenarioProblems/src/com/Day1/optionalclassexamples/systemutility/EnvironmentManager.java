package com.Day1.optionalclassexamples.systemutility;

import java.util.Optional;

public class EnvironmentManager {
    public Optional<String> getEnv(String key) {
        return Optional.ofNullable(System.getenv(key));
    }
}
