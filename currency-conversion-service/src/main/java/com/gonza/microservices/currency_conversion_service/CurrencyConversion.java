package com.gonza.microservices.currency_conversion_service;

import java.math.BigDecimal;


public class CurrencyConversion {


    private Long id;
    private String from;
    private String to;
    private BigDecimal conversionMultiple;
    private BigDecimal quantity;
    private BigDecimal totalCalculatedAmount;
    private String environment;

    public CurrencyConversion() {
    }

    public CurrencyConversion(
            Long id,
            String from,
            String to,
            BigDecimal conversionMultiple,
            BigDecimal quantity,
            BigDecimal totalCalculatedAmount,
            String environment
    )
    {
        this.id = id;
        this.from = from;
        this.to = to;
        this.conversionMultiple = conversionMultiple;
        this.quantity = quantity;
        this.totalCalculatedAmount = totalCalculatedAmount;
        this.environment = environment;
    }

    public Long getId() {
        return id;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public BigDecimal getConversionMultiple() {
        return conversionMultiple;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public BigDecimal getTotalCalculatedAmount() {
        return totalCalculatedAmount;
    }

    public String getEnvironment() {
        return environment;
    }
}
