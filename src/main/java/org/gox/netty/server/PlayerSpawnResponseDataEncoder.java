package org.gox.netty.server;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;
import org.gox.netty.entity.PayloadType;
import org.gox.netty.entity.PlayerConnected;
import org.gox.netty.entity.PlayerSpawn;

import java.nio.ByteBuffer;

public class PlayerSpawnResponseDataEncoder extends MessageToByteEncoder<PlayerSpawn> {

    @Override
    protected void encode(ChannelHandlerContext ctx, PlayerSpawn msg, ByteBuf out) throws Exception {
        out.writeBytes(msg.serialize());
    }
}
