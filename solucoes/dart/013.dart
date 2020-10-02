// 13. Faça um programa que, ao receber o valor da largura e do comprimento de uma figura geométrica, detecta se esta é um quadrado ou um retângulo.

import 'dart:io';
main(){
  print("Digite a largura da figura:");
  int largura = int.parse(stdin.readLineSync());
  print("Digite a largura da figura:");
  int comprimento = int.parse(stdin.readLineSync());
  if (largura==comprimento){
    print("Quadrado");
  } else {
    print("Retângulo");
  }
}