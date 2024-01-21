package org.gox.netty.client.encoder;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;
import org.gox.netty.entity.PayloadType;
import org.gox.netty.entity.PlayerConnection;
import org.gox.netty.entity.PlayerUpdate;

public class PlayerUpdateRequestDataEncoder extends MessageToByteEncoder<PlayerUpdate> {

    @Override
    protected void encode(ChannelHandlerContext ctx, PlayerUpdate msg, ByteBuf out) throws Exception {
        out.writeBytes(msg.serialize());
    }
}
