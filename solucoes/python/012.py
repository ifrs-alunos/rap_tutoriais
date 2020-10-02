#Faça um programa que pede o DDD do usuário e mostre na tela sua cidade baseado na tabela abaixo. 
#Caso o DDD não esteja na tabela, mostre “DDD não cadastrado”.
ddd = int(input("Digite seu DDD: "))

if ddd==54:
    print("Vacaria")
elif ddd==34:
    print("Uberlândia")
elif ddd==51:
    print("Porto Alegre")
elif ddd==71:
    print("Salvador")
elif ddd==11:
    print("São Paulo")
else:
    print("DDD não cadastrado")