package com.hackson.services.impl;
import com.hackson.dao.PortfolioRepository;
import com.hackson.domain.PortfolioCountDomain;
import com.hackson.services.PortfoliosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by song on 2023/9/21.
 */
@Service
public class PortfoliosServiceImpl implements PortfoliosService {


    @Autowired
    private PortfolioRepository portfolioRepository;

    public List<PortfolioCountDomain> countPortfolios() {
        List<List<Object>> countList = portfolioRepository.countByServiceName();

        List<PortfolioCountDomain> result = new ArrayList<>();
        countList.forEach(countObj -> {
            String name = String.valueOf(countObj.get(0));
            Integer clientCount = (Integer) countObj.get(1);

            result.add(new PortfolioCountDomain(name, clientCount));
        });

        return result;
    }
}
