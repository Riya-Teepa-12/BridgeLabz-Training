package com.Day1.optionalclassexamples.systemutility;

import java.util.Optional;

public class UserPreferences {
    private String theme;
    private String language;

    public UserPreferences(String theme, String language) {
        this.theme = theme;
        this.language = language;
    }

    public Optional<String> getTheme() {
        return Optional.ofNullable(theme);
    }

    public Optional<String> getLanguage() {
        return Optional.ofNullable(language);
    }
}
