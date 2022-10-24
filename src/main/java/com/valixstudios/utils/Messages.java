package com.valixstudios.utils;

import cn.nukkit.Player;
import cn.nukkit.Server;

public class Messages {
    public static void sendMessagesToAll(String message) {
        for(Player player : Server.getInstance().getOnlinePlayers().values()) {
            player.sendMessage(message);
        }
    }
}
