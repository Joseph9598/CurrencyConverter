Conversor de Moedas

Este é um programa de conversão de moedas desenvolvido em Java que utiliza uma API para obter taxas de câmbio atualizadas. Ele permite ao usuário escolher entre várias conversões, como USD para EUR, USD para BRL, entre outras. A estrutura do programa é dividida em classes para facilitar a manutenção e a extensão de funcionalidades.

Estrutura do Projeto

O projeto consiste em quatro classes principais:

ConversorMoedas: Classe principal que exibe o menu, lê a opção do usuário, e chama os métodos para realizar a conversão.
MetodoConverter: Classe responsável por calcular o valor convertido com base nas taxas de câmbio obtidas.
MetodoObterTaxa: Classe que realiza a requisição à API para obter as taxas de câmbio entre as moedas.
Moedas: Classe que gerencia as opções de conversão e retorna as moedas selecionadas pelo usuário.
Requisitos
Java: versão 8 ou superior
Biblioteca Gson: para manipulação de JSON
Como Funciona
O programa faz uma requisição à API ExchangeRate-API para buscar as taxas de câmbio mais recentes, permitindo ao usuário escolher entre seis tipos de conversão:

USD para EUR
USD para GBP
USD para BRL
EUR para USD
GBP para USD
BRL para USD
Ao selecionar uma opção, o programa solicita o valor a ser convertido e exibe o valor equivalente na moeda de destino.

Estrutura das Classes

ConversorMoedas: Gerencia o menu e as interações com o usuário.
MetodoConverter: Recebe o valor, calcula a conversão e exibe o resultado.
MetodoObterTaxa: Faz a requisição para a API de câmbio e processa a resposta JSON para obter as taxas de conversão.
Moedas: Determina as moedas para conversão com base na opção do usuário.
Possíveis Melhorias

Adicionar suporte para mais pares de moedas.
Implementar conversão entre múltiplas moedas.
Implementar tratamento de erros aprimorado ao acessar a API.
