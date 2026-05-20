# Trabalho de Avaliação — Estruturas de Dados
## Pilhas, Filas e Listas Ligadas

---

## 1. Identificação

**Aluno:** Miguel Mengue

**Curso:** Análise e Desenvolvimento de Sistemas

**Disciplina:** Estruturas de Dados

---

## 2. Introdução

A implementação manual de estruturas de dados é fundamental para o desenvolvimento da lógica de programação e compreensão do funcionamento interno da manipulação de memória. Ao construir estruturas como pilhas, filas e listas ligadas sem o uso de bibliotecas prontas, é possível compreender como os elementos são armazenados, conectados e percorridos por meio de referências entre nós.

Essas estruturas são amplamente utilizadas no desenvolvimento de sistemas, pois auxiliam no armazenamento, organização e gerenciamento eficiente de informações. A implementação manual também permite compreender conceitos importantes como ponteiros, encadeamento entre nós, atualização de referências e tratamento de casos especiais em inserções e remoções.

---

# Exercício 1 — Pilha e Fila com Lista Simplesmente Ligada

## Objetivo

Desenvolver um sistema de gerenciamento de pedidos para cafeteria utilizando:

- Fila para pedidos pendentes
- Pilha para pedidos cancelados

---

## Implementação

Foi criada uma estrutura de nó simples contendo:

- Objeto Pedido
- Referência para próximo nó

### Estrutura utilizada

A fila foi implementada seguindo o conceito FIFO (First In First Out), onde o primeiro pedido inserido é o primeiro a ser atendido.

A pilha foi implementada seguindo o conceito LIFO (Last In First Out), onde o último pedido cancelado é o primeiro a ser restaurado.

### Operações implementadas

- Adicionar pedido
- Atender pedido
- Cancelar pedido
- Restaurar pedido
- Listar fila
- Listar pilha

### Casos críticos tratados

- Inserção em lista vazia
- Remoção em lista vazia
- Atualização de início e fim da fila
- Atualização do topo da pilha

---

# Exercício 2 — Lista Duplamente Ligada para Playlist

## Objetivo

Desenvolver um sistema de gerenciamento de playlist simulando um player de músicas.

---

## Implementação

Foi criada uma lista duplamente ligada, onde cada nó possui:

- Música
- Referência anterior
- Referência próxima

### Estrutura do nó

Cada música contém:

- Título
- Artista
- Álbum
- Duração

### Operações implementadas

- Adicionar música no início
- Adicionar música no fim
- Adicionar em posição específica
- Remover música por título
- Avançar música
- Voltar música
- Tocar música atual
- Listar músicas
- Ordenar por título
- Ordenar por artista

### Casos críticos tratados

- Lista vazia
- Remoção do primeiro elemento
- Remoção do último elemento
- Remoção do único elemento
- Atualização do ponteiro atual

---

# Exercício 3 — Lista Circular Simplesmente Ligada

## Objetivo

Simular um painel digital de anúncios em execução contínua.

---

## Implementação

Foi utilizada uma lista circular simplesmente ligada, onde:

O último nó aponta para o primeiro nó, formando um ciclo contínuo.

### Estrutura do nó

Cada anúncio possui:

- ID
- Empresa
- Descrição
- Contador de exibições

### Operações implementadas

- Exibir e avançar
- Adicionar anúncio
- Remover anúncio
- Listar ciclo completo
- Exibição automática

### Casos críticos tratados

- Inserção do primeiro anúncio
- Remoção do único anúncio
- Remoção do anúncio atual
- Controle de ciclo
- Prevenção de loop infinito

---

# 3. Evidências de Execução

Adicionar capturas de tela do terminal demonstrando:

## Exercício 1

- Inserção de pedidos
- Atendimento
- Cancelamento
- Restauração
- Impressão das listas

https://prnt.sc/XMBaj5HUWfbk

## Exercício 2

- Inserção de músicas
- Navegação
- Reprodução
- Ordenação
- Remoção

https://prnt.sc/xa-_8r49I07m

## Exercício 3

- Inserção de anúncios
- Exibição sequencial
- Remoção
- Ciclo completo
- Exibição automática

https://prnt.sc/8fXr6Y0dMfWZ

---

# 4. Conclusão

Durante o desenvolvimento do trabalho, foi possível compreender de forma prática o funcionamento das estruturas de dados lineares e encadeadas.

A principal dificuldade encontrada esteve relacionada à atualização correta dos ponteiros durante operações de remoção, especialmente na lista duplamente ligada e na lista circular, pois exigem maior atenção para evitar perda de referência ou loops incorretos.

A implementação da lista circular também exigiu cuidados adicionais para controlar o percurso da estrutura sem gerar repetição infinita.

Com a realização das atividades, foi possível reforçar conhecimentos sobre:

- Estruturas dinâmicas
- Encadeamento de nós
- Gerenciamento de memória
- Operações de inserção e remoção
- Percurso de listas
- Manipulação de ponteiros
- Tratamento de casos especiais

O trabalho contribuiu significativamente para o entendimento prático da disciplina e da aplicação dessas estruturas em situações reais de desenvolvimento de software.

---