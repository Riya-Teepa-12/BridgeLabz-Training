package com.functionalinterfaces.sensitivedatatagging;

import java.util.List;

public class EncryptionService {
	public static void processData(List<Object> dataObjects) {
        for (Object obj : dataObjects) {
            if (obj instanceof SensitiveData) {
                System.out.println("Encrypting sensitive data: " + obj);
            } else {
                System.out.println("Skipping non-sensitive data: " + obj);
            }
        }
    }

}
