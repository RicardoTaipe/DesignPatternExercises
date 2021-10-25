package com.company.command;

public class Light {
    private String description;

    public Light(String description) {
        this.description = description;
    }

    public void on() {
        System.out.println("Light is On");
    }

    public void off() {
        System.out.println("Light is Off");
    }
}
