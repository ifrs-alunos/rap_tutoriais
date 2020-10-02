// 20. Leia um valor inteiro, que é o tempo de duração em segundos de um determinado evento em uma fábrica, e informe-o expresso no formato de horas

import 'dart:io';
main(){
  print("Digite o tempo do evento em segundos:");
  int tempo_do_evento = int.parse(stdin.readLineSync());
  print("${tempo_do_evento~/3600}:${(tempo_do_evento%3600)~/60}");
}