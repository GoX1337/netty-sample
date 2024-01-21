package org.gox.netty.server.core;

import org.gox.netty.entity.Player;

public class GameServer {

    private int playerId = 1;

    public synchronized Player getNewPlayer() {
        return new Player(this.playerId++, 0, 0, 0);
    }
}
