package com.ada.stockexchange.interfaces;

import org.apache.commons.lang3.RandomUtils;

import java.math.BigDecimal;

public class ExternalStockInformationService {

    private static final int START = 10;
    private static final int END = 101;

    public static BigDecimal getPriceInEuroForStock(String stockId) {
        return new BigDecimal(RandomUtils.nextInt(START, END));
    }
}
