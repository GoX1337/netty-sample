package org.gox.netty.entity;

import java.nio.ByteBuffer;

public abstract class PlayerEvent implements EventSerializable {

    protected int playerId;
    protected int x;
    protected int y;
    protected int direction;

    public PlayerEvent(int playerId, int x, int y, int direction) {
        this.playerId = playerId;
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    protected abstract int getPayloadTypeId();

    @Override
    public byte[] serialize() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(4 * 5);
        byteBuffer.putInt(getPayloadTypeId());
        byteBuffer.putInt(this.playerId);
        byteBuffer.putInt(this.x);
        byteBuffer.putInt(this.y);
        byteBuffer.putInt(this.direction);
        return byteBuffer.array();
    }
}
