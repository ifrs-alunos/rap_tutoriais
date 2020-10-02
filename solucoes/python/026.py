#26. Faça um algoritmo que leia um número e mostre a soma dos números múltiplos de 5 no 
# intervalo aberto entre 1 e o número digitado. O número digitado deve ser maior que zero.
x = int(input())
soma = 0
if x<=0:
    print("Numero Invalido")
else:
    for numero in range(1,x):
        if numero%5==0:
            soma= soma+numero
    print(soma)