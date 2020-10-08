// 16. Faça um algoritmo para ler dois números inteiros e informar se estes números são iguais ou se são diferentes.

import java.util.Scanner;

public class ex016 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        int num1 = sc.nextInt();
        System.out.println("Digite o segundo número:");
        int num2 = sc.nextInt();
        sc.close();
        if (num1 == num2){
          System.out.println("Os dois números são iguais");
        } else {
          System.out.println("Os dois números são diferentes");
        }
    }      
}
