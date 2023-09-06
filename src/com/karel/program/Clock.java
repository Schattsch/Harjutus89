package com.karel.program;

public class Clock {
    private BoundedCounter hours;
    private BoundedCounter minutes;
    private BoundedCounter seconds;

    public Clock(int hoursAtBeginning, int minutesAtBeginning, int secondsAtBeginning) {
        this.hours = new BoundedCounter(23, hoursAtBeginning);
        this.minutes = new BoundedCounter(59, minutesAtBeginning);
        this.seconds = new BoundedCounter(59, secondsAtBeginning);
    }

    public void tick() {
        this.seconds.next();

        if (this.seconds.getValue() == 0) {
            this.minutes.next();

            if (this.minutes.getValue() == 0) {
                this.hours.next();
            }
        }
    }

    public String toString() {
        return String.format("%02d:%02d:%02d", this.hours.getValue(), this.minutes.getValue(), this.seconds.getValue());
    }
}
