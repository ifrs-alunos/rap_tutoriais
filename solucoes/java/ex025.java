// 25. Elabore um algoritmo que lê 10 números e imprime a metade e o quadrado e o cubo de cada número.

import java.util.Scanner;
import java.lang.Math;

public class ex025 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        for (int i=0; i<10; i++){
            double numero = sc.nextDouble();
            double metade = numero/2.0;
            double quadrado = Math.pow(numero, 2);
            double cubo = Math.pow(numero, 3);
            System.out.printf("metade: %.1f, quadrado: %.1f, cubo: %.1f\n", metade, quadrado, cubo);
        }
        sc.close();
    }
}
