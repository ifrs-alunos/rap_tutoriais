// 26. Faça um algoritmo que leia um número e mostre a soma dos números múltiplos de 5 no intervalo aberto entre 1 e o número digitado. O número digitado deve ser maior que zero.

import java.util.Scanner;

public class ex026 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        sc.close();
        int contador = 0;
        for (var i = 1; i<=numero; i++){
            if (i%5==0){
                contador = contador + i;
            }
        }
        System.out.println(contador);
    }
}
