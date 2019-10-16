/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package com.ada.stockexchange.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class StockTest {static class __CLR4_4_11010k1tbfh60{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0064\u0065\u0076\u005c\u005c\u0073\u0077\u0069\u0074\u0063\u0068\u0066\u0075\u006c\u006c\u0079\u005c\u005c\u0073\u0074\u006f\u0063\u006b\u002d\u0065\u0078\u0063\u0068\u0061\u006e\u0067\u0065\u005c\u005c\u0064\u006f\u006d\u0061\u0069\u006e\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1571232781215L,8589935092L,51,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    void givenStockWithNoPrice_whenAskingForCurrency_thenTheDefaultEuroIsReturned() {__CLR4_4_11010k1tbfh60.R.globalSliceStart(getClass().getName(),36);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o34x7s10();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11010k1tbfh60.R.rethrow($CLV_t2$);}finally{__CLR4_4_11010k1tbfh60.R.globalSliceEnd(getClass().getName(),"com.ada.stockexchange.domain.StockTest.givenStockWithNoPrice_whenAskingForCurrency_thenTheDefaultEuroIsReturned",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o34x7s10(){try{__CLR4_4_11010k1tbfh60.R.inc(36);
        //given
        //when
        __CLR4_4_11010k1tbfh60.R.inc(37);Stock stock = new Stock("AD", "Ada");
        //then
        __CLR4_4_11010k1tbfh60.R.inc(38);Assertions.assertEquals("\u20ac", stock.getPriceStockCurrency().getSymbol());
    }finally{__CLR4_4_11010k1tbfh60.R.flushNeeded();}}

    @Test
    void givenStockWithNoPrice_whenAskingForPrice_thenZeroIsReturned() {__CLR4_4_11010k1tbfh60.R.globalSliceStart(getClass().getName(),39);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sgqv6z13();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11010k1tbfh60.R.rethrow($CLV_t2$);}finally{__CLR4_4_11010k1tbfh60.R.globalSliceEnd(getClass().getName(),"com.ada.stockexchange.domain.StockTest.givenStockWithNoPrice_whenAskingForPrice_thenZeroIsReturned",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sgqv6z13(){try{__CLR4_4_11010k1tbfh60.R.inc(39);
        //given
        //when
        __CLR4_4_11010k1tbfh60.R.inc(40);Stock stock = new Stock("AD", "Ada");
        //then
        __CLR4_4_11010k1tbfh60.R.inc(41);Assertions.assertEquals(new BigDecimal(0), stock.getPriceValue());
    }finally{__CLR4_4_11010k1tbfh60.R.flushNeeded();}}

    @Test
    void givenStockRepository_whenAskForStockInformationForAValidIdAA_thenReturnStock() {__CLR4_4_11010k1tbfh60.R.globalSliceStart(getClass().getName(),42);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14gm08c16();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11010k1tbfh60.R.rethrow($CLV_t2$);}finally{__CLR4_4_11010k1tbfh60.R.globalSliceEnd(getClass().getName(),"com.ada.stockexchange.domain.StockTest.givenStockRepository_whenAskForStockInformationForAValidIdAA_thenReturnStock",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14gm08c16(){try{__CLR4_4_11010k1tbfh60.R.inc(42);
        //given
        //when
        __CLR4_4_11010k1tbfh60.R.inc(43);String stockId = "AA";
        __CLR4_4_11010k1tbfh60.R.inc(44);Stock stock = StockRepository.getStockInformation(stockId);
        //then
        __CLR4_4_11010k1tbfh60.R.inc(45);Assertions.assertEquals(stockId, stock.getId());
        __CLR4_4_11010k1tbfh60.R.inc(46);Assertions.assertEquals("Ambro AN", stock.getName());
    }finally{__CLR4_4_11010k1tbfh60.R.flushNeeded();}}

    @Test
    void givenStockRepository_whenAskForStockInformationForAnInvalidIdZZ_thenThrowsIllagalArgumentException() {__CLR4_4_11010k1tbfh60.R.globalSliceStart(getClass().getName(),47);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1urvjw01b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11010k1tbfh60.R.rethrow($CLV_t2$);}finally{__CLR4_4_11010k1tbfh60.R.globalSliceEnd(getClass().getName(),"com.ada.stockexchange.domain.StockTest.givenStockRepository_whenAskForStockInformationForAnInvalidIdZZ_thenThrowsIllagalArgumentException",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1urvjw01b(){try{__CLR4_4_11010k1tbfh60.R.inc(47);
        //given
        //when
        __CLR4_4_11010k1tbfh60.R.inc(48);String stockId = "ZZ";
        __CLR4_4_11010k1tbfh60.R.inc(49);Assertions.assertThrows(IllegalArgumentException.class, () -> {
            __CLR4_4_11010k1tbfh60.R.inc(50);StockRepository.getStockInformation(stockId);
        });
    }finally{__CLR4_4_11010k1tbfh60.R.flushNeeded();}}
}