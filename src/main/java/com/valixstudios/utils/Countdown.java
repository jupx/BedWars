package com.valixstudios.utils;

import cn.nukkit.Player;
import cn.nukkit.Server;
import com.valixstudios.game.GameState;
import lombok.Getter;

public class Countdown {
    @Getter
    private static Integer playerAnnounce = 8;
    @Getter
    private static Integer lobbyCount = 60;

    public static void start() {
        if (!(Server.getInstance().getOnlinePlayers().size() >= 2)) {
            lobbyCount = 60;
            for (Player player : Server.getInstance().getOnlinePlayers().values()) {
                player.setExperience(0, 0);
            }
            if (playerAnnounce == 0) {
                playerAnnounce = 15;
                int need = 2 - Server.getInstance().getOnlinePlayers().size();
                if (need == 1) {
                    Messages.sendMessagesToAll("§e" + need + " player §care required to start!");
                } else {
                    Messages.sendMessagesToAll("§e" + need + " more players §care required to start!");
                }
            } else {
                playerAnnounce--;
            }
        } else {
            if (lobbyCount == 0) {
                GameState.setGameState(GameState.INGAME);
                for (Player player : Server.getInstance().getOnlinePlayers().values()) {
                    player.setExperience(0, 0);
                    player.setGamemode(0);
                }
            } else {
                System.out.println(lobbyCount);
                for (Player player : Server.getInstance().getOnlinePlayers().values()) {
                    player.setExperience(0, lobbyCount);
                    player.setFoodEnabled(false);
                    player.setMaxHealth(20);
                }
                if (lobbyCount == 60 || lobbyCount == 30 || lobbyCount == 15 || lobbyCount == 10 || lobbyCount <= 5) {
                    if (lobbyCount == 1) {
                        Messages.sendMessagesToAll("§7Das Spiel startet in §f" + lobbyCount + " §7Sekunde");
                    } else {
                        Messages.sendMessagesToAll("§7Das Spiel startet in §f" + lobbyCount + " §7Sekunden");
                    }
                }
                lobbyCount--;
            }
        }
    }
}
