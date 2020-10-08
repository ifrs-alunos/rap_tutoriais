// 27. Elabore um algoritmo que entre com 12 números e imprime a média desses números.

import java.util.Scanner;

public class ex027 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double total = 0;
        for (int i=0; i<12; i++){
            double numero = sc.nextDouble();
            total = total + numero;
        }
        sc.close();
        System.out.println(total/12);
    }  
}
