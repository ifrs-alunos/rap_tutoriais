// 7. Faça um programa para calcular o IMC de uma pessoa,pedindo o peso,nome e altura da pessoa e imprima a mensagem “{nome da pessoa} seu IMC é: {imc}”.IMC(dividir o peso pela altura ao quadrado)

import java.util.Scanner;

public class ex007 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        String nome = sc.next();
        System.out.println("Digite sua altura:");
        double altura = sc.nextDouble();
        System.out.println("Digite seu peso:");
        double peso = sc.nextDouble();
        sc.close();
        double imc = (peso/(altura*altura));
        System.out.printf("%s seu IMC é: %.1f\n", nome, imc);
    }
}
