import json

with open('dados.json') as file:
    dados = json.load(file)

# Inicializa as variáveis para armazenar dados do faturamento
faturamentoValido = []
menorFaturamento = dados[0]['valor']
maiorFaturamento = dados[0]['valor']

# Processar cada dia do faturamento
for dia in dados:
    valor = dia['valor']

    if valor > 0:
        faturamentoValido.append(valor)
        if valor < menorFaturamento:
            menor_faturamento = valor
        if valor > maiorFaturamento:
            maiorFaturamento = valor

# Calcula a média mensal ignorando dias sem faturamento
mediaMensal = sum(faturamentoValido) / len(faturamentoValido)

# Conta o número de dias com faturamento acima da média
acimaDaMedia = len([valor for valor in faturamentoValido if valor > mediaMensal])

# Exibe os resultados
print(f"Menor valor de faturamento ocorrido em um dia do mês: {menorFaturamento}")
print(f"Maior valor de faturamento ocorrido em um dia do mês: {maiorFaturamento}")
print(f"Número de dias com faturamento acima da média mensal: {acimaDaMedia}")