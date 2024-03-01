package com.fxDeals.progresSoft.progresSoftApplication.entity;

import com.fxDeals.progresSoft.progresSoftApplication.constant.CurrencyIsoCode;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "currency_exchange_rate")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class CurrencyExchangeRate {

    @EmbeddedId
    private CurrencyExchangeRatePK currencyExchangeRatePK;

    @Column(name = "exchange_rate")
    private Double exchangeRate;
}
