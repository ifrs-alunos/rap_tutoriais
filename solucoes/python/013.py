#13. Faça um programa que, 
# ao receber o valor da largura e do comprimento de uma figura geométrica, 
# detecta se esta é um quadrado ou um retângulo.
largura = int(input())
comprimento= int(input())
if largura==comprimento:
    print('quadrado')
else:
    print('retângulo')