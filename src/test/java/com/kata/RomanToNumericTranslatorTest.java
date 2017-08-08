package com.kata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by john.orr on 08/08/2017.
 */
public class RomanToNumericTranslatorTest {

    RomanToNumericTranslator translator = new RomanToNumericTranslator();

    @Test
    public void testTranslate() throws Exception {
        assertEquals(1000, translator.translate("M"));
    }
}