package com.valixstudios.utils;

import cn.nukkit.utils.Config;
import com.valixstudios.BedWars;
import lombok.Getter;
import lombok.Setter;

import java.io.File;
import java.util.LinkedHashMap;

public class SetupConfig {

    @Getter
    @Setter
    private static Integer maxPlayers, minPlayers, playersForStart, spawnTimeBronze,
            spawnTimeIron, spawnTimeGold, maxTeams, maxPlayersPerTeam;

    public static Config config;

    public static void loadConfig() {
        config = new Config(new File(BedWars.getInstance().getDataFolder(), "config.yml"), Config.YAML, new LinkedHashMap<String, Object>() {
            {
                put("playersMax", 16);
                put("minPlayers", 8);
                put("playersForStart", 16);
                put("spawnTimeBronze", 1);
                put("spawnTimeIron", 8);
                put("spawnTimeGold", 25);
                put("maxTeams", 4);
                put("maxPlayerPerTeam", 4);
            }
        });
        config.save();

        setMaxPlayers(config.getInt("playersMax"));
        setMinPlayers(config.getInt("minPlayers"));
        setPlayersForStart(config.getInt("playersForStart"));
        setSpawnTimeBronze(config.getInt("spawnTimeBronze"));
        setSpawnTimeIron(config.getInt("spawnTimeIron"));
        setSpawnTimeGold(config.getInt("spawnTimeGold"));
        setMaxTeams(config.getInt("maxTeams"));
        setMaxPlayersPerTeam(config.getInt("maxPlayerPerTeam"));
    }

    public static void saveConfig() {
        config.save();
    }

    public static void loadStrings() {

    }

    public static void saveStrings() {

    }
}
