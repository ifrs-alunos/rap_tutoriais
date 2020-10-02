#30. Dado um país A, com 5.000.000 de habitantes e uma taxa de natalidade de 3% ao ano, e 
# um país B com 7.000.000 de habitantes e uma taxa de natalidade de 2% ao ano, 
# calcular e imprimir o tempo necessário para que a população do país A ultrapasse a população do país B.
pa = 5000000
pb = 7000000
anos_passando=0
while pa<=pb :
        pa+=int((3/100)*pa)

        pb+=int((2/100)*pb)
        anos_passando +=1


print(anos_passando)