package org.gox.netty.server.encoder;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;
import org.gox.netty.entity.PayloadType;
import org.gox.netty.entity.PlayerConnected;
import org.gox.netty.entity.PlayerUpdate;

import java.nio.ByteBuffer;

public class PlayerUpdateResponseDataEncoder extends MessageToByteEncoder<PlayerUpdate> {

    @Override
    protected void encode(ChannelHandlerContext ctx, PlayerUpdate msg, ByteBuf out) throws Exception {
        out.writeBytes(msg.serialize());
    }
}
