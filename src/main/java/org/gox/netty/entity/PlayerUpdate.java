package org.gox.netty.entity;

public class PlayerUpdate extends PlayerEvent {

    public PlayerUpdate(int playerId, int x, int y, int direction) {
        super(playerId, x, y, direction);
    }

    @Override
    protected int getPayloadTypeId() {
        return PayloadType.PLAYER_UPDATE.getValue();
    }

    @Override
    public String toString() {
        return "PlayerUpdate{" +
                "playerId=" + playerId +
                ", x=" + x +
                ", y=" + y +
                ", direction=" + direction +
                '}';
    }
}
