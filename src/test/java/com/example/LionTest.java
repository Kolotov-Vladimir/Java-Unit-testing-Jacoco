package com.example;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class LionTest {

    Feline feline;
    Lion lion;

    @Test
    public void getFood() throws Exception {
        Lion lion = new Lion("Самец", feline);
        assertEquals(List.of("Животные", "Птицы", "Рыба"), lion.getFood());
    }

    @Test
    public void getKittens() {
        assertEquals("метод должен вернуть int == ", 1, lion.getKittens());
    }
}