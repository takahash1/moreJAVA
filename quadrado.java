package exercisesjava;

import java.util.Scanner;

public class quadrado {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int x, area, perimetro;
        
        System.out.println("Digite o valor de um lado de um quadrado em centímetros: ");
        x = s.nextInt();
        area = x*x;
        perimetro = x*4;
        
        System.out.println("A área deste quadrado é igual a " + area + " centímetros,");
        System.out.println("Já o perímetro é igual a " + perimetro + " centímetros!");
    }
}
