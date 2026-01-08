package com.day6.MediStore;

import java.time.LocalDate;

public interface ISellable {
     double sell(int units);
     boolean checkExpiry();
}
