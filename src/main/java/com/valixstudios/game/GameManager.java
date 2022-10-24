package com.valixstudios.game;
import cn.nukkit.Server;
import cn.nukkit.scheduler.AsyncTask;
import com.valixstudios.BedWars;
import com.valixstudios.utils.Countdown;

public class GameManager {
    public static void startTimer() {
        Server.getInstance().getScheduler().scheduleDelayedRepeatingTask(BedWars.getInstance(), new AsyncTask() {
            @Override
            public void onRun() {
                if (GameState.getGameState() == GameState.LOBBY) {
                    Countdown.start();
                } else if (GameState.getGameState() == GameState.INGAME) {
                    System.out.println("INGAME");
                } else if (GameState.getGameState() == GameState.ENDING) {
                    System.out.println("ENDING");
                }
            }
        }, 20, 20);
    }
}
