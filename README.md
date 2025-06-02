# Otimização de Logística Portuária

Projeto desenvolvido para a disciplina de **Algoritmos e Estruturas de Dados**, com o objetivo de otimizar o descarregamento de containers de um navio, alocando-os em armazéns e, posteriormente, transportando-os via caminhões — tudo isso respeitando restrições de capacidade e minimizando o número de armazéns e veículos utilizados.

## 👨‍🏫 Disciplina

- **Estrutura de Dados e Análise de Algoritmos**
- **3º Semestre / 2025**
- **Professor:** Alexandre Montanha

## 👨‍💻 Integrantes

- Diego Vinicius – 12523158675  
- Jhonattan Mariano – 824120739  
- João Gobbi – 824145710  
- Matheus Yusuke – 825146805  
- Nicolas Trindade – 824135758  

## 🧠 Descrição do Problema

O sistema deve calcular:
- O número mínimo de **armazéns** necessários para armazenar os containers descarregados do navio.
- O número mínimo de **caminhões** necessários para transportar toda a carga armazenada.

### **Entradas:**
- Lista de volumes dos containers (ex: `[35, 20, 45, 60, 50, 10, 25, 55, 30, 40]`)
- Capacidade máxima por armazém: `100 m³`
- Capacidade máxima por caminhão: `120 m³`

### **Saídas esperadas:**
Distribuição dos volumes nos armazéns e posterior agrupamento para transporte por caminhões, buscando minimizar a quantidade de ambos.

---

## 🧮 Classificação do Problema

O problema foi classificado como **NP-Completo**, pois é equivalente ao **Bin Packing Problem**, que é amplamente conhecido na teoria da complexidade como um problema difícil de resolver exatamente, mas fácil de verificar uma solução.

---

## ⚙️ Estratégia de Resolução

Foi utilizado o algoritmo **First Fit Decreasing (FFD)**, uma heurística gulosa eficiente para problemas de empacotamento. O algoritmo é aplicado em duas etapas:

1. **Containers → Armazéns**
   - Ordenar os containers em ordem decrescente de volume.
   - Alocar no primeiro armazém onde ainda houver espaço disponível.

2. **Armazéns → Caminhões**
   - Calcular o volume total de cada armazém.
   - Ordenar os armazéns por volume.
   - Alocar no primeiro caminhão com capacidade disponível.

Essa abordagem apresenta **boa eficiência prática**, mesmo sem garantir a solução ótima.

---

## 💻 Implementação

A implementação foi feita em **Java**, utilizando uma arquitetura modular com os seguintes arquivos:

- `Main.java` – ponto de entrada da aplicação
- `Logistica.java` – lógica principal do algoritmo
- `Util.java` – funções auxiliares (ordenação, soma de volumes, etc.)

---

## 🧠 Complexidade do Algoritmo

### Containers → Armazéns:
- Ordenação: `O(n log n)`
- Alocação: `O(n²)`

### Armazéns → Caminhões:
- Ordenação: `O(m log m)`
- Alocação: `O(m²)`

**Complexidade total: `O(n²)`**

Essa complexidade é aceitável para volumes moderados de dados, proporcionando soluções próximas do ótimo de forma rápida.

---

## 🚀 Como Executar

1. Compile o projeto:

   ```bash
   javac Main.java
2. Execute o programa java:

    ```bash
    java Main
