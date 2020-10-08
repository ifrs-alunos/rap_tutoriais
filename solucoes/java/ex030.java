// 30. Dado um país A, com 5.000.000 de habitantes e uma taxa de natalidade de 3% ao ano, e um país B com 7.000.000 de habitantes e uma taxa de natalidade de 2% ao ano, calcular e imprimir o tempo necessário para que a população do país A ultrapasse a população do país B.]

public class ex030 {
    public static void main(String[] args){
        double populacao_a = 5000000, populacao_b = 7000000;
        int anos_passados = 0;
        while (populacao_a <= populacao_b){
          populacao_a = (populacao_a + (3.0/100.0)*populacao_a);
          populacao_b = (populacao_b + (2.0/100.0)*populacao_b);
          anos_passados = anos_passados + 1;
        }
        System.out.println(anos_passados);
    }
}
