// 3. Faça programa que pede três números e calcula e mostra na tela a média aritmética entre eles.
import 'dart:io';
main(){
  print("Digite 3 números:");
  int num1 = int.parse(stdin.readLineSync());
  int num2 = int.parse(stdin.readLineSync());
  int num3 = int.parse(stdin.readLineSync());
  //lê os 3 numeros como strings e os converte para inteiros
  double media = (num1 + num2 + num3)/3;
  print(media);
}