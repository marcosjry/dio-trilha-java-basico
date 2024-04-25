## Desafio Controle de Fluxo

Com a finalidade de praticar o conteúdo apresentado no módulo sobre *Controle de Fluxo e criação de Exceções personalizadas*, foi proposto o seguinte desafio:

Desenvolver um código onde o usuário passe dois parâmetros inteiros pelo terminal, exemplo: 
```
 primeiroParametro = 12
 segundoParametro = 30 
```
Após isso o código deveria subtrair o segundo parâmetro do usuário pelo primeiro e em seguida através de um loop _for_ imprimir na tela o intervalo de 1 até o valor obtido pela subtração. No entanto, caso o segundo parâmetro seja menor que o primeiro o códgio deverá disparar uma **Exception** personalizada e informar o erro para o usuário.
Seguindo o exemplo:

```
int valor = segundoParametro - primeiroParametro;
for(int contador = 1; contador <= valor; contador++){
	System.out.println("Imprimindo o Número "+ contador);
}
```

#### A saída no terminal
```
Imprimindo o Número 1
Imprimindo o Número 2
Imprimindo o Número 3
Imprimindo o Número 4
...
Imprimindo o Número 18

```

**18 sendo a subtração de 30 - 12.**
## OBS:
Caso o usuário insira um segundo parâmetro menor que o primeiro, a Exception deverá informar: 
```
ParametrosInvalidosException: O segundo parâmetro deve ser maior que o primeiro.
```