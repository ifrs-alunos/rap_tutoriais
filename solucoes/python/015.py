#15. Escreva um algoritmo para ler o ano de nascimento de 3 irmãos, 
# escreva uma mensagem que indique se eles são TRIGÊMEOS, GÊMEOS, ou apenas IRMÃOS. 
# Considere que eles são GÊMEOS se dois deles possuem a mesma idade e o outro diferente dos demais, 
# e apenas irmãos se todas as idades forem diferentes.
anodenascimento1= int(input())
anodenascimento2= int(input())
anodenascimento3= int(input())
if anodenascimento1==anodenascimento2==anodenascimento3:
    print("TRIGÊMEOS")
else:
    if anodenascimento1!=anodenascimento2!=anodenascimento3:
        print("IRMÃOS")
    else:
        print("GÊMEOS")

