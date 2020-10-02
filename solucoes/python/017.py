#17. Em uma rede de computadores, o firewall restringe o acesso à Internet dependendo do horário e do tipo de usuário que faz o acesso. 
# Os tipos de usuários abaixo tem as seguintes restrições: 
# •Funcionário: apenas entre 0 e 7, entre 18 e 0 e entre 12 e 13 
# •Financeiro: qualquer horário 
# •Diretoria: qualquer horário 
# Faça um algoritmo que informa se o acesso foi permitido, considerando o horário e o tipo de usuário.

tipo_usuario = input()
hora = int(input())
if (tipo_usuario == "Financeiro" or tipo_usuario == "Diretoria")
    print("Permitido")
else 
    if ((hora >= 0 and hora <= 7)or(hora >= 18)or(hora >= 12 and hora <= 13)) 
      print("Permitido")
    else:
        print("Não permitido")
