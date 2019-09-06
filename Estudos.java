package exercisesjava;

import java.util.Scanner;

public class Estudos {

  
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        float dolar = 0, cotacaoDolar = 0;
                
        System.out.println("Qual a cotação atual do dólar?");
        cotacaoDolar = s.nextFloat();
        System.out.println("Digite a quantidade de dólares que você possui: ");
        dolar = s.nextFloat();
        System.out.println("Este valor equivale à " + (dolar*cotacaoDolar) + " reais");
        
    }
    
}
