package com.valixstudios.events;

import cn.nukkit.event.EventHandler;
import cn.nukkit.event.Listener;
import cn.nukkit.event.level.WeatherChangeEvent;
import com.valixstudios.game.GameState;

public class WeatherChangeListener implements Listener {
    @EventHandler
    public void onWeatherChangeEvent(WeatherChangeEvent event) {
        if (GameState.getGameState() == GameState.LOBBY) {
            event.setCancelled();
        }
    }
}
