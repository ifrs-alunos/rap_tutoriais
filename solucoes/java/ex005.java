// 5. Faça um programa que leia a quantidade de minutos que se passaram desde o começo do dia e mostre na tela esse valor em horas.

import java.util.Scanner;

public class ex005 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número de minutos desde o começo do dia:");
        int minutos = sc.nextInt();
        sc.close();
        String hora = String.format("%d:%d", minutos/60, minutos%60);
        System.out.println(hora);
    }
}
