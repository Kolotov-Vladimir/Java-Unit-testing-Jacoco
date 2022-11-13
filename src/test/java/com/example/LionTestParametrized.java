package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionTestParametrized {
    private boolean expected;
    private String sex;
    Feline feline;

    public LionTestParametrized(String sex, boolean expected) {
        this.sex = sex;
        this.expected = expected;
    }

    @Parameterized.Parameters(name = "sex: {0}, return {1}")
    public static Object[][] getMane() {
        return new Object[][]{{"Самец", true}, {"Самка", false},};
    }

    @Test
    public void doesHaveMane() throws Exception {
        Lion lion = new Lion(sex, feline);
        assertEquals(expected, lion.doesHaveMane());
    }
}