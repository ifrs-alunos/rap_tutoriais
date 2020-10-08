// 15. Faça um algoritmo que verifica a validade de uma senha fornecida pelo usuário. A senha válida é o número 123456. Deve ser impresso as seguintes mensagens:
// •ACESSO PERMITIDO caso a senha seja válida
// •ACESSO NEGADO caso a senha seja inválida

import java.util.Scanner;

public class ex015 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int senhavalida = 123456;
        int senha = sc.nextInt();
        sc.close();
        if (senha == senhavalida){
          System.out.println("ACESSO PERMITIDO");
        } else {
          System.out.println("ACESSO NEGADO");
        }
    }      
}
