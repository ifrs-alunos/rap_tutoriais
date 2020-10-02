// Em uma rede de computadores, o firewall restringe o acesso à Internet dependendo do horário e do tipo de usuário que faz o acesso. Os tipos de usuários abaixo tem as seguintes restrições:
// •Funcionário: apenas entre 0 e 7, entre 18 e 0 e entre 12 e 13
// •Financeiro: qualquer horário
// •Diretoria: qualquer horário
// Faça um algoritmo que informa se o acesso foi permitido, considerando o horário e o tipo de usuário.

import 'dart:io';
main(){
  String tipo_usuario = stdin.readLineSync().toLowerCase();
  int hora = int.parse(stdin.readLineSync());
  if (tipo_usuario == "financeiro" || tipo_usuario == "diretoria"){
    print("Permitido");
  } else {
    if ((hora >= 0 && hora <= 7)||(hora >= 18)||(hora >= 12 && hora <= 13)) {
      print("Permitido");
    } else {
      print("Negado");
    }
  }
}