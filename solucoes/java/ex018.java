// 18. A prefeitura de Porto Alegre abriu uma linha de crédito para os funcionários estatutários. O valor máximo da prestação não poderá ultrapassar 30% do salário bruto. Elabore um algoritmo que permita entrar com o salário bruto e o valor da prestação e informar se o empréstimo pode ou não ser concedido.

import java.util.Scanner;

public class ex018 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu salário bruto:");
        double salario = sc.nextDouble();
        System.out.println("Digite o valor da prestação:");
        double prestacao = sc.nextDouble();
        sc.close();
        if (prestacao>(salario*0.3)){
          System.out.println("O empréstimo pode ser concedido");
        } else {
          System.out.println("O empréstimo não pode ser concedido");
        }
    }      
}
