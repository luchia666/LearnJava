package ru.lesson.lessons;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    @Test
    public void add() throws Exception {
        Calculator calc = new Calculator();
        calc.add(1.0,1.0);
        Assert.assertEquals(2.0,calc.getResult(),0);
    }
    @Test
    public void delenie() throws Exception{
        Calculator calc = new Calculator();
        calc.division(3,3);
        Assert.assertEquals(1,calc.getResult(),0);

    }

}