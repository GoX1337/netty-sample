package org.gox.netty.entity;

import java.util.Arrays;

public enum PayloadType {

    UNKNOWN(0),
    PLAYER_CONNECTION(1),
    PLAYER_CONNECTED(2),
    PLAYER_SPAWN(3),
    PLAYER_DISCONNECTED(4),
    PLAYER_UPDATE(5);

    private int value;

    PayloadType(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    public static PayloadType fromValue(int value) {
        return Arrays.stream(PayloadType.values())
                .filter(payloadType -> payloadType.value == value)
                .findFirst()
                .orElse(UNKNOWN);
    }
}
