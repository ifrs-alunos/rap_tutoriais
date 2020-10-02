// 7. Faça um programa para calcular o IMC de uma pessoa,pedindo o peso,nome e altura da pessoa e imprima a mensagem “{nome da pessoa} seu IMC é: {imc}”.IMC(dividir o peso pela altura ao quadrado)

import 'dart:io';
main(){
  print("Digite seu nome:");
  String nome = stdin.readLineSync();
  print("Digite sua altura:");
  double altura = double.parse(stdin.readLineSync());
  print("Digite seu peso:");
  double peso = double.parse(stdin.readLineSync());
  double imc = (peso/(altura*altura));
  print("$nome seu IMC é: $imc");
}