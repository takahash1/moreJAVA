package exercisesjava;

import java.util.Scanner;

public class funcoesFAT {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int fat = 1, x;
        
        System.out.println("Digite um valor para x:");
        x = s.nextInt();
        
        for(int i = 1; i<= x; i++){
            fat = (fat*i);
        }
        
        System.out.println(fat);
    }
}
