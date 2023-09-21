package com.hackson.dao;

import com.hackson.entity.FinanceServiceEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FinanceServiceRepository extends JpaRepository<FinanceServiceEntity, String> {
}
