package com.example.test.model;

public class ManualControl {

    int manual;

    public ManualControl(int manualControl) {
        this.manual = manualControl;
    }

    @Override
    public String toString() {
        return "ManualControl{" +
                "manual=" + manual +
                '}';
    }
}
