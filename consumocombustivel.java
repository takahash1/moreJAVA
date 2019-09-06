package exercisesjava;

import java.util.Scanner;

public class consumocombustivel {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        float consumoMedio = 12;
        float tempo;
        float velocidadeMedia; 
        
        
        System.out.println("Digite o tempo gasto na viagem: ");
        tempo = s.nextFloat();
        System.out.println("Digite a velocidade média: ");
        velocidadeMedia = s.nextFloat();
        
        System.out.println("Você obteve uma velocidade média de: "+ velocidadeMedia + "kilometros.");
        System.out.println("Seu tempo de viagem foi de: " + tempo + "horas.");
        System.out.println("A distância percorrida foi: " + tempo*velocidadeMedia + "kilometros.");
        System.out.println("Você usou " + (tempo*velocidadeMedia)/12 + "litros");
    }
}
