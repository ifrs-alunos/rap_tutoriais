// 13. Faça um programa que, ao receber o valor da largura e do comprimento de uma figura geométrica, detecta se esta é um quadrado ou um retângulo.

import java.util.Scanner;

public class ex013 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a altura da figura:");
        int largura = sc.nextInt();
        System.out.println("Digite a largura da figura:");
        int comprimento = sc.nextInt();
        sc.close();
        if (largura==comprimento){
            System.out.println("Quadrado");
        } else {
            System.out.println("Retângulo");
        }
    }      
}
