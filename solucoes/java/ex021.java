// 21. Faça um programa que mostre a soma dos números de 1 à x (usando for), sendo x um inteiro pedido ao usuário.

import java.util.Scanner;

public class ex021 {
    public static void main(String[] args){
        int contador = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número:");
        int x = sc.nextInt();
        sc.close();
        for (var i = 1; i<=x; i++){
          contador = contador + i;
        }
        System.out.println(contador);
    }      
}
