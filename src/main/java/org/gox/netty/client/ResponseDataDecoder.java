package org.gox.netty.client;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ReplayingDecoder;
import org.gox.netty.entity.PayloadType;
import org.gox.netty.entity.PlayerConnected;
import org.gox.netty.entity.PlayerSpawn;
import org.gox.netty.entity.PlayerUpdate;

import java.util.List;

public class ResponseDataDecoder extends ReplayingDecoder<Object> {

    @Override
    protected void decode(ChannelHandlerContext ctx, ByteBuf in, List<Object> out) throws Exception {
        PayloadType payloadType = PayloadType.fromValue(in.readInt());

        Object o = switch (payloadType) {
            case PLAYER_CONNECTED   -> new PlayerConnected(in.readInt(), in.readInt(), in.readInt(), in.readInt());
            case PLAYER_SPAWN       -> new PlayerSpawn(in.readInt(), in.readInt(), in.readInt(), in.readInt());
            case PLAYER_UPDATE      -> new PlayerUpdate(in.readInt(), in.readInt(), in.readInt(), in.readInt());
            default -> null;
        };

        out.add(o);
    }
}