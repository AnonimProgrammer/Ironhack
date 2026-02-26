package com.ironhack.week2.day7;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.List;

public class GsonSerializationDemo {
    public static void run() {
        Gson gson = new Gson();

        Player player1 = new Player("Stephen Curry", 30, "Guard", true);
        Player player2 = new Player("MJ", 10, "Guard", true);
        Player player3 = new Player("SN", 90, "Guard", true);

        String playerJson = gson.toJson(player1);
        System.out.println("JSON: " + playerJson);

        // Customize serialization output
        Gson prettyGson = new GsonBuilder().setPrettyPrinting().create();
        String prettyJson = prettyGson.toJson(player1);
        System.out.println("Pretty JSON: " + prettyJson);

        // Nested serialization
        List<Player> players = List.of(player1, player2, player3);
        Coach coach = new Coach("Best coach", 35);

        Team team = new Team(
                "All time bests",
                "No city",
                0,
                true,
                coach,
                players
        );

        String teamJson = prettyGson.toJson(team);
        System.out.println("Team JSON: " + teamJson);
    }
}
