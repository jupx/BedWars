package com.valixstudios.events;

import cn.nukkit.event.EventHandler;
import cn.nukkit.event.Listener;
import cn.nukkit.event.inventory.InventoryPickupArrowEvent;
import com.valixstudios.game.GameState;

public class InventoryPickupArrowListener implements Listener {
    @EventHandler
    public void onInventoryPickupArrowEvent(InventoryPickupArrowEvent event) {
        if (GameState.getGameState() == GameState.LOBBY) {
            event.setCancelled();
        }
    }
}
