#7. Faça um programa para calcular o IMC de uma pessoa,pedindo o peso,
# nome e altura da pessoa e imprima a mensagem “{nome da pessoa} seu IMC é: {imc}”
# IMC(dividir o peso pela altura ao quadrado).


peso = float(input("Seu peso: "))
nome = input("Seu nome: ")
altura = float(input("Sua altura: "))
imc = peso/(altura**2)
print("{} seu IMC é: {:.1f}".format(nome,imc))