// 9. Faça um programa que peça o salário de um vendedor, quanto foi o valor das suas vendas do mês, e a porcentagem da sua comissão e imprima o salário com o bônus.

import 'dart:io';
main(){
  print("Digite seu salário:");
  double salario = double.parse(stdin.readLineSync());
  print("Digite o valor de suas vendas nesse mês:");
  double vendas = double.parse(stdin.readLineSync());
  print("Digite a porcentagem da sua comissão:");
  double comissao = double.parse(stdin.readLineSync());
  double salario_com_bonus = salario + (vendas*(comissao/100));
  print("Seu salário com com bônus é: $salario_com_bonus");
}