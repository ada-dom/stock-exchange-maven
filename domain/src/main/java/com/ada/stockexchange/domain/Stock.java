package com.ada.stockexchange.domain;

import java.math.BigDecimal;

public class Stock {

    private final String id;
    private final String name;
    private StockPrice price;

    public Stock(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setPrice(StockPrice price) {
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPriceValue() {
        return price == null ? new BigDecimal(0) : price.getPrice();
    }

    public StockCurrency getPriceStockCurrency() {
        return price == null ? StockCurrency.EUR : price.getCurrency();
    }
}
