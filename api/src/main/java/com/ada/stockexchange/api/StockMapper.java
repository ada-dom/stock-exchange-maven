package com.ada.stockexchange.api;

import com.ada.stockexchange.domain.Stock;

public class StockMapper {

    public static StockDto mapToDto(Stock stock) {
        return new StockDto(
                stock.getId(),
                stock.getName(),
                stock.getPriceValue(),
                stock.getPriceStockCurrency().getSymbol());
    }

}
