// 25. Elabore um algoritmo que lê 10 números e imprime a metade e o quadrado e o cubo de cada número.

import 'dart:io';
import 'dart:math';
main(){
  for (int i=0; i<10; i++){
    double numero = double.parse(stdin.readLineSync());
    double metade = numero/2;
    double quadrado = pow(numero, 2);
    double cubo = pow(numero, 3);
    print("metade: $metade, quadrado: $quadrado, cubo: $cubo");
  }
}