package com.ironhack.week2.day7;

import com.google.gson.annotations.SerializedName;

public class Coach {
    private String name;

    @SerializedName("year_experience")
    private int yearExperience;

    public Coach(String name, int yearExperience) {
        this.name = name;
        this.yearExperience = yearExperience;
    }

    public String getName() {
        return name;
    }

    public int getYearExperience() {
        return yearExperience;
    }

    @Override
    public String toString() {
        return "Coach{" +
                "name='" + name + '\'' +
                ", yearExperience=" + yearExperience +
                '}';
    }
}
