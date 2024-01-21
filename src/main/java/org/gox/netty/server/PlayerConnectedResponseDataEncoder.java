package org.gox.netty.server;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;
import org.gox.netty.entity.PayloadType;
import org.gox.netty.entity.PlayerConnected;

import java.nio.ByteBuffer;

public class PlayerConnectedResponseDataEncoder extends MessageToByteEncoder<PlayerConnected> {

    @Override
    protected void encode(ChannelHandlerContext ctx, PlayerConnected msg, ByteBuf out) throws Exception {
        out.writeBytes(msg.serialize());
    }
}
