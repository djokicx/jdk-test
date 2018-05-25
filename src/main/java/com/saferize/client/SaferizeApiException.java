/*
 * Saferize API
 * The Saferize API is organized around [REST](http://en.wikipedia.org/wiki/Representational_State_Transfer). Our API has predictable, resource-oriented URLs, and uses HTTP response codes to indicate API errors. We support [cross-origin resource sharing](https://en.wikipedia.org/wiki/Cross-origin_resource_sharing), allowing you to interact securely with our API from a client-side web application (though you should never expose your secret API key in any public website's client-side code). [JSON](http://www.json.org/) is returned by all API responses, including errors.  To make the API as explorable as possible, accounts have test mode and live mode API keys. There is no \"switch\" for changing between modes, just use the appropriate key to perform a live or test transaction.  Be sure to subscribe to Saferize's API announcements mailing list to receive information on new additions and changes.  The requests in the right sidebar are designed to work as is.  `NOTE` - We HIGHLY suggest using Saferize's [Developer Console Tool](https://console.saferize.com) as opposed to making raw calls. 
 *
 * OpenAPI spec version: v1
 * Contact: devs@saferize.com
 *
 */


package com.saferize.client;

import java.util.Map;
import java.util.List;

public class SaferizeApiException extends Exception {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    
    private int code = 0;
    private Map<String, List<String>> responseHeaders = null;
    private String responseBody = null;

    public SaferizeApiException() {}

    public SaferizeApiException(Throwable throwable) {
        super(throwable);
    }

    public SaferizeApiException(String message) {
        super(message);
    }

    public SaferizeApiException(String message, Throwable throwable, int code, Map<String, List<String>> responseHeaders, String responseBody) {
        super(message, throwable);
        this.code = code;
        this.responseHeaders = responseHeaders;
        this.responseBody = responseBody;
    }

    public SaferizeApiException(String message, int code, Map<String, List<String>> responseHeaders, String responseBody) {
        this(message, (Throwable) null, code, responseHeaders, responseBody);
    }

    public SaferizeApiException(String message, Throwable throwable, int code, Map<String, List<String>> responseHeaders) {
        this(message, throwable, code, responseHeaders, null);
    }

    public SaferizeApiException(int code, Map<String, List<String>> responseHeaders, String responseBody) {
        this((String) null, (Throwable) null, code, responseHeaders, responseBody);
    }

    public SaferizeApiException(int code, String message) {
        super(message);
        this.code = code;
    }

    public SaferizeApiException(int code, String message, Map<String, List<String>> responseHeaders, String responseBody) {
        this(code, message);
        this.responseHeaders = responseHeaders;
        this.responseBody = responseBody;
    }

    /**
     * Get the HTTP status code.
     *
     * @return HTTP status code
     */
    public int getCode() {
        return code;
    }

    /**
     * Get the HTTP response headers.
     *
     * @return A map of list of string
     */
    public Map<String, List<String>> getResponseHeaders() {
        return responseHeaders;
    }

    /**
     * Get the HTTP response body.
     *
     * @return Response body in the form of string
     */
    public String getResponseBody() {
        return responseBody;
    }
}
