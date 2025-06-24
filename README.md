# Projeto Orientado a Objetos: Sistema de Controle de Estacionamento

## Objetivo

O objetivo deste projeto é aplicar os conceitos da Programação Orientada a Objetos (POO) por meio do desenvolvimento de um sistema de controle de estacionamento. Esse sistema contribui para a administração do fluxo de veículos no estacionamento, capaz de registrar veículos que passarão durante o dia, calculando o valor com base no tempo e fazendo levantamentos financeiros.

## Por que um controle de estacionamento?

A escolha de um sistema de controle de estacionamento se dá pela facilidade em aplicar os conceitos da Programação Orientada a Objetos (POO) de forma didática e estruturada. Nesse tipo de sistema, é possível representar claramente classes, objetos, herança, polimorfismo e encapsulamento, tornando o desenvolvimento mais compreensível e próximo de situações do cotidiano.

## Ferramenta e linguagem utilizada

- **Linguagem de Programação**: Java

- **Ambiente de Desenvolvimento**: Visual Studio Code

- **Paradigma principal**: Programação Orientada a Objetos

## Estrutura de classes

- **Veículo:** Placa, modelo, hora de entrada/saída.

- **Carro, moto, caminhão:** Especializações de veículo.

- **Vaga:** Número da vaga, status (livre/ocupada), tipo (carro, moto).

- **Ticket:** Código do ticket, hora de entrada, hora de saída, valor.

- **Estacionamento:** Lista de vagas, controle de entrada/saída, registro de veículos.

- **Funcionário:** Pode liberar vaga manualmente, fechar tickets, etc.


## Fluxo Geral do Sistema

1. O veículo chega ao estacionamento.

2. O sistema verifica a vaga disponível e o funcionário registra a entrada.

3. Gera um ticket com a hora de entrada.

4. Quando o veículo sai, o funcionário registra a hora de saída.

5. O sistema calcula o valor a pagar com base no tempo e tipo de veículo.

6. A vaga é liberada para outro uso.

