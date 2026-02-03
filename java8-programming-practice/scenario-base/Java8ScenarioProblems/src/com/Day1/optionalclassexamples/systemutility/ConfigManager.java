package com.Day1.optionalclassexamples.systemutility;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

class ConfigManager {
    private Map<String, String> config = new HashMap<>();

    public void setConfig(String key, String value) {
        config.put(key, value);
    }

    public Optional<String> getConfig(String key) {
        return Optional.ofNullable(config.get(key));
    }
}
