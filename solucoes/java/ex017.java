// Em uma rede de computadores, o firewall restringe o acesso à Internet dependendo do horário e do tipo de usuário que faz o acesso. Os tipos de usuários abaixo tem as seguintes restrições:
// •Funcionário: apenas entre 0 e 7, entre 18 e 0 e entre 12 e 13
// •Financeiro: qualquer horário
// •Diretoria: qualquer horário
// Faça um algoritmo que informa se o acesso foi permitido, considerando o horário e o tipo de usuário.

import java.util.Scanner;

public class ex017 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String tipo_usuario = sc.next().toLowerCase();
        int hora = sc.nextInt();
        sc.close();
        if (tipo_usuario == "financeiro" || tipo_usuario == "diretoria"){
          System.out.println("Permitido");
        } else {
          if ((hora >= 0 && hora <= 7)||(hora >= 18)||(hora >= 12 && hora <= 13)) {
            System.out.println("Permitido");
          } else {
            System.out.println("Negado");
          }
        }
      }
      
}
