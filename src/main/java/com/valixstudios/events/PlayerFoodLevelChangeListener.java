package com.valixstudios.events;

import cn.nukkit.event.EventHandler;
import cn.nukkit.event.Listener;
import cn.nukkit.event.player.PlayerFoodLevelChangeEvent;
import com.valixstudios.game.GameState;

public class PlayerFoodLevelChangeListener implements Listener {
    @EventHandler
    public void onPlayerFoodLevelChangeEvent(PlayerFoodLevelChangeEvent event) {
        if (GameState.getGameState() == GameState.LOBBY) {
            event.setCancelled();
        }
    }
}
