package com.curso.testindandcleancode;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

public class RangeValidatorTest {
    private RangeValidator cut;

    @BeforeEach
    void setUp() {
        cut = new RangeValidator();
    }

    /**
     * {@link RangeValidator#isValid(int)}
     */

    @Test
    @DisplayName("Should return true given 50")
    void fifty_isValid_returnsTrue() {
        Assert.assertTrue(cut.isValid(50));;
    }

    @Test
    @DisplayName("Should return false given 200")
    void twoHundred_isValid_returnsFalse() {
        Assert.assertFalse(cut.isValid(200));
    }

    @Test
    @DisplayName("Should return true given 100")
    void hundred_isValid_returnsTrue() {
        Assert.assertTrue(cut.isValid(100));
    }

    @Test
    @DisplayName("Should return false given 0")
    void zero_isValid_returnsFalse() {
        Assert.assertFalse(cut.isValid(0));
    }
}
