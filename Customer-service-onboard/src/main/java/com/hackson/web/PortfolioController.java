package com.hackson.web;

import com.hackson.dao.FinanceServiceRepository;
import com.hackson.domain.FinanceServiceDomain;
import com.hackson.domain.PortfolioCountDomain;
import com.hackson.services.PortfoliosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by song on 2023/9/21.
 */
@RestController
@RequestMapping("/services")
public class PortfolioController {

    @Autowired
    private FinanceServiceRepository financeServiceRepository;

    @Autowired
    private PortfoliosService portfoliosService;

    @GetMapping("")
    public List<FinanceServiceDomain> getAllServices() {
        return financeServiceRepository.findAll().stream().map(FinanceServiceDomain::new).toList();
    }

    @GetMapping("/count")
    public List<PortfolioCountDomain> countPortfolios() {
        return portfoliosService.countPortfolios();
    }
}
