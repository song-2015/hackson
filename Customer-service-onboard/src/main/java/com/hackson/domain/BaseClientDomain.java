package com.hackson.domain;

/**
 * Created by song on 2023/9/21.
 */
public class BaseClientDomain {
    protected String clientId;
    protected String clientName;

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }
}
