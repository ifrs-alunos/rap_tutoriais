// 6. Faça um programa que converta metros para centímetros.

import 'dart:io';
main(){
  double metros = double.parse(stdin.readLineSync());
  double centimetros = metros*100;
  print(centimetros);
}