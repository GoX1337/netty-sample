package org.gox.netty.client;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import org.gox.netty.entity.*;

public class ClientHandler extends ChannelInboundHandlerAdapter {

    private boolean isConnected = false;
    private Player player = null;

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        PlayerConnection msg = new PlayerConnection();
        System.out.println("Send " + msg);
        ctx.writeAndFlush(msg);
    }

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        System.out.println("Receive " + msg);

        if (msg instanceof PlayerConnected) {
            isConnected = true;
        } else if (msg instanceof PlayerSpawn) {

        } else if (msg instanceof PlayerUpdate) {

        }

        //ctx.close();
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        super.exceptionCaught(ctx, cause);
    }
}
