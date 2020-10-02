// 23. Faça um programa que imprime os números de 1 a 20 e mostra a soma dos valores pares.

import 'dart:io';
main(){
  for (var i = 1; i<=20; i++){
    if (i%2==0){
      print("$i é par.");
    }
  }
}