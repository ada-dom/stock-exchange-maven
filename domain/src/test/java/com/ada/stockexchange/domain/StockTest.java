package com.ada.stockexchange.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class StockTest {

    @Test
    void givenStockWithNoPrice_whenAskingForCurrency_thenTheDefaultEuroIsReturned() {
        //given
        //when
        Stock stock = new Stock("AD", "Ada");
        //then
        Assertions.assertEquals("€", stock.getPriceStockCurrency().getSymbol());
    }

    @Test
    void givenStockWithNoPrice_whenAskingForPrice_thenZeroIsReturned() {
        //given
        //when
        Stock stock = new Stock("AD", "Ada");
        //then
        Assertions.assertEquals(new BigDecimal(0), stock.getPriceValue());
    }

    @Test
    void givenStockRepository_whenAskForStockInformationForAValidIdAA_thenReturnStock() {
        //given
        //when
        String stockId = "AA";
        Stock stock = StockRepository.getStockInformation(stockId);
        //then
        Assertions.assertEquals(stockId, stock.getId());
        Assertions.assertEquals("Ambro AN", stock.getName());
    }

    @Test
    void givenStockRepository_whenAskForStockInformationForAnInvalidIdZZ_thenThrowsIllagalArgumentException() {
        //given
        //when
        String stockId = "ZZ";
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            StockRepository.getStockInformation(stockId);
        });
    }
}