package com.collectionsGenerics.smartwarehousemanagement;

import java.util.*;

public class WarehouseUtil {
	public static void displayAllItems(List<? extends WarehouseItem> items) {
        for (WarehouseItem item : items) {
            item.displayDetails();
        }
    }
}
