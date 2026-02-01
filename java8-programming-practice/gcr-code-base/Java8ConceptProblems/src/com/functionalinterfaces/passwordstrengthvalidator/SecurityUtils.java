package com.functionalinterfaces.passwordstrengthvalidator;

public interface SecurityUtils {
	 static boolean isStrongPassword(String password) {

	        // Minimum 8 characters
	        if (password.length() < 8) {
	            return false;
	        }

	        // Must contain at least one uppercase letter
	        if (!password.chars().anyMatch(Character::isUpperCase)) {
	            return false;
	        }

	        // Must contain at least one lowercase letter
	        if (!password.chars().anyMatch(Character::isLowerCase)) {
	            return false;
	        }

	        // Must contain at least one digit
	        if (!password.chars().anyMatch(Character::isDigit)) {
	            return false;
	        }

	        return true;
	    }

}
