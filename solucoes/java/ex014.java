// 14. Faça um algoritmo que lê um número e retorna uma das mensagens: número maior que 30, igual a 30 ou menor do que 30.

import java.util.Scanner;

public class ex014 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número:");
        int numero = sc.nextInt();
        sc.close();
        if (numero < 30){
          System.out.println("Número menor que 30");
        } else if (numero > 30){
          System.out.println("Número maior que 30");
        } else {
          System.out.println("Número igual à 30");
        }
    }      
}
