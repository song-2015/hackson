package com.hackson.domain;

import com.hackson.entity.ClientEntity;

/**
 * Created by song on 2023/9/21.
 */
public class ClientCustomValDomain extends BaseClientDomain {

    public ClientCustomValDomain() {}

    public ClientCustomValDomain(ClientEntity clientEntity, Double customValue) {
        this.clientId = clientEntity.getClientId();
        this.clientName = clientEntity.getClientName();
        this.customValue = customValue;
    }

    private Double customValue;

    public Double getCustomValue() {
        return customValue;
    }

    public void setCustomValue(Double customValue) {
        this.customValue = customValue;
    }
}
