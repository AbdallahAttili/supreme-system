package com.fxDeals.progresSoft.progresSoftApplication.service;

import com.fxDeals.progresSoft.progresSoftApplication.constant.CurrencyIsoCode;
import com.fxDeals.progresSoft.progresSoftApplication.dao.CurrencyExchangeRateRepository;
import com.fxDeals.progresSoft.progresSoftApplication.dao.DealRepository;
import com.fxDeals.progresSoft.progresSoftApplication.entity.CurrencyExchangeRate;
import com.fxDeals.progresSoft.progresSoftApplication.entity.CurrencyExchangeRatePK;
import com.fxDeals.progresSoft.progresSoftApplication.entity.Deal;
import com.fxDeals.progresSoft.progresSoftApplication.exception.InvalidCurrencyExchangeRateException;
import com.fxDeals.progresSoft.progresSoftApplication.exception.InvalidDealDetailsException;
import com.fxDeals.progresSoft.progresSoftApplication.validator.DealValidator;
import com.fxDeals.progresSoft.progresSoftApplication.validator.ValidationResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DealServiceImpl implements DealService {

    @Autowired
    private DealRepository dealRepository;

    @Autowired
    private CurrencyExchangeRateRepository currencyExchangeRateRepository;

    @Autowired
    private List<DealValidator> dealValidators;

    @Override
    public void addDeal(Deal newDeal) {
        Optional<ValidationResult> validationResult = validateDeal(newDeal);

        if (validationResult.isPresent()) {
            throw new InvalidDealDetailsException(validationResult.get().getMessage());
        }

        Double exchangeRate = getExchangeRate(newDeal.getFromCurrencyIsoCode(), newDeal.getToCurrencyIsoCode());

        newDeal.setDealTargetAmount(newDeal.getDealOrderingAmount() * exchangeRate);

        dealRepository.save(newDeal);
    }

    private Optional<ValidationResult> validateDeal(Deal newDeal) {
        return dealValidators.stream()
                             .map(dealValidator -> dealValidator.validate(newDeal))
                             .filter(validationResult -> !validationResult.isValid())
                             .findFirst();
    }

    private Double getExchangeRate(CurrencyIsoCode fromCurrencyIsoCode, CurrencyIsoCode toCurrencyIsoCode) {
        CurrencyExchangeRatePK currencyExchangeRatePK = new CurrencyExchangeRatePK(fromCurrencyIsoCode, toCurrencyIsoCode);

        Optional<CurrencyExchangeRate> currencyExchangeRate = currencyExchangeRateRepository.findById(currencyExchangeRatePK);

        if (currencyExchangeRate.isEmpty()) {
            //todo logging
            throw new InvalidCurrencyExchangeRateException("No matched currency exchange rate");
        }

        return currencyExchangeRate.get().getExchangeRate();
    }
}
