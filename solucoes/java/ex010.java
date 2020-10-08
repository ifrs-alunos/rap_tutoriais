// 10. Faça um programa que pede dois números inteiros e mostre na tela a diferença entre eles.

import java.util.Scanner;

public class ex010 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        int primeiro_numero = sc.nextInt();
        System.out.println("Digite o segundo número:");
        int segundo_numero = sc.nextInt();
        sc.close();
        if (primeiro_numero>segundo_numero){
          System.out.println(primeiro_numero-segundo_numero);
        } else if (segundo_numero>primeiro_numero){
          System.out.println(segundo_numero-primeiro_numero);
        } else {
          System.out.println(0);
        }   
    }      
}
