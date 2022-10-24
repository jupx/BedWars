package com.valixstudios;

import cn.nukkit.plugin.PluginBase;
import com.valixstudios.events.*;
import com.valixstudios.game.GameManager;
import com.valixstudios.game.GameState;
import lombok.Getter;

public class BedWars extends PluginBase {
    @Getter
    private static BedWars instance;

    @Override
    public void onEnable() {
        instance = this;

        BedWars.getInstance().getServer().getPluginManager().registerEvents(new EntityDamageListener(), BedWars.getInstance());
        BedWars.getInstance().getServer().getPluginManager().registerEvents(new InventoryMoveItemListener(), BedWars.getInstance());
        BedWars.getInstance().getServer().getPluginManager().registerEvents(new InventoryPickupArrowListener(), BedWars.getInstance());
        BedWars.getInstance().getServer().getPluginManager().registerEvents(new InventoryPickupItemListener(), BedWars.getInstance());
        BedWars.getInstance().getServer().getPluginManager().registerEvents(new JoinListener(), BedWars.getInstance());
        BedWars.getInstance().getServer().getPluginManager().registerEvents(new PlayerFoodLevelChangeListener(), BedWars.getInstance());
        BedWars.getInstance().getServer().getPluginManager().registerEvents(new PlayerInteractListener(), BedWars.getInstance());
        BedWars.getInstance().getServer().getPluginManager().registerEvents(new WeatherChangeListener(), BedWars.getInstance());

        GameState.setGameState(GameState.LOBBY);
        GameManager.startTimer();
    }

    @Override
    public void onDisable() {
    }
}
