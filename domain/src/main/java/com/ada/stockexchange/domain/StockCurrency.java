package com.ada.stockexchange.domain;

public enum StockCurrency {
    EUR("Euro", "€"),
    USD("United States Dollar", "$"),
    GBP("Great Britain Pound", "£");

    private final String label;
    private final String symbol;

    StockCurrency(String label, String symbol) {
        this.label = label;
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }
}
