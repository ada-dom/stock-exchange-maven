package com.ada.stockexchange.api;

import com.ada.stockexchange.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Component
@ResponseBody
@RequestMapping("/stocks")
public class StockExchangeController {

    private final StockService stockService;

    @Autowired
    public StockExchangeController(StockService stockService) {
        this.stockService = stockService;
    }

    @GetMapping("/{stockId}")
    public StockDto getStock(@PathVariable String stockId) {
        return StockMapper.mapToDto(stockService.getStock(stockId));
    }
}
