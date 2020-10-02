// 5. Faça um programa que leia a quantidade de minutos que se passaram desde o começo do dia e mostre na tela esse valor em horas.
import 'dart:io';
main(){
  print("Digite o número de minutos desde o começo do dia:");
  int minutos = int.parse(stdin.readLineSync());
  print("${minutos~/60}:${minutos%60}");
  //o operador ~/ é usado para a divisão inteira, já o operador % é usado para mostrar o resto de uma divisão inteira.
}