package com.fangming.mq.chatBot.weChat;

import okhttp3.OkHttpClient;

/**
 * General interface for all we-Chat client implementations
 * <p>
 * This interface provides access to all client API implementations and services.
 *
 * @author  jack
 */
public interface WeChatClient {

    void init(OkHttpClient httpClient, WeChatClientConfig config);
}
