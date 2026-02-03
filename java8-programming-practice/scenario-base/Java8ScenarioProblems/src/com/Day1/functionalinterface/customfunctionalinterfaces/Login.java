package com.Day1.functionalinterface.customfunctionalinterfaces;

@FunctionalInterface
interface LoginValidator {
    boolean validate(String username, String password);
}

public class Login {
    public static void main(String[] args) {

        LoginValidator validator =
                (user, pass) -> user.equals("admin") && pass.equals("1234");

        System.out.println("Login Success: " +
                validator.validate("admin", "1234"));
    }
}
