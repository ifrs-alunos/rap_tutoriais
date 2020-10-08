// 24. Faça um programa que mostra os números múltiplos de 5, no intervalo de 20 a 100.

public class ex024 {
    public static void main(String[] args){
        for (var i = 20; i<=100; i++){
            if (i%5==0){
                System.out.printf("%d é múltiplo de 5.\n", i);
            }
        }
    }  
}
