package com.valixstudios.events;

import cn.nukkit.event.EventHandler;
import cn.nukkit.event.Listener;
import cn.nukkit.event.entity.EntityDamageEvent;
import com.valixstudios.game.GameState;

public class EntityDamageListener implements Listener {
    @EventHandler
    public void onEntityDamageEvent(EntityDamageEvent event) {
        if (GameState.getGameState() == GameState.LOBBY) {
            event.setCancelled();
        }
    }
}
