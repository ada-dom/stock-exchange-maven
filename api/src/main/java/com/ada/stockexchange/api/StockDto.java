package com.ada.stockexchange.api;

import java.io.Serializable;
import java.math.BigDecimal;

public class StockDto implements Serializable {

    private static final long serialVersionUID = 1L;

    private final String id;
    private final String name;
    private final BigDecimal price;
    private final String currency;

    public StockDto(String id, String name, BigDecimal price, String currency) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.currency = currency;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public String getCurrency() {
        return currency;
    }

    @Override
    public String toString() {
        return "com.ada.stockexchange.cli.StockDto{" +
                "  id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price + currency + '\'' + '}';
    }
}
