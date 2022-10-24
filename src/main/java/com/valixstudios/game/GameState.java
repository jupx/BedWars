package com.valixstudios.game;

import lombok.Getter;
import lombok.Setter;

public enum GameState {
    LOBBY, INGAME, ENDING;

    @Getter
    @Setter
    private static GameState gameState;
}
