// 12. Faça um programa que pede o DDD do usuário e mostre na tela sua cidade baseado na tabela abaixo. Caso o DDD não esteja na tabela, mostre “DDD não cadastrado”.

import java.util.Scanner;

public class ex012 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu DDD:");
        int ddd = sc.nextInt();
        sc.close();
        switch (ddd){
            case 54:
            System.out.println("Vacaria");
            break;
            case 34:
            System.out.println("Uberlândia");
            break;
            case 51:
            System.out.println("Porto Alegre");
            break;
            case 71:
            System.out.println("Salvador");
            break;
            case 11:
            System.out.println("São Paulo");
            break;
            default:
            System.out.println("DDD não cadastrado");
        }
    }      
}
