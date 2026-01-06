package com.day4.eventmanagementplatform;

public class ConferenceEvent extends Event {

    public ConferenceEvent(int id, String name, String loc, String date,
                            int attendees, double venue, double service, double discount) {
        super(id, name, loc, date, attendees, venue, service, discount);
    }

    public void schedule() {
        System.out.println("Conference event scheduled. Cost: " + calculateCost());
    }

    public void reschedule(String newDate) {
        this.date = newDate;
        System.out.println("Conference event rescheduled");
    }

    public void cancel() {
        System.out.println("Conference event cancelled");
    }

}
