// 2. Faça um programa que peça o nome da pessoa e imprima a mensagem “Bom dia [nomedapessoa]!”
import 'dart:io';
main(){
  print("Qual o seu nome?");
  String nomedapessoa = stdin.readLineSync();
  print("Bom dia $nomedapessoa!");
}