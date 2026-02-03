package com.Day1.optionalclassexamples.systemutility;

public class SystemUtilityApp {
    public static void main(String[] args) {
        ConfigManager configManager = new ConfigManager();
        EnvironmentManager envManager = new EnvironmentManager();
        FileManager fileManager = new FileManager();
        ApiResponse apiResponse = new ApiResponse(null); // simulate missing value
        UserPreferences userPreferences = new UserPreferences(null, "English");

        // 1. Read config safely
        String dbUrl = configManager.getConfig("db.url")
                .orElse("jdbc:mysql://localhost:3306/defaultDb");
        System.out.println("DB URL: " + dbUrl);

        // 2. Fetch environment variable
        String javaHome = envManager.getEnv("JAVA_HOME")
                .orElse("JAVA_HOME not set");
        System.out.println("JAVA_HOME: " + javaHome);

        // 3. Return default file path if missing
        String filePath = fileManager.getFilePath("logFile")
                .orElse("/tmp/default.log");
        System.out.println("Log File Path: " + filePath);

        // 4. Handle API response safely
        String apiValue = apiResponse.getValue()
                .orElse("No value returned from API");
        System.out.println("API Value: " + apiValue);

        // 5. Fetch user preferences without null check
        String theme = userPreferences.getTheme().orElse("Light");
        String language = userPreferences.getLanguage().orElse("English");
        System.out.println("Theme: " + theme + ", Language: " + language);
    }
}
