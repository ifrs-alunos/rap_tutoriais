#22. Faça um algoritmo que peça um número inteiro por uma quantidade indeterminada 
# de vezes e pare de pedir quando o número informado for menor ou igual à 0.
a = True
while a:
    numero = int(input())
    if numero<=0:
        a=False
