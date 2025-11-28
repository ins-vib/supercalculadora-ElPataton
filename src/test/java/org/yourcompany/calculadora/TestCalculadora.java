package org.yourcompany.calculadora;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TestCalculadora {
    @Test
    public void test1(){
        assertEquals(3,Calculadora.nombreDigits(123));
        assertEquals(4,Calculadora.nombreDigits(1234));
        assertEquals(5,Calculadora.nombreDigits(12333));
        assertEquals(1,Calculadora.nombreDigits(0));
    }
    @Test
    public void test2(){
        assertEquals(15,Calculadora.sumaPrimersNumeros(5));
        assertEquals(55,Calculadora.sumaPrimersNumeros(10));
        assertEquals(120,Calculadora.sumaPrimersNumeros(15));
    }
    @Test
    public void test3(){
        assertEquals(120,Calculadora.calcularFactorial(5));
        assertEquals(5040,Calculadora.calcularFactorial(7));
        assertEquals(3628800,Calculadora.calcularFactorial(10));
    }
    @Test
    public void test4(){
        assertEquals(14,Calculadora.sumaQuadrats(3));
        assertEquals(55,Calculadora.sumaQuadrats(5));
        assertEquals(140,Calculadora.sumaQuadrats(7));
    }
    @Test
    public void test5(){
        assertEquals(8,Calculadora.calcularPotencia(2, 3));
        assertEquals(243,Calculadora.calcularPotencia(3, 5));
        assertEquals(625,Calculadora.calcularPotencia(5, 4));
    }
    @Test
    public void test6(){
    assertEquals(4.675,Calculadora.Cinema(5, true, true));
    assertEquals(12.75,Calculadora.Cinema(15, false, true));
    assertEquals(60.5,Calculadora.Cinema(55, true, false));
    }
}
