// 21. Faça um programa que mostre a soma dos números de 1 à x (usando for), sendo x um inteiro pedido ao usuário.

import 'dart:io';
main(){
  int contador = 0;
  print("Digite um número:");
  int x = int.parse(stdin.readLineSync());
  for (var i = 1; i<=x; i++){
    contador = contador + i;
  }
  print(contador);
}