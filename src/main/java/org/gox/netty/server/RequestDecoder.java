package org.gox.netty.server;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ReplayingDecoder;
import org.gox.netty.entity.PayloadType;
import org.gox.netty.entity.PlayerConnection;
import org.gox.netty.entity.PlayerUpdate;

import java.util.List;

public class RequestDecoder extends ReplayingDecoder<PlayerConnection> {

    @Override
    protected void decode(ChannelHandlerContext ctx, ByteBuf in, List<Object> out) throws Exception {
        PayloadType payloadType = PayloadType.fromValue(in.readInt());

        Object o = switch (payloadType) {
            case PLAYER_CONNECTION ->  new PlayerConnection();
            case PLAYER_UPDATE ->  new PlayerUpdate(in.readInt(), in.readInt(), in.readInt(), in.readInt());
            default -> null;
        };

        out.add(o);
    }
}
