// 18. A prefeitura de Porto Alegre abriu uma linha de crédito para os funcionários estatutários. O valor máximo da prestação não poderá ultrapassar 30% do salário bruto. Elabore um algoritmo que permita entrar com o salário bruto e o valor da prestação e informar se o empréstimo pode ou não ser concedido.

import 'dart:io';
main(){
  print("Digite seu salário bruto:");
  double salario = double.parse(stdin.readLineSync());
  print("Digite o valor da prestação:");
  double prestacao = double.parse(stdin.readLineSync());
  if (prestacao>(salario*0.3)){
    print("O empréstimo pode ser concedido");
  } else {
    print("O empréstimo não pode ser concedido");
  }
}