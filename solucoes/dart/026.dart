// 26. Faça um algoritmo que leia um número e mostre a soma dos números múltiplos de 5 no intervalo aberto entre 1 e o número digitado. O número digitado deve ser maior que zero.

import 'dart:io';
main(){
  int numero = int.parse(stdin.readLineSync());
  int contador = 0;
  for (var i = 1; i<=numero; i++){
    if (i%5==0){
      contador = contador + i;
    }
  }
  print(contador);
}