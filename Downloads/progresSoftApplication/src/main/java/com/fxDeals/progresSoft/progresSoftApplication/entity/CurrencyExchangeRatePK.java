package com.fxDeals.progresSoft.progresSoftApplication.entity;

import com.fxDeals.progresSoft.progresSoftApplication.constant.CurrencyIsoCode;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class CurrencyExchangeRatePK implements Serializable {

    private static final long serialVersionUID = 6202269445639364170L;

    @Enumerated(EnumType.STRING)
    @Column(name = "from_currency")
    private CurrencyIsoCode fromCurrencyIsoCode;

    @Enumerated(EnumType.STRING)
    @Column(name = "to_currency")
    private CurrencyIsoCode toCurrencyIsoCode;
}
