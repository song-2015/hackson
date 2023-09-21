package com.hackson.domain;

import com.hackson.entity.ClientEntity;
import org.springframework.beans.BeanUtils;

/**
 * Created by song on 2023/9/21.
 */
public class ClientDomain extends BaseClientDomain {
    private Double netAssets;
    private String establishTime;
    private String region;
    private Integer numberOfFunds;
    private Double predict;

    public ClientDomain() {}

    public ClientDomain(ClientEntity clientEntity) {
        BeanUtils.copyProperties(clientEntity, this);
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

    public Double getPredict() {
        return predict;
    }

    public void setPredict(Double predict) {
        this.predict = predict;
    }
}
