#25. Elabore um algoritmo que lê 10 números e imprime a metade e o quadrado e o cubo de cada número.

for x in range(10):
    numero = int(input())
    metade = numero/2
    quadrado= numero**2
    cubo = numero**3
    print(metade,quadrado,cubo)