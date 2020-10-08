// 22. Faça um algoritmo que peça um número inteiro por uma quantidade indeterminada de vezes e pare de pedir quando o número informado for menor ou igual à 0.

import 'dart:io';
main(){
  bool flag = true;
  while (flag) {
    int numero = int.parse(stdin.readLineSync());
    if (numero==0){
      flag = false;
    }
  }
}