package com.hackson.entity;

/**
 * Created by song on 2023/9/21.
 */
public class ClientEntity {
    private String clientId;
    private String clientName;
    private Double netAssets;
    private String establishTime;
    private String region;
    private Integer numberOfFunds;

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

    public String getEstablishTime() {
        return establishTime;
    }

    public void setEstablishTime(String establishTime) {
        this.establishTime = establishTime;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Integer getNumberOfFunds() {
        return numberOfFunds;
    }

    public void setNumberOfFunds(Integer numberOfFunds) {
        this.numberOfFunds = numberOfFunds;
    }
}
