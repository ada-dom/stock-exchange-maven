package com.ada.stockexchange.domain;

import com.google.common.collect.ImmutableMap;

public class StockRepository {

    private final static ImmutableMap<String, Stock> FAKE_DB = new ImmutableMap.Builder<String, Stock>()
            .put("AA", new Stock("AA", "Ambro AN"))
            .put("BB", new Stock("BB", "BB crème"))
            .put("CC", new Stock("CC", "CC crème"))
            .build();

    public static Stock getStockInformation(String stockId) throws IllegalArgumentException {
        Stock stock = FAKE_DB.get(stockId);
        if(stock == null) {
            throw new IllegalArgumentException("There is no stock with id: " + stockId);
        }
        return stock;
    }
}
