/* $$ This file has been instrumented by Clover 4.1.2#20161011084623935 $$ */package com.ada.stockexchange.service;

import com.ada.stockexchange.domain.Stock;
import com.ada.stockexchange.domain.StockCurrency;
import com.ada.stockexchange.domain.StockPrice;
import com.ada.stockexchange.domain.StockRepository;
import com.ada.stockexchange.interfaces.ExternalStockInformationService;

import java.util.logging.Logger;

public class StockService {public static class __CLR4_1_200k1tb8izs{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0064\u0065\u0076\u005c\u005c\u0073\u0077\u0069\u0074\u0063\u0068\u0066\u0075\u006c\u006c\u0079\u005c\u005c\u0073\u0074\u006f\u0063\u006b\u002d\u0065\u0078\u0063\u0068\u0061\u006e\u0067\u0065\u005c\u005c\u0073\u0065\u0072\u0076\u0069\u0063\u0065\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1571232456998L,8589935092L,10,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final Logger LOGGER = Logger.getLogger("com.ada.stockexchange.service.StockService");

    public Stock getStock(String stockId) {try{__CLR4_1_200k1tb8izs.R.inc(0);
        __CLR4_1_200k1tb8izs.R.inc(1);Stock stock = null;
        __CLR4_1_200k1tb8izs.R.inc(2);try {
            __CLR4_1_200k1tb8izs.R.inc(3);stock = StockRepository.getStockInformation(stockId);
        } catch (IllegalArgumentException e) {
            __CLR4_1_200k1tb8izs.R.inc(4);LOGGER.warning(e.getMessage());
            __CLR4_1_200k1tb8izs.R.inc(5);stock = new Stock(stockId, "unknown");
        }
        __CLR4_1_200k1tb8izs.R.inc(6);return enrichStockWithPrice(stock);
    }finally{__CLR4_1_200k1tb8izs.R.flushNeeded();}}

    private Stock enrichStockWithPrice(Stock stock) {try{__CLR4_1_200k1tb8izs.R.inc(7);
        __CLR4_1_200k1tb8izs.R.inc(8);stock.setPrice(new StockPrice(ExternalStockInformationService.getPriceInEuroForStock(stock.getId()), StockCurrency.EUR));
        __CLR4_1_200k1tb8izs.R.inc(9);return stock;
    }finally{__CLR4_1_200k1tb8izs.R.flushNeeded();}}

}
