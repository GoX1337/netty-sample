package org.gox.netty.entity;


public class PlayerDisconnected implements EventSerializable {

    private int playerId;

    public PlayerDisconnected(int playerId) {
        this.playerId = playerId;
    }

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    @Override
    public String toString() {
        return "PlayerDisconnected{" +
                "playerId=" + playerId +
                '}';
    }

    @Override
    public byte[] serialize() {
        return new byte[0];
    }
}
