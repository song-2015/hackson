package com.hackson.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by song on 2023/9/21.
 */
@Entity(name = "ssa_clients")
public class ClientEntity {
    @Id
    private String clientId;
    private String clientName;
    private Double netAssets;
    private String establishedTime;
    private String region;
    private Integer numOfFunds;

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

    public Double getNetAssets() {
        return netAssets;
    }

    public void setNetAssets(Double netAssets) {
        this.netAssets = netAssets;
    }

    public String getEstablishedTime() {
        return establishedTime;
    }

    public void setEstablishedTime(String establishedTime) {
        this.establishedTime = establishedTime;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Integer getNumOfFunds() {
        return numOfFunds;
    }

    public void setNumOfFunds(Integer numOfFunds) {
        this.numOfFunds = numOfFunds;
    }
}
