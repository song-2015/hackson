package com.hackson.domain;

/**
 * Created by song on 2023/9/21.
 */
public class PortfolioCountDomain {

    private String serviceName;
    private Integer clientNum;


    public PortfolioCountDomain() {}

    public PortfolioCountDomain(String serviceName, Integer clientCount) {
        this.serviceName = serviceName;
        this.clientNum = clientCount;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public void setClientNum(Integer clientNum) {
        this.clientNum = clientNum;
    }

    public Integer getClientNum() {
        return clientNum;
    }
}
