// 11. Faça um programa que lê um número inteiro e mostra na tela se ele é par ou ímpar.

import java.util.Scanner;

public class ex011 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número");
        int numero = sc.nextInt();
        sc.close();
        if (numero%2==0){
          System.out.println("Par");
        }else{
          System.out.println("Impar");
        }
      }
      
}
