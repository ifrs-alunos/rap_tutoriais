#23. Faça um programa que imprime os números de 1 a 20 e mostra a soma dos valores pares.
soma= 0
for x in range(1,20):
    print(x)
    if x%2==0:
        soma=soma+x
print(soma)        

