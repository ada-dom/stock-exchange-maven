/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package com.ada.stockexchange.domain;

public enum StockCurrency {
    EUR("Euro", "\u20ac"),
    USD("United States Dollar", "$"),
    GBP("Great Britain Pound", "\u00a3");

    private final String label;
    private final String symbol;

    StockCurrency(String label, String symbol) {try{__CLR4_4_1hhk1tbfh46.R.inc(17);
        __CLR4_4_1hhk1tbfh46.R.inc(18);this.label = label;
        __CLR4_4_1hhk1tbfh46.R.inc(19);this.symbol = symbol;
    }finally{__CLR4_4_1hhk1tbfh46.R.flushNeeded();}}

    public String getSymbol() {try{__CLR4_4_1hhk1tbfh46.R.inc(20);
        __CLR4_4_1hhk1tbfh46.R.inc(21);return symbol;
    }finally{__CLR4_4_1hhk1tbfh46.R.flushNeeded();}}
;public static class __CLR4_4_1hhk1tbfh46{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0064\u0065\u0076\u005c\u005c\u0073\u0077\u0069\u0074\u0063\u0068\u0066\u0075\u006c\u006c\u0079\u005c\u005c\u0073\u0074\u006f\u0063\u006b\u002d\u0065\u0078\u0063\u0068\u0061\u006e\u0067\u0065\u005c\u005c\u0064\u006f\u006d\u0061\u0069\u006e\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1571232781081L,8589935092L,22,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;}
