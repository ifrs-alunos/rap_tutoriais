// 23. Faça um programa que imprime os números de 1 a 20 e mostra a soma dos valores pares.

public class ex023 {
    public static void main(String[] args){
        for (var i = 1; i<=20; i++){
            if (i%2==0){
                System.out.printf("%d é par.\n", i);
            }
        }
    }      
}
