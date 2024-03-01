package com.fxDeals.progresSoft.progresSoftApplication.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fxDeals.progresSoft.progresSoftApplication.constant.CurrencyIsoCode;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DealDTO {

    @NotNull(message = "dealId cannot be null!")
    private Long dealId;

    @NotNull(message = "fromCurrencyIsoCode cannot be null!")
    private CurrencyIsoCode fromCurrencyIsoCode;

    @NotNull(message = "toCurrencyIsoCode cannot be null!")
    private CurrencyIsoCode toCurrencyIsoCode;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private LocalDateTime dealTimestamp;

    @Positive(message = "dealOrderingAmount cannot be zero or negative!")
    private Double dealOrderingAmount;
}
