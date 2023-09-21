package com.hackson.entity;


import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by song on 2023/9/21.
 */
@Entity(name = "ssa_portfolios")
public class PortfolioEntity {
    @Id
    private String portfolioId;
    private String serviceName;
    private String clientId;
    private String clientName;
    private Double revenue;

    public String getPortfolioId() {
        return portfolioId;
    }

    public void setPortfolioId(String portfolioId) {
        this.portfolioId = portfolioId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

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

    public Double getRevenue() {
        return revenue;
    }

    public void setRevenue(Double revenue) {
        this.revenue = revenue;
    }

}
