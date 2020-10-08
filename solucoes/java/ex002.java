// 2. Faça um programa que peça o nome da pessoa e imprima a mensagem “Bom dia [nomedapessoa]!”

import java.util.Scanner;

public class ex002 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual seu nome?");
        String nome = sc.next();
        sc.close();
        System.out.println("Bom dia" + nome);
    }
}