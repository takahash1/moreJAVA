package exercisesjava;

import java.util.Scanner;

public class temperatura {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        float c;
                     
        System.out.println("Digite a temperatura em graus Celsius: ");
        c = s.nextFloat();             
        System.out.println((9*c+160)/5);
        
    }
        
}
