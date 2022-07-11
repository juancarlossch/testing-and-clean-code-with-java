package com.curso.testindandcleancode;

import java.math.BigDecimal;

public class MoneyUtil {

    public static String format(double money) {
        String symbol = "$";
        if (money < 0) {
            symbol = "-$";
            money = money * (-1);
        }
        BigDecimal rounded = BigDecimal.valueOf(money).setScale(2, BigDecimal.ROUND_HALF_UP);
        return symbol + rounded;
    }

    public static String format(double money,String symbol){
        if(symbol == null){
            throw new IllegalArgumentException();
        }
        String result = format(money);
        return result.replace("$",symbol);
    }
}
