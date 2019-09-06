package exercisesjava;
import java.util.Scanner;

public class funcoes {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int x;
        int soma = 0;
        
        System.out.println("Digite um valor para x: ");
        x = s.nextInt();
        
        for(int i = 1; i<=x; i++){
            soma = soma +i;
        }
        
        System.out.println(soma);
        
    }
}         
        
       
    
        

