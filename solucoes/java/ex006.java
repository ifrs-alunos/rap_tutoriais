// 6. Faça um programa que converta metros para centímetros.

import java.util.Scanner;

public class ex006 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double metros = sc.nextDouble();
        sc.close();
        double centimetros = (metros*100);
        System.out.println(centimetros);
    }
}
