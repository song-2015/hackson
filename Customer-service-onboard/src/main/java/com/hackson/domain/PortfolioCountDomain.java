package com.hackson.domain;

/**
 * Created by song on 2023/9/21.
 */
public class PortfolioCountDomain {

    private String serviceName;
    private Double revenueTotal;
    private Double cost;

    public PortfolioCountDomain() {}

    public PortfolioCountDomain(String serviceName, Double revenue, Double cost) {
        this.serviceName = serviceName;
        this.revenueTotal = revenue;
        this.cost = cost;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public Double getRevenueTotal() {
        return revenueTotal;
    }

    public void setRevenueTotal(Double revenueTotal) {
        this.revenueTotal = revenueTotal;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }
}
