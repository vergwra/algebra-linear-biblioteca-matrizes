# Classe Matrix
- Implementar uma classe nomeada Matrix que implemente os seguintes items:

## Construtor da classe Matrix que receba como parâmetros a quantidade de linhas, colunas e um array com os elementos da matriz. A assinatura do construtor deve seguir a seguinte estrutura:

```
    constructor(rows, cols, elements){}
    rows -> A quantidade deslinhas da matriz.
    cols -> A quantidade de colunas da matriz.
    elements -> Um array com os elementos da matriz.
```

## Um método chamado get que tem como função retornar o valor armazenado em uma determinada posição da matriz. O método recebe como parâmetros a linha e a coluna da posição do elemento da matriz e retorna o valor armazenado nesta posição. A assinatura da função get deve seguir a seguinte estrutura:

```
    get(i, j){}
    i -> O índice da linha da matriz.
    j -> O índice da coluna da matriz.
    Retorno -> O valor do elemento que está na linha i e coluna j da matriz.
```

## Um método chamado set que tem como função atribuir um valor em uma determinada posição da matriz. O método recebe como parâmetros a linha, a coluna e o valor a ser armazenado o elemento na matriz. A assinatura da função set deve seguir a seguinte estrutura:

```
    set(i, j, value){}
    i -> O índice da linha da matriz.
    j -> O índice da coluna da matriz.
    value -> O valor a ser armazenado na matriz.
    Retorno -> Nenhum.
```

# Classe Vector
- Implementar uma classe nomeada Vector que implemente os seguintes items:

## Construtor da classe Vector que receba como parâmetros a dimensão do vetor e um array com os elementos do vetor. A assinatura do construtor deve seguir a seguinte estrutura:

```
    constructor(dim, elements){}
    dim -> Um número que representa a dimensão do Vetor
    elements -> Um array que contém os elementos do vetor
```

## Um método chamado get que tem como função retornar o valor armazenado em uma determinada posição do vetor. O método recebe como parâmetros o índice do elemento do vetor e retorna o valor armazenado nesta posição. A assinatura da função get deve seguir a seguinte estrutura:

```
    get(i){}
    i -> O índice do elemento que deseja-se obter.
    Retorno -> O valor do elemento que está no índice i do vetor.
```

## Um método chamado set que tem como função atribuir um valor em uma determinada posição do vetor. O método recebe como parâmetros o índice do elemento do vetor e o valor a ser armazenado no vetor. A assinatura da função set deve seguir a seguinte estrutura:

```
    set(i, value){}
    i -> O índice do elemento que deseja-se obter.
    value -> O valor a ser armazenado no vetor.
    Retorno -> Nenhum.
```

# Classe LinearAlgebra
- Implementar uma classe nomeada LinearAlgebra que implemente os seguintes items:

## Um método chamado transpose que tem como função retornar uma matriz transposta ou um vetor transposto. O método deve receber como parâmetro um objeto da classe Matrix ou um objeto da classe Vector. A assinatura da função transpose deve seguir a seguinte estrutura:

```
    transpose(a){}
    a -> A matriz ou o vetor a ser transposto.
    Retorno -> Uma matriz ou o vetor transposto.
```

## Um método chamado sum que tem como função somar duas matrizes ou dois vetores. O método deve receber como parâmetro dois objetos da classe Matrix ou dois objetos da classe Vector. A assinatura da função sum deve seguir a seguinte estrutura:

```
    sum(a, b){}
    a, b -> A matriz ou o vetor a ser somado.
    Retorno -> Uma matriz ou vetor resultante da soma.
```

## Um método chamado times que tem como função multiplicar elemento a elemento duas matrizes ou dois vetores ou um escalar com uma Matrix. O método deve receber como parâmetro dois objetos da classe Matrix ou dois objetos da classe Vector. A assinatura da função times deve seguir a seguinte estrutura:

```
    times(a, b){}
    a -> Pode ser um escalar (número) ou um objeto do tipo Matrix
    ou um objeto do tipo Vector.
    b -> Um objeto do tipo Matrix ou um objeto do tipo Vector.
    Retorno -> Uma matriz ou vetor resultante da multiplicação
    elemento a elemento.
```

## Um método chamado dot que tem como função multiplicar duas matrizes. O método deve receber como parâmetro dois objetos da classe Matrix e retornar . A assinatura da função dot deve seguir a seguinte estrutura:

```
    dot(a, b){}
    a, b -> A matriz ou o Vetor a ser somado.
    Retorno -> Uma matriz resultante da operação de multiplicação
    de matrizes.
```

## Um método chamado gauss que tem como função realizar a eliminação gaussiana em uma Matriz. O método deve receber como parâmetro um objeto da classe Matrix e retornar a Matrix resultante da operação de eliminação gaussiana. A assinatura da função gauss deve seguir a seguinte estrutura:

```
    gauss(a){}
    a -> A matriz a qual deve-se realizar a eliminação gaussiana.
    Retorno -> Uma matriz com o resultado da eliminação gaussiana.
```

## Um método chamado solve que tem como função um sistema de equação linear. O método deve receber como parâmetro um objeto da classe Matrix (que representa uma matriz aumentada) e retornar a Matrix resultante da resolução do sistema linear. A assinatura da função solve deve seguir a seguinte estrutura:

```
    solve(a){}
    a -> A matriz aumentada a qual deve-se realizar a eliminação
    gaussiana.
    Retorno -> Uma matriz com o resultado do sistema de equações
    lineares.
```