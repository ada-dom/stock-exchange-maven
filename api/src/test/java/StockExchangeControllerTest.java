import com.ada.stockexchange.api.StockDto;
import com.ada.stockexchange.api.StockExchangeController;
import com.ada.stockexchange.service.StockService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

class StockExchangeControllerTest {

    @Test
    void givenADatabase_whenStockExchangeControllerAskForIdAA_thenStockDTOContainingIsReturned() {
        //given
        //when
        StockExchangeController stockExchangeController = new StockExchangeController(new StockService());
        String stockId = "AA";
        StockDto stockDto = stockExchangeController.getStock(stockId);
        //then
        Assertions.assertEquals(stockId, stockDto.getId());
        Assertions.assertEquals("Ambro AN", stockDto.getName());
        Assertions.assertEquals("€", stockDto.getCurrency());
    }

    @Test
    void givenADatabase_whenStoclExchangeControllerAskForUnknownId_theReturnAnUknownDTO() {
        //given
        //when
        StockExchangeController stockExchangeController = new StockExchangeController(new StockService());
        String stockId = "ZZ";
        StockDto stockDto = stockExchangeController.getStock(stockId);
        //then
        Assertions.assertEquals(stockId, stockDto.getId());
        Assertions.assertEquals("unknown", stockDto.getName());
        Assertions.assertEquals("€", stockDto.getCurrency());
    }
}