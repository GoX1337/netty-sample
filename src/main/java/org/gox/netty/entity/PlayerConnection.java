package org.gox.netty.entity;

import java.nio.ByteBuffer;

public class PlayerConnection implements EventSerializable {

    public PlayerConnection() {
    }

    @Override
    public byte[] serialize() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(4);
        byteBuffer.putInt(PayloadType.PLAYER_CONNECTION.getValue());
        return byteBuffer.array();
    }
}
