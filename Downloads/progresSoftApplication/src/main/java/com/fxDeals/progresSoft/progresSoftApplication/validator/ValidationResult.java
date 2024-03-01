package com.fxDeals.progresSoft.progresSoftApplication.validator;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
public class ValidationResult {
    private final boolean valid;
    private final String message;

    public static ValidationResult ok() {
        return new ValidationResult(true, null);
    }

    public static ValidationResult fail(String message) {
        return new ValidationResult(false, message);
    }
}
