package com.ironhack.day7;

import com.google.gson.annotations.SerializedName;

public class Player {
    private String name;

    @SerializedName("jersey_number")
    private int jerseyNumber;

    private String position;
    private boolean starter;

    public Player(String name, int jerseyNumber, String position, boolean starter) {
        this.name = name;
        this.jerseyNumber = jerseyNumber;
        this.position = position;
        this.starter = starter;
    }

    public String getName() {
        return name;
    }

    public int getJerseyNumber() {
        return jerseyNumber;
    }

    public boolean isStarter() {
        return starter;
    }

    public String getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", jerseyNumber=" + jerseyNumber +
                ", position='" + position + '\'' +
                ", starter=" + starter +
                '}';
    }
}
