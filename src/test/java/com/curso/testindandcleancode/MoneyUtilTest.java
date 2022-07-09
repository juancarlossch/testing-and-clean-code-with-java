package com.curso.testindandcleancode;

import org.junit.Assert;
import org.junit.Test;

// Si se da click en iniciar desde aquí, se ejecutan todos los casos de prueba
public class MoneyUtilTest {

    /*
     * Nota: Si se da clicl en iniciar desde el método, solo ejecutará los casos de
     * prueba de este.
     * Caso de prueba: Con datos correctos
     */
    @Test
    public void moneyTest() {
        String money = MoneyUtil.format(1000);
        // El primer parámetro lo que esperamos y el segundo lo que esperamos
        Assert.assertEquals("$1000.00", money);
    }

    @Test
    public void negativeMoneyTest() {
        String money = MoneyUtil.format(-1000);
        // El primer parámetro lo que esperamos y el segundo lo que esperamos
        Assert.assertEquals("-$1000.00", money);
    }

    @Test
    public void euroMoneyTest() {
        String money = MoneyUtil.format(-1000, "€");
        Assert.assertEquals("-€1000.00", money);
    }

    /*
     * Si cuando se ejecuta el test no devuleve el IlegalArgumentException la prueba
     * está mal
     */
    @Test(expected = IllegalArgumentException.class)
    public void notNullExceptionMoneyTest() {
        MoneyUtil.format(-1000, null);
    }
}
