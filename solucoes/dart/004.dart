// 4. Faça um programa que pede os dois catetos (float/double) de um triângulo retângulo, calcula a hipotenusa (a² = b² + c², sendo “a”, a hipotenusa, e “b” e “c” , os catetos), e mostra o resultado na tela com 2 números depois da vírgula.
import 'dart:io';
import 'dart:math';
main(){
  print("Digite o primeiro cateto:");
  double cateto1 = double.parse(stdin.readLineSync());
  print("Digite o segundo cateto:");
  double cateto2 = double.parse(stdin.readLineSync());
  double hipotenusa = (sqrt(pow(cateto1, 2) + pow(cateto2, 2)));
  //calcula a hipotenusa usando as funções importadas da biblioteca math
  print("${hipotenusa.toStringAsFixed(2)}");
  //usa o método "toStringAsFixed() para definir o número de casas após a virgula"
}