// 11. Faça um programa que lê um número inteiro e mostra na tela se ele é par ou ímpar.

import 'dart:io';
main(){
  print("Digite um número");
  int numero = int.parse(stdin.readLineSync());
  if (numero%2==0){
    print("Par");
  }else{
    print("Impar");
  }
}