// 10. Faça um programa que pede dois números inteiros e mostre na tela a diferença entre eles.

import 'dart:io';
main(){
  print("Digite o primeiro número:");
  int primeiro_numero = int.parse(stdin.readLineSync());
  print("Digite o segundo número:");
  int segundo_numero = int.parse(stdin.readLineSync());
  if (primeiro_numero>segundo_numero){
    print(primeiro_numero-segundo_numero);
  } else if (segundo_numero>primeiro_numero){
    print(segundo_numero-primeiro_numero);
  } else {
    print(0);
  }
  
}