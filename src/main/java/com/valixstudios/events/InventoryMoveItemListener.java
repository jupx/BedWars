package com.valixstudios.events;

import cn.nukkit.event.EventHandler;
import cn.nukkit.event.Listener;
import cn.nukkit.event.inventory.InventoryMoveItemEvent;
import com.valixstudios.game.GameState;

public class InventoryMoveItemListener implements Listener {
    @EventHandler
    public void onInventoryMoveItemEvent(InventoryMoveItemEvent event) {
        if (GameState.getGameState() == GameState.LOBBY) {
            event.setCancelled();
        }
    }
}
