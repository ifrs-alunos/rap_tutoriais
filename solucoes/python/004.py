#4. Faça um programa que pede os dois catetos (float/double) de um triângulo retângulo,
#  calcula a hipotenusa (a² = b² + c², sendo “a”, a hipotenusa, e “b” e “c” , os catetos), 
# e mostra o resultado na tela com 2 números depois da vírgula.
cateto1 = float(input())
cateto2 = float(input())
hipotenusa = ((cateto1**2)+(cateto2**2))**(0.5)
print("{:.2f}".format(hipotenusa))
