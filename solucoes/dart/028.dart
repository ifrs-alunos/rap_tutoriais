// 28. Elabore um algoritmo que lê vários números positivos e mostra a média dos números digitados.

import 'dart:io';
main(){
  double vezes = 0;
  double total = 0;
  while (true){
    double numero = double.parse(stdin.readLineSync());
    total = total + numero;
    vezes = vezes + 1;
    print(total/vezes);
  }
}