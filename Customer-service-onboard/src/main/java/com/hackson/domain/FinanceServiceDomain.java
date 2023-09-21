package com.hackson.domain;

import com.hackson.entity.FinanceServiceEntity;
import org.springframework.beans.BeanUtils;

public class FinanceServiceDomain {

    private String serviceId;
    private String serviceName;
    private Double serviceCost;

    public FinanceServiceDomain() {}

    public FinanceServiceDomain(FinanceServiceEntity financeServiceEntity) {
        BeanUtils.copyProperties(financeServiceEntity, this);
    }

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
