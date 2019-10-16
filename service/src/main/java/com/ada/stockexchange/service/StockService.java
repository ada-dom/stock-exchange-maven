package com.ada.stockexchange.service;

import com.ada.stockexchange.domain.Stock;
import com.ada.stockexchange.domain.StockCurrency;
import com.ada.stockexchange.domain.StockPrice;
import com.ada.stockexchange.domain.StockRepository;
import com.ada.stockexchange.interfaces.ExternalStockInformationService;

import java.util.logging.Logger;

public class StockService {

    private static final Logger LOGGER = Logger.getLogger("com.ada.stockexchange.service.StockService");

    public Stock getStock(String stockId) {
        Stock stock = null;
        try {
            stock = StockRepository.getStockInformation(stockId);
        } catch (IllegalArgumentException e) {
            LOGGER.warning(e.getMessage());
            stock = new Stock(stockId, "unknown");
        }
        return enrichStockWithPrice(stock);
    }

    private Stock enrichStockWithPrice(Stock stock) {
        stock.setPrice(new StockPrice(ExternalStockInformationService.getPriceInEuroForStock(stock.getId()), StockCurrency.EUR));
        return stock;
    }

}
