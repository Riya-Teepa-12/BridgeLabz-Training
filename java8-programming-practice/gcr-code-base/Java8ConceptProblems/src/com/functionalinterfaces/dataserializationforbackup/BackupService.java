package com.functionalinterfaces.dataserializationforbackup;

import java.util.List;

public class BackupService {
	public static void backupData(List<Object> objects) {
        for (Object obj : objects) {
            if (obj instanceof Backupable) {
                System.out.println("Backing up: " + obj);
            } else {
                System.out.println("Skipping: " + obj);
            }
        }
    }

}
