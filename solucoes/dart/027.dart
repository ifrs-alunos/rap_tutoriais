// 27. Elabore um algoritmo que entre com 12 números e imprime a média desses números.

import 'dart:io';
main(){
  double total = 0;
  for (int i=0; i<12; i++){
    double numero = double.parse(stdin.readLineSync());
    total = total + numero;
  }
  print(total/12);
}