package exercisesjava;

import java.util.Scanner;

public class VetorMaisVetor {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int soma = 0, menor = 0;
        int[] vetor = new int[3];
                          
        int maior = vetor[0];
        
        System.out.println("Digite " + vetor.length + " números: ");
        for (int x = 0; x < vetor.length; x++) {
            vetor[x] = s.nextInt();
            menor = vetor[0];
            soma += vetor[x];

            if (vetor[x] > maior) {
                maior = vetor[x];
            }
            if (vetor[x] < menor) {
                menor = vetor[x];
            }            
        }
        System.out.println("IMPRIMINDO VETOR......");
        for (int x = 0; x < vetor.length; x++) {
            System.out.print(vetor[x] + ", ");
        }
        System.out.println("");
        System.out.println("IMPRIMINDO NÚMEROS PARES DO VETOR ...");
        for (int x = 0; x < vetor.length; x++) {
            if (vetor[x] % 2 == 0) {
                System.out.print(vetor[x] + ", ");
            }
        }
        System.out.println("");
        System.out.println("IMPRIMINDO NÚMEROS MULTIPLOS DE 3 ...");
        for (int x = 0; x < vetor.length; x++) {
            if (vetor[x] % 3 == 0){
                System.out.println(vetor[x] + ", ");
            }
        }
        System.out.println("");
        
        System.out.println("O menor valor do vetor é: " + menor);
        System.out.println("O maior valor do vetor é: " + maior);
        System.out.println("A soma deste vetor é: " + soma);
        System.out.println("A média total do vetor é igual a: " + soma / vetor.length);
        System.out.println("A média entre o maior valor e o menor é igual a: " + (menor+maior)/2);
    }
}
