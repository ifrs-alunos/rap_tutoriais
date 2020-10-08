// 3. Faça programa que pede três números e calcula e mostra na tela a média aritmética entre eles.

import java.util.Scanner;

public class ex003 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite 3 números:");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        sc.close();
        System.out.println((n1 + n2 + n3)/3);
    }
}
