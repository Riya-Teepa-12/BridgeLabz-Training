package com.day4.eventmanagementplatform;

public class BirthdayEvent extends Event {

    public BirthdayEvent(int id, String name, String loc, String date,
                         int attendees, double venue, double service, double discount) {
        super(id, name, loc, date, attendees, venue, service, discount);
    }

    public void schedule() {
        System.out.println("Birthday event scheduled. Cost: " + calculateCost());
    }

    public void reschedule(String newDate) {
        this.date = newDate;
        System.out.println("Birthday event rescheduled");
    }

    public void cancel() {
        System.out.println("Birthday event cancelled");
    }

}
