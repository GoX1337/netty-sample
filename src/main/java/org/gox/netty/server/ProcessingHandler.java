package org.gox.netty.server;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.channel.group.ChannelGroup;
import io.netty.channel.group.DefaultChannelGroup;
import io.netty.util.concurrent.GlobalEventExecutor;
import org.gox.netty.entity.PlayerConnected;
import org.gox.netty.entity.PlayerConnection;
import org.gox.netty.entity.PlayerSpawn;

public class ProcessingHandler extends ChannelInboundHandlerAdapter {

    private final GameServer gameServer;
    private static final ChannelGroup channels = new DefaultChannelGroup(GlobalEventExecutor.INSTANCE);

    public ProcessingHandler(GameServer gameServer) {
        this.gameServer = gameServer;
    }

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        if (msg instanceof PlayerConnection) {
            channels.add(ctx.channel());
            Player newPlayer = gameServer.getNewPlayer();
            PlayerConnected playerConnected = new PlayerConnected(newPlayer.id(), newPlayer.x(), newPlayer.y(), newPlayer.direction());
            ctx.writeAndFlush(playerConnected);

            PlayerSpawn playerSpawn = new PlayerSpawn(newPlayer.id(), newPlayer.x(), newPlayer.y(), newPlayer.direction());
            channels.writeAndFlush(playerSpawn, channel -> channel.id() != ctx.channel().id());
        }
    }
}
