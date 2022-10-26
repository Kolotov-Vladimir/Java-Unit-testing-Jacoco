package com.example;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class FelineTest {
    Feline feline = new Feline();
    List<String> expected = Arrays.asList("Животные", "Птицы", "Рыба");

    @Test
    public void eatMeat() throws Exception {
        assertEquals(expected, feline.eatMeat());
    }

    @Test
    public void getFamily() {
        assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void getKittens() {
        assertEquals(1, feline.getKittens());
    }

    @Test
    public void getKittensWhenReturnKittensCount() {
        assertEquals(2, feline.getKittens(2));
    }
}
