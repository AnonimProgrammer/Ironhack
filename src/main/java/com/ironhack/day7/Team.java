package com.ironhack.day7;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Team {
    @SerializedName("team_name")
    private String teamName;

    private String city;
    private int championships;
    private boolean active;

    @SerializedName("head_coach")
    private Coach headCoach;

    private List<Player> roaster;

    public Team(String teamName, String city, int championships, boolean active, Coach headCoach, List<Player> roaster) {
        this.teamName = teamName;
        this.city = city;
        this.championships = championships;
        this.active = active;
        this.headCoach = headCoach;
        this.roaster = roaster;
    }

    public String getTeamName() {
        return teamName;
    }

    public String getCity() {
        return city;
    }

    public int getChampionships() {
        return championships;
    }

    public boolean isActive() {
        return active;
    }

    public Coach getHeadCoach() {
        return headCoach;
    }

    public List<Player> getRoaster() {
        return roaster;
    }
}
