package com.fxDeals.progresSoft.progresSoftApplication.service;

import com.fxDeals.progresSoft.progresSoftApplication.constant.CurrencyIsoCode;
import com.fxDeals.progresSoft.progresSoftApplication.dao.CurrencyExchangeRateRepository;
import com.fxDeals.progresSoft.progresSoftApplication.dao.DealRepository;
import com.fxDeals.progresSoft.progresSoftApplication.entity.CurrencyExchangeRatePK;
import org.aspectj.lang.annotation.Before;
import org.hamcrest.Matchers;
import org.hibernate.mapping.Any;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DealServiceImplTest {
    @Autowired
    private DealService dealService;

    @InjectMocks
    private DealRepository dealRepository;

    @InjectMocks
    private CurrencyExchangeRateRepository currencyExchangeRateRepository;

    @BeforeEach
    public void setup() {
//        Mockito.when(currencyExchangeRateRepository.findById(Matchers.any(CurrencyExchangeRatePK.class)))
//                .then()
    }
}
