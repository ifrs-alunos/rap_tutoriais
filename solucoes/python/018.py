#18. A prefeitura de Porto Alegre abriu uma linha de crédito para os funcionários estatutários. 
# O valor máximo da prestação não poderá ultrapassar 30% do salário bruto. 
# Elabore um algoritmo que permita entrar com o salário bruto e o valor da prestação e 
# informar se o empréstimo pode ou não ser concedido.
salario = float(input())
valor_prestacao = float(input())
if valor_prestacao >(salario*0.3):
    print("Não concedido")
else:
    print("Concedido") 