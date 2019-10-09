package hehexd;

import java.util.Scanner;

public class Aula0810 {

    public static void main(String[] args) {
        int maior = 0, soma = 0, menor = 0;
        

        Scanner s = new Scanner(System.in);
        int[] vetor = new int[3];
                
        System.out.println("Digite 2 números: ");
        for (int x = 0; x < 3; x++) {
            vetor[x] = s.nextInt();
            
            soma += vetor[x];
            
            if (vetor[x] > maior) {
                maior = vetor[x];
            } if (vetor[x] < menor) {
                menor = vetor[x];
            } 
        }
        for(int x = 0; x > 3; x++){
            if(vetor[x] % 2 == 0){
                System.out.println("Os valores pares deste vetor são: " + vetor[x]);
            }
        }
        System.out.println("A média deste vetor é igual a: " + (soma/vetor.length));
        System.out.println("A soma deste vetor é igual a: " + soma);
        System.out.println("O maior nº é: " + maior);        
        System.out.println("O menor nº é: " + menor);        
        System.out.println("IMPRIMINDO VETOR.....");
        
        for (int x = 0; x < 3; x++) {
            System.out.print(vetor[x] + ", ");
        }
    }
}
