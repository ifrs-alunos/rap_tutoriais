// 31. O Brasil é o país sede da copa esse ano. Porém, há muitas pessoas protestando contra o governo. Em redes sociais é possível ver pessoas afirmando que não vai ter copa devido aos protestos. Mas esses rumores de que não haverá copa são totalmente falsos, a presidente Dilma Rousseff já avisou: vai ter copa sim, e se reclamar vai ter duas!
// A entrada contém vários casos de teste e termina com EOF. Cada caso de teste consiste de uma linha contendo o número N de reclamações sobre a copa encaminhadas para a presidente. Para cada teste, a saída consiste de uma linha dizendo "vai ter copa!" caso não haja reclamações para a presidente. Caso haja reclamações, a saída deverá dizer "vai ter duas!".

import java.util.Scanner;

public class ex031 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int copa = sc.nextInt();
            if (copa == 0){
                System.out.println("vai ter copa!");
            } else {
                System.out.println("vai ter duas!");
            }
        }
        sc.close();
    }
}
