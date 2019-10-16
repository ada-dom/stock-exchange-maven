package com.ada.stockexchange.cli;

import com.ada.stockexchange.api.StockExchangeController;
import com.ada.stockexchange.service.StockService;

public class MyCLI {

    public static void main(String[] args) {
        if(args.length != 1) {
            return;
        }
        System.out.println(new StockExchangeController(new StockService()).getStock(args[0]));


    }
}
