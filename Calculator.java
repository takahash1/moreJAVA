package exercisesjava;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double soma, div, sub, mult, num1, num2;
        String escolha;

        System.out.println("Escolha a operação que deseja fazer entre dois números: ");
        System.out.println("1 - Adição");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.println("0 - Sair");
        escolha = s.nextLine();
        s.nextLine();

        while (!"0".equals(escolha)) {
            System.out.println("Escolha um número: ");
            num1 = s.nextInt();
            System.out.println("Escolha o segundo número: ");
            num2 = s.nextInt();

            if (escolha.equals("1")) {
                soma = num1 + num2;
                System.out.println("A soma entre os dois números é: " + soma);
            }
            if (escolha.equals("2")) {
                sub = num1 - num2;
                System.out.println("A subtração entre os dois números é: " + sub);
            }
            if (escolha.equals("3")) {
                mult = num1 * num2;
                System.out.println("A multiplicação entre estes dois números é: " + mult);
            }
            if (escolha.equals("4")){
                div = num1 / num2;
                System.out.println("A divisão entre os dois números é: " + div);                       
            }
            if (escolha.equals("0")){
                System.out.println("Ok, até a próxima!");
            }
            
        }
    }
}
