package com.ironhack.day7;

import com.google.gson.Gson;

public class GsonDeserializationDemo {
    public static void run() {
        Gson gson = new Gson();

        String playerJson = """
                {
                    "name": "Some player",
                    "jersey_number": 9,
                    "position": "Guard",
                    "starter": true
                }
                """;

        // System.out.println("JSON: " + playerJson);
        Player player = gson.fromJson(playerJson, Player.class);
        System.out.println("Player: " + player);

        String coachJson = """
            {
                "name": "Some coach",
                "year_experience": 30
            }
            """;

        Coach coach = gson.fromJson(coachJson, Coach.class);
        System.out.println("Coach: " + coach);
    }
}
