// 22. Faça um algoritmo que peça um número inteiro por uma quantidade indeterminada de vezes e pare de pedir quando o número informado for menor ou igual à 0.

import java.util.Scanner;

public class ex022 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Boolean flag = true;
        while (flag) {
            int numero = sc.nextInt();
            if (numero==0){
                sc.close();
                flag = false;
            }
        }
    }      
}
