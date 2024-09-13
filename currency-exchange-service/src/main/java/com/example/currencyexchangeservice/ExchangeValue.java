package com.example.currencyexchangeservice;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ExchangeValue {

    @Id
    private Long id;

    private String from_currency;

    private String to_currency;

    private BigDecimal conversionMultiple;

    private Integer port;

    public ExchangeValue(Long id, String from, String to, BigDecimal conversionMultiple) {
        super();
        this.id = id;
        this.from_currency = from;
        this.to_currency = to;
        this.conversionMultiple = conversionMultiple;
    }
}
