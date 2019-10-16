package com.ada.stockexchange.api;

import com.ada.stockexchange.service.StockService;

public class StockExchangeController {

    private final StockService stockService;

    public StockExchangeController(StockService stockService) {
        this.stockService = stockService;
    }

    public StockDto getStock(String stockId) {
        return StockMapper.mapToDto(stockService.getStock(stockId));
    }
}
