package org.gox.netty.client;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;
import org.gox.netty.entity.PlayerConnection;

public class PlayerConnectionRequestDataEncoder extends MessageToByteEncoder<PlayerConnection> {

    @Override
    protected void encode(ChannelHandlerContext ctx, PlayerConnection msg, ByteBuf out) throws Exception {
        out.writeBytes(msg.serialize());
    }
}
