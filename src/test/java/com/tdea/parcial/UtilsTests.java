package com.tdea.parcial;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UtilsTests {

    @Test
    public void shouldBeBeforeSixButAfterZero() {
        int hour = 4;
        Assertions.assertEquals("Night", Utils.getTimeOfDay(hour));
    }

    @Test
    public void shouldBeBeforeTwelveButAfterSix() {
        int hour = 6;
        Assertions.assertEquals("Morning", Utils.getTimeOfDay(hour));
    }

    @Test
    public void shouldBeAfterTwelveButBeforeEighteen() {
        int hour = 13;
        Assertions.assertEquals("Afternoon", Utils.getTimeOfDay(hour));
    }

    @Test
    public void shouldBeAfterEighteen() {
        int hour = 19;
        Assertions.assertEquals("Evening", Utils.getTimeOfDay(hour));
    }

    @Test
    public void shouldNoRangeTwentyFourHours() {
        int hour = 30;
        Assertions.assertEquals("Invalid hour", Utils.getTimeOfDay(hour));
    }

}
