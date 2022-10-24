package com.valixstudios.events;

import cn.nukkit.event.EventHandler;
import cn.nukkit.event.Listener;
import cn.nukkit.event.inventory.InventoryPickupItemEvent;
import com.valixstudios.game.GameState;

public class InventoryPickupItemListener implements Listener {
    @EventHandler
    public void onInventoryPickupItemEvent(InventoryPickupItemEvent event) {
        if (GameState.getGameState() == GameState.LOBBY) {
            event.setCancelled();
        }
    }
}
