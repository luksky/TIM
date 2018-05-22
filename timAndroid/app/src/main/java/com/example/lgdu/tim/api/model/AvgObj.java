package com.example.lgdu.tim.api.model;

public class AvgObj {
    public String getAvg() {
        return String.valueOf(avg);
    }

    private final double avg;

    @Override
    public String toString() {
        return "AvgObj{" +
                "avg=" + avg +
                '}';
    }

    public AvgObj(double avg) {
        this.avg = avg;
    }
}
