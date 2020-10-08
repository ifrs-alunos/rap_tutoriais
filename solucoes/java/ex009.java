// 9. Faça um programa que peça o salário de um vendedor, quanto foi o valor das suas vendas do mês, e a porcentagem da sua comissão e imprima o salário com o bônus.

import java.util.Scanner;

public class ex009 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu salário:");
        double salario = sc.nextDouble();
        System.out.println("Digite o valor de suas vendas nesse mês:");
        double vendas = sc.nextDouble();
        System.out.println("Digite a porcentagem da sua comissão:");
        double comissao = sc.nextDouble();
        sc.close();
        double salario_com_bonus = salario + (vendas*(comissao/100));
        System.out.printf("Seu salário com com bônus é: %s\n", salario_com_bonus);
      }
}
