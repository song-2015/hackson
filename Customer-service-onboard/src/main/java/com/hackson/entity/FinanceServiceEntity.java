package com.hackson.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "ssa_services")
public class FinanceServiceEntity {

    @Id
    private String serviceId;
    private String serviceName;
    private Double serviceCost;

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public Double getServiceCost() {
        return serviceCost;
    }

    public void setServiceCost(Double serviceCost) {
        this.serviceCost = serviceCost;
    }
}
