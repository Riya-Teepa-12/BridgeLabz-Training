package com.functionalinterfaces.passwordstrengthvalidator;

public class UsePassword {
	public static void main(String[] args) {

        String password1 = "Insurance2026";
        String password2 = "weakpass";

        boolean result1 = SecurityUtils.isStrongPassword(password1);
        boolean result2 = SecurityUtils.isStrongPassword(password2);

        System.out.println("Password1 strong: " + result1);
        System.out.println("Password2 strong: " + result2);
    }
	

}
