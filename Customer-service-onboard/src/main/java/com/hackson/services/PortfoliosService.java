package com.hackson.services;

import com.hackson.domain.PortfolioCountDomain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by song on 2023/9/21.
 */
@Service
public interface PortfoliosService {

    List<PortfolioCountDomain> countPortfolios();
}
