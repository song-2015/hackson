package com.hackson.dao;

import com.hackson.entity.PortfolioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Created by song on 2023/9/21.
 */
public interface PortfolioRepository extends JpaRepository<PortfolioEntity, String> {

    @Query(value = "select service_name, count(*), sum(revenue) from XX group by service_name", nativeQuery = true)
    List<List<Object>> countByServiceName();
}
