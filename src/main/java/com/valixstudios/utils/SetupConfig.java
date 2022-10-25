package com.valixstudios.utils;

import lombok.Getter;
import lombok.Setter;
import org.simpleyaml.configuration.file.YamlFile;

import java.io.File;
import java.io.IOException;

public class SetupConfig {

    @Getter
    @Setter
    private static Integer maxPlayers, minPlayers, playersForStart, spawnTimeBronze,
            spawnTimeIron, spawnTimeGold, maxTeams, maxPlayersPerTeam;

    public static void load() throws IOException {
        YamlFile file = YamlFile.loadConfiguration(new File("./config.yml"));

        setMaxPlayers(file.getInt("maxPlayers"));
        setMinPlayers(file.getInt("minPlayers"));
        setPlayersForStart(file.getInt("playersForStart"));
        setSpawnTimeBronze(file.getInt("spawnTimeBronze"));
        setSpawnTimeIron(file.getInt("spawnTimeIron"));
        setSpawnTimeGold(file.getInt("spawnTimeGold"));
        setMaxTeams(file.getInt("maxTeams"));
        setMaxPlayersPerTeam(file.getInt("maxPlayersPerTeam"));
    }
}
