// 28. Elabore um algoritmo que lê vários números positivos e mostra a média dos números digitados.

import java.util.Scanner;

public class ex028 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double vezes = 0;
        double total = 0;
        while (true){
            double numero = sc.nextDouble();
            total = total + numero;
            vezes = vezes + 1.0;
            System.out.println(total/vezes);
        }
    }
}
