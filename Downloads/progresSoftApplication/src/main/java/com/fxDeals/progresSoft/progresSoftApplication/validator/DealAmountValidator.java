package com.fxDeals.progresSoft.progresSoftApplication.validator;

import com.fxDeals.progresSoft.progresSoftApplication.entity.Deal;
import org.springframework.stereotype.Component;

@Component
public class DealAmountValidator implements DealValidator {
    @Override
    public ValidationResult validate(Deal deal) {
        if (deal.getDealOrderingAmount() <= 0) {
            return ValidationResult.fail("Deal amount cannot be zero or negative!");
        }

        return ValidationResult.ok();
    }
}
