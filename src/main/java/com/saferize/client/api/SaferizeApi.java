package com.saferize.client.api;

import com.saferize.client.ApiClient;

public class SaferizeApi {

    public static final String VERSION = "1";
    public static final String ACCEPT_HEADER = "application/vnd.saferize.com+json;version=" + VERSION;
    protected ApiClient apiClient;

    public SaferizeApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
}
