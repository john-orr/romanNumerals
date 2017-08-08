package com.kata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by john.orr on 08/08/2017.
 */
public class NumericToRomanTranslatorTest {

    NumericToRomanTranslator translator = new NumericToRomanTranslator();

    @Test
    public void testTranslate() {
        assertEquals("M", translator.translate(1000));
    }
}