package org.gox.netty.entity;

public class PlayerSpawn extends PlayerEvent {

    public PlayerSpawn(int playerId, int x, int y, int direction) {
        super(playerId, x, y, direction);
    }

    @Override
    protected int getPayloadTypeId() {
        return PayloadType.PLAYER_SPAWN.getValue();
    }

    @Override
    public String toString() {
        return "PlayerSpawn{" +
                "playerId=" + playerId +
                ", x=" + x +
                ", y=" + y +
                ", direction=" + direction +
                '}';
    }
}
