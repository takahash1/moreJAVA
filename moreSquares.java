package exercisesjava;

import java.util.Scanner;

public class moreSquares {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int area, lado, maior =0;
        
        for(int i = 1; i<=3; i++){
        System.out.println("Digite o tamanho de um lado de um quadrado.");
        lado = s.nextInt();
        area = lado*lado;
        
        if(area>maior){
            maior = area;
        }
        }
        System.out.println("A maior área entre os quadrados digitados é " + maior + " centímetros.");
        
}
}
