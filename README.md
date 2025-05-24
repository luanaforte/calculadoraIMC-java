# Calculadora IMC

Programa em Java que calcula o Índice de Massa Corporal (IMC) a partir do peso e altura informados pelo usuário.

---

## O que é IMC?

IMC é uma medida usada para avaliar se o peso de uma pessoa está adequado em relação à sua altura. É calculado pela fórmula:


---

## Como o programa funciona?

1. Solicita que o usuário insira o peso (em kg).  
2. Solicita que o usuário insira a altura (em metros).  
3. Calcula o IMC usando a fórmula acima.  
4. Exibe o valor do IMC formatado com duas casas decimais.  
5. Classifica o resultado em:  
   - Abaixo do peso (IMC < 18.5)  
   - Peso normal (18.5 ≤ IMC ≤ 24.9)  
   - Sobrepeso (25 ≤ IMC ≤ 29.9)  
   - Obesidade (IMC ≥ 30)  

O programa utiliza `Scanner` com configuração para aceitar o ponto como separador decimal (`Locale.US`), garantindo que números decimais sejam interpretados corretamente.

---

## Como executar

Compile e execute:

```bash
javac CalculadoraIMC.java
java CalculadoraIMC
```
## Exemplo de uso  
Digite seu peso (kg): 70.5  
Digite a sua altura (m): 1.75  
Seu IMC é: 23.02  
Classificação: Peso normal.




