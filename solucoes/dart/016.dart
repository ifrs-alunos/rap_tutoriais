// 16. Faça um algoritmo para ler dois números inteiros e informar se estes números são iguais ou se são diferentes.

import 'dart:io';
main(){
  print("Digite o primeiro número:");
  int num1 = int.parse(stdin.readLineSync());
  print("Digite o segundo número:");
  int num2 = int.parse(stdin.readLineSync());
  if (num1 == num2){
    print("Os dois números são iguais");
  } else {
    print("Os dois números são diferentes");
  }
}