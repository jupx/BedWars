package com.valixstudios.game;

import cn.nukkit.Player;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;

public class TeamManager {

    @Getter
    @Setter
    public static HashMap<Player, Map> mapVoting;

}
