package org.gox.netty.entity;

public class Player {

    private int playerId;
    private int x;
    private int y;
    private int direction;

    public Player(int playerId, int x, int y, int direction) {
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

    @Override
    public String toString() {
        return "Player{" +
                "playerId=" + playerId +
                ", x=" + x +
                ", y=" + y +
                ", direction=" + direction +
                '}';
    }
}
