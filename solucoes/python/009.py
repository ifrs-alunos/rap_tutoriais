#9. Faça um programa que peça o salário de um 
# quanto foi o valor das suas vendas do mês, 
# e a porcentagem da sua comissão e imprima o salário com o bônus.
salario = float(input())
valor = float(input())
porcentagem = float(input())
salariocombonus = salario + (valor/porcentagem)
print(salariocombonus)
