// 20. Leia um valor inteiro, que é o tempo de duração em segundos de um determinado evento em uma fábrica, e informe-o expresso no formato de horas

import java.util.Scanner;

public class ex020 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o tempo do evento em segundos:");
        int tempo_do_evento = sc.nextInt();
        sc.close();
        System.out.printf("%d:%d\n", (tempo_do_evento/3600), ((tempo_do_evento%3600)/60));
    }      
}
