package com.fxDeals.progresSoft.progresSoftApplication.dao;

import com.fxDeals.progresSoft.progresSoftApplication.entity.CurrencyExchangeRate;
import com.fxDeals.progresSoft.progresSoftApplication.entity.CurrencyExchangeRatePK;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CurrencyExchangeRateRepository extends CrudRepository<CurrencyExchangeRate, CurrencyExchangeRatePK> {
}
