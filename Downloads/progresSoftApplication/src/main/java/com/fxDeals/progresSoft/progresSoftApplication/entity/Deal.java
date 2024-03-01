package com.fxDeals.progresSoft.progresSoftApplication.entity;

import com.fxDeals.progresSoft.progresSoftApplication.constant.CurrencyIsoCode;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "deal")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Deal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "deal_id")
    private Long dealId;

    @Enumerated(EnumType.STRING)
    @Column(name = "from_currency_iso_code")
    private CurrencyIsoCode fromCurrencyIsoCode;

    @Enumerated(EnumType.STRING)
    @Column(name = "to_currency_iso_code")
    private CurrencyIsoCode toCurrencyIsoCode;

    @Column(name = "deal_timestamp")
    private Date dealTimestamp;

    @Column(name = "deal_ordering_amount")
    private Double dealOrderingAmount;

    @Column(name = "deal_target_amount")
    private Double dealTargetAmount;
}

