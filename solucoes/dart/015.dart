// 15. Faça um algoritmo que verifica a validade de uma senha fornecida pelo usuário. A senha válida é o número 123456. Deve ser impresso as seguintes mensagens:
// •ACESSO PERMITIDO caso a senha seja válida
// •ACESSO NEGADO caso a senha seja inválida

import 'dart:io';
main(){
  int senhavalida = 123456;
  int senha = int.parse(stdin.readLineSync());
  if (senha == senhavalida){
    print("ACESSO PERMITIDO");
  } else {
    print("ACESSO NEGADO");
  }
}