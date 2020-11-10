
package PruebasUnitariasTest;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import PruebasUnitarias.Pruebas;


public class PruebasTest {
    
    Pruebas prueba1 = new Pruebas();
    
    //1
    @Test
    public void testlessThanOrEqualToZero1() {
        assertEquals(true, prueba1.lessThanOrEqualToZero(0));
    }
    
    @Test
    public void testlessThanOrEqualToZero2() {
        assertEquals(false, prueba1.lessThanOrEqualToZero(5));
    }
    
    @Test
    public void testlessThanOrEqualToZero3() {
        assertEquals(true, prueba1.lessThanOrEqualToZero(-23));
    }
    
    //2
    @Test
    public void teststutter1() {
        assertEquals("si... si... sistemas?", prueba1.stutter("sistemas"));
    }
    
    @Test
    public void teststutter2() {
        assertEquals("ca... ca... carlos?", prueba1.stutter("carlos"));
    }
    
    @Test
    public void teststutter3() {
        assertEquals("co... co... compilador?", prueba1.stutter("compilador"));
    }
    
    //3
    @Test
    public void testtotalCups1() {
        assertEquals(42, prueba1.totalCups(36));
    }
    
    @Test
    public void testtotalCups2() {
        assertEquals(140, prueba1.totalCups(120));
    }
    
    @Test
    public void testtotalCups3() {
        assertEquals(70, prueba1.totalCups(60));
    }
    
    //4
    @Test
    public void testcountWords1() {
        assertEquals(3, prueba1.countWords("Hola, mucho gusto"));
    }
    
    @Test
    public void testcountWords2() {
        assertEquals(6, prueba1.countWords("Esta frase tiene seis palabras escritas"));
    }
    
    @Test
    public void testcountWords3() {
        assertEquals(4, prueba1.countWords("Carlos Iván Pérez Perales"));
    }
    
}
