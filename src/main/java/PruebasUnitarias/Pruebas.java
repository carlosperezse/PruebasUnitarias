
package PruebasUnitarias;

import java.util.StringTokenizer;


public class Pruebas {
    
    //Evalua si el número es menor o igual a cero
    public boolean lessThanOrEqualToZero(int numero){
        return numero<=0;
    }
    
    //Tartamudea la palabra ingresada
    public String stutter(String palabra){
        return ""+palabra.charAt(0)+palabra.charAt(1)+"... "+palabra.charAt(0)+palabra.charAt(1)+"... "+palabra+"?";
    }
    
    //Total de tazas con promoción
    public int totalCups(int tazas){
        return tazas+(tazas/6);
    }
    
    //Cuenta las palabras
    public int countWords(String frase){
        StringTokenizer st = new StringTokenizer(frase);
        return st.countTokens();
    }
    
    
}
