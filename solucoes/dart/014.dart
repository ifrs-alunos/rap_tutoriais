// 14. Faça um algoritmo que lê um número e retorna uma das mensagens: número maior que 30, igual a 30 ou menor do que 30.

import 'dart:io';
main(){
  print("Digite um número:");
  int numero = int.parse(stdin.readLineSync());
  if (numero < 30){
    print("Número menor que 30");
  } else if (numero > 30){
    print("Número maior que 30");
  } else {
    print("Número igual à 30");
  }
}