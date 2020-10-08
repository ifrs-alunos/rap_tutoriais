// 29. Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Para isso, desenvolva um programa para ler o nome do cliente e o tipo de combustível abastecido:
// 1.álcool
// 2.gasolina
// 3.diesel
// 4.Finalizar.
// Caso o usuário informe um código inválido, isto é, fora da faixa de 1 a 4, então deve ser solicitado um novo código (até que seja válido).
// Ao ser informado o código do combustível, o seu respectivo nome deve ser impresso na tela. O programa será encerrado quando o código informado for o número 4 mostre na tela a mensagem: "MUITO OBRIGADO por participar da pesquisa de opinião", o total de clientes que participaram da pesquisa e a quantidade de clientes que abasteceram cada tipo de combustível.

import java.util.Scanner;

public class ex029 {
    public static void main(String[] args){
        Boolean flag1 = true;
        Boolean flag2 = true;
        int n_clientes=0, n_alcool=0, n_gasolina=0, n_diesel=0;
        Scanner sc = new Scanner(System.in);
        while (flag1){
            flag2 = true;
            while (flag2){
                System.out.println("Digite seu nome:");
                String nome = sc.next();
                n_clientes = n_clientes + 1;
                System.out.println("Escolha um tipo de combustível:\n[1] Álcool\n[2] Gasolina\n[3] Diesel \n[4] Finalizar");
                int tipo_combustivel = sc.nextInt();
                if (tipo_combustivel == 4){
                    System.out.printf("MUITO OBRIGADO %s por participar da pesquisa de opinião\n", nome);
                    System.out.printf("%s participaram da pesquisa.\n", n_clientes);
                    System.out.printf("%s abasteceram com álcool, %s abasteceram com gasolina e %s abasteceram com diesel.\n", n_alcool, n_gasolina, n_diesel);
                    flag2 = false;
                } else if (tipo_combustivel == 1){
                    System.out.println("Álcool");
                    n_alcool = n_alcool + 1;
                } else if (tipo_combustivel == 2){
                    System.out.println("Gasolina");
                    n_gasolina = n_gasolina + 1;
                } else if (tipo_combustivel == 3){
                    n_diesel = n_diesel + 1;
                }
            }
        }
        sc.close();
    }      
}
