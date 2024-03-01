package com.fxDeals.progresSoft.progresSoftApplication.validator;

import com.fxDeals.progresSoft.progresSoftApplication.entity.Deal;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class DealCurrencyValidator implements DealValidator {
    @Override
    public ValidationResult validate(Deal deal) {
        if (!Objects.nonNull(deal.getFromCurrencyIsoCode()) && Objects.nonNull(deal.getToCurrencyIsoCode())) {
            return ValidationResult.fail("Deal currency iso codes cannot be null!");
        }

        return ValidationResult.ok();
    }
}
