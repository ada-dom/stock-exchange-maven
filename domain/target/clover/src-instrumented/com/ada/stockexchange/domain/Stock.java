/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package com.ada.stockexchange.domain;

import java.math.BigDecimal;

public class Stock {public static class __CLR4_4_100k1tbfh3l{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0064\u0065\u0076\u005c\u005c\u0073\u0077\u0069\u0074\u0063\u0068\u0066\u0075\u006c\u006c\u0079\u005c\u005c\u0073\u0074\u006f\u0063\u006b\u002d\u0065\u0078\u0063\u0068\u0061\u006e\u0067\u0065\u005c\u005c\u0064\u006f\u006d\u0061\u0069\u006e\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1571232781081L,8589935092L,17,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private final String id;
    private final String name;
    private StockPrice price;

    public Stock(String id, String name) {try{__CLR4_4_100k1tbfh3l.R.inc(0);
        __CLR4_4_100k1tbfh3l.R.inc(1);this.id = id;
        __CLR4_4_100k1tbfh3l.R.inc(2);this.name = name;
    }finally{__CLR4_4_100k1tbfh3l.R.flushNeeded();}}

    public void setPrice(StockPrice price) {try{__CLR4_4_100k1tbfh3l.R.inc(3);
        __CLR4_4_100k1tbfh3l.R.inc(4);this.price = price;
    }finally{__CLR4_4_100k1tbfh3l.R.flushNeeded();}}

    public String getId() {try{__CLR4_4_100k1tbfh3l.R.inc(5);
        __CLR4_4_100k1tbfh3l.R.inc(6);return id;
    }finally{__CLR4_4_100k1tbfh3l.R.flushNeeded();}}

    public String getName() {try{__CLR4_4_100k1tbfh3l.R.inc(7);
        __CLR4_4_100k1tbfh3l.R.inc(8);return name;
    }finally{__CLR4_4_100k1tbfh3l.R.flushNeeded();}}

    public BigDecimal getPriceValue() {try{__CLR4_4_100k1tbfh3l.R.inc(9);
        __CLR4_4_100k1tbfh3l.R.inc(10);return (((price == null )&&(__CLR4_4_100k1tbfh3l.R.iget(11)!=0|true))||(__CLR4_4_100k1tbfh3l.R.iget(12)==0&false))? new BigDecimal(0) : price.getPrice();
    }finally{__CLR4_4_100k1tbfh3l.R.flushNeeded();}}

    public StockCurrency getPriceStockCurrency() {try{__CLR4_4_100k1tbfh3l.R.inc(13);
        __CLR4_4_100k1tbfh3l.R.inc(14);return (((price == null )&&(__CLR4_4_100k1tbfh3l.R.iget(15)!=0|true))||(__CLR4_4_100k1tbfh3l.R.iget(16)==0&false))? StockCurrency.EUR : price.getCurrency();
    }finally{__CLR4_4_100k1tbfh3l.R.flushNeeded();}}
}