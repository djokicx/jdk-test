package com.saferize.client.auth;

import java.util.Map;

public interface Authentication {
    /**
     * Apply authentication settings to header and query params.
     *
     * @param headerParams Map of header parameters
     */
    void applyToParams(Map<String, String> headerParams);
}
