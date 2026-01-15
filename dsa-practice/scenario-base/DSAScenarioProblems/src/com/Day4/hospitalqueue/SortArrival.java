package com.Day4.hospitalqueue;

import java.util.*;

public class SortArrival {

    public static List<ArrivalPatient> sortPatient(List<ArrivalPatient> list) {

        for (int i = 0; i < list.size() - 1; i++) {

            for (int j = 0; j < list.size() - 1 - i; j++) {

                if (list.get(j + 1).getCriticallyLevel() >
                    list.get(j).getCriticallyLevel()) {

                    ArrivalPatient temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
        return list;
    }
}
