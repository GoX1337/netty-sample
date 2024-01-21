package org.gox.netty.entity;

public class PlayerConnected extends PlayerEvent {

    public PlayerConnected(int playerId, int x, int y, int direction) {
        super(playerId, x, y, direction);
    }

    @Override
    protected int getPayloadTypeId() {
        return PayloadType.PLAYER_CONNECTED.getValue();
    }

    @Override
    public String toString() {
        return "PlayerConnected{" +
                "playerId=" + playerId +
                ", x=" + x +
                ", y=" + y +
                ", direction=" + direction +
                '}';
    }
}
