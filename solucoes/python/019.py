#19. Você deve fazer um programa que leia um valor qualquer e 
#apresente uma mensagem dizendo em qual dos seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) 
#este valor se encontra. Obviamente se o 
#valor não estiver em nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.
n = float(input())

if n >= 0 and n <= 25:
	print("Intervalo [0,25]")

elif n > 25 and n <= 50:
	print("Intervalo (25,50]")

elif n > 50 and n <= 75:
	print("Intervalo (50,75]")

elif n > 75 and n <= 100:
	print("Intervalo (75,100]")

else:
	print("Fora de intervalo")