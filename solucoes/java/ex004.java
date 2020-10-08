// 4. Faça um programa que pede os dois catetos (float/double) de um triângulo retângulo, calcula a hipotenusa (a² = b² + c², sendo “a”, a hipotenusa, e “b” e “c” , os catetos), e mostra o resultado na tela com 2 números depois da vírgula.

import java.util.Scanner;
import java.lang.Math;

public class ex004 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do primeiro cateto:");
        double cateto1 = sc.nextDouble();
        System.out.println("Digite o valor do segundo cateto:");
        double cateto2 = sc.nextDouble();
        double hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
        sc.close();
        System.out.printf("%.2f\n", hipotenusa);
    }
}
