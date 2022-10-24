package com.valixstudios.events;

import cn.nukkit.Player;
import cn.nukkit.event.EventHandler;
import cn.nukkit.event.Listener;
import cn.nukkit.event.player.PlayerJoinEvent;
import cn.nukkit.item.Item;
import com.valixstudios.game.GameState;

public class JoinListener implements Listener {
    
    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();

        if (GameState.getGameState() == GameState.LOBBY) {
            player.setGamemode(Player.ADVENTURE);
            player.setMaxHealth(20);
            player.getInventory().clearAll();
            player.setFoodEnabled(false);
            player.getInventory().setItem(0, Item.get(Item.BED).setCustomName("§eTeam Selector §6(right click)"));
            player.getInventory().setItem(1, Item.get(Item.PAPER).setCustomName("§dForce Map §6(right click)"));
        }
    }

}
