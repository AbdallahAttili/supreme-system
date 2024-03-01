package com.fxDeals.progresSoft.progresSoftApplication.validator;

import com.fxDeals.progresSoft.progresSoftApplication.entity.Deal;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class DealDateTimestampValidator implements DealValidator {
    @Override
    public ValidationResult validate(Deal deal) {
        if (!Objects.nonNull(deal.getDealTimestamp())) {
            return ValidationResult.fail("Deal date timestamp cannot be null!");
        }

        return ValidationResult.ok();
    }
}
