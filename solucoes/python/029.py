#29. Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. 
# Para isso, desenvolva um programa para ler o nome do cliente e o tipo de combustível abastecido:
#  1. álcool 2.gasolina 3.diesel 4.Finalizar. 
# Caso o usuário informe um código inválido, isto é, fora da faixa de 1 a 4, 
# então deve ser solicitado um novo código (até que seja válido). 
# Ao ser informado o código do combustível, o seu respectivo nome deve ser impresso na tela. 
# O programa será encerrado quando o código informado for o número 4 mostre na tela a mensagem:
#  "MUITO OBRIGADO por participar da pesquisa de opinião", 
# o total de clientes que participaram da pesquisa 
# e a quantidade de clientes que abasteceram cada tipo de combustível.

nome = input()
tipo_combustivel = int(input())
numero_clientes = 0
alcool = gasolina = diesel = 0
a = True
while a:
    print("1. álcool 2.gasolina 3.diesel 4.Finalizar")
    numero = int(input())
    if numero ==1:
        alcool= alcool + 1
        numero_clientes= numero_clientes+1
    if numero ==2:
        gasolina= gasolina + 1
        numero_clientes= numero_clientes+1
    if numero ==3:
        diesel= diesel + 1
        numero_clientes= numero_clientes+1
    if numero==4:
        a = False
print("MUITO OBRIGADO por participar da pesquisa de opinião\nTotal de Pessoas: {}\nAlcool: {}\nGasolina: {}\nDiesel: {}".format(numero_clientes,alcool,gasolina,diesel))
