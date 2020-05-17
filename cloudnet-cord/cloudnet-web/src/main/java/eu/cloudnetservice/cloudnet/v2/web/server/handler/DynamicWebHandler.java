package eu.cloudnetservice.cloudnet.v2.web.server.handler;

import eu.cloudnetservice.cloudnet.v2.web.server.util.PathProvider;
import eu.cloudnetservice.cloudnet.v2.web.server.util.QueryDecoder;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.http.FullHttpResponse;
import io.netty.handler.codec.http.HttpRequest;

/**
 * Web handler that handles dynamic requests
 */
public abstract class DynamicWebHandler {

    /**
     * Handle a dynamic request.
     *
     * @param channelHandlerContext the Netty context this request originates from
     * @param queryDecoder          a decoder for possible query parameters
     * @param pathProvider          a path provider with the provided parameters
     * @param httpRequest           the HTTP request that was received and should be handled
     *
     * @return the full response to the HTTP client
     *
     * @throws Exception when any error occurred during the handling of the request
     */
    public abstract FullHttpResponse handleRequest(ChannelHandlerContext channelHandlerContext,
                                                   QueryDecoder queryDecoder,
                                                   PathProvider pathProvider,
                                                   HttpRequest httpRequest) throws Exception;

}