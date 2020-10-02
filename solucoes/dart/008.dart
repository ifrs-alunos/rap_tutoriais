// 8. Faça um programa que pede o número de horas de jogatina de uma pessoa e calcule quanto tempo em dias ela gastou jogando.

import 'dart:io';
main(){
  print("Digite quantas horas você já jogou:");
  int numero_de_horas = int.parse(stdin.readLineSync());
  int dias = numero_de_horas~/24;
  print("$dias dias foram gastos jogando.");
}