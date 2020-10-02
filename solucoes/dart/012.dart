// 12. Faça um programa que pede o DDD do usuário e mostre na tela sua cidade baseado na tabela abaixo. Caso o DDD não esteja na tabela, mostre “DDD não cadastrado”.

import 'dart:io';
main(){
  print("Digite seu DDD:");
  int ddd = int.parse(stdin.readLineSync());
  switch (ddd){
    case 54:
    print("Vacaria");
    break;
    case 34:
    print("Uberlândia");
    break;
    case 51:
    print("Porto Alegre");
    break;
    case 71:
    print("Salvador");
    break;
    case 11:
    print("São Paulo");
    break;
    default:
    print("DDD não cadastrado");
  }
}