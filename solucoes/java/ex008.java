// 8. Faça um programa que pede o número de horas de jogatina de uma pessoa e calcule quanto tempo em dias ela gastou jogando.

import java.util.Scanner;

public class ex008 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite quantas horas você já jogou:");
        int numero_de_horas = sc.nextInt();
        sc.close();
        int dias = numero_de_horas/24;
        System.out.printf("%d dias foram gastos jogando.\n", dias);
    }
}
