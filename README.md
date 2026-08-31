# Exercícios de Expressões Lambda em Java

Este projeto foi desenvolvido durante os estudos de **Java**, com foco em **expressões Lambda** e **interfaces funcionais**.

O objetivo dos exercícios foi praticar o uso de Lambda em diferentes situações, como operações matemáticas, validações, manipulação de Strings, listas e tratamento de exceções.

## 📚 Conteúdos praticados

- Expressões Lambda
- Interfaces funcionais
- Generics
- List e ArrayList
- replaceAll()
- sort()
- StringBuilder
- reverse()
- toUpperCase()
- ArithmeticException
- Tratamento de exceções com try/catch

---

# 🔧 Interfaces funcionais

Foram utilizadas duas interfaces funcionais genéricas.

## OperacoesDoistipos

Essa interface recebe **dois valores do mesmo tipo** e retorna um resultado do mesmo tipo.

```java
public interface OperacoesDoistipos<T> {

    T calcular(T a, T b);
}
```

O `<T>` representa um **tipo genérico**, permitindo que a interface seja utilizada com diferentes tipos de dados.

Por exemplo:

```java
OperacoesDoistipos<Integer> multiplicacao =
        (a, b) -> a * b;
```

Nesse caso, o `T` será substituído por `Integer`.

Podemos entender a interface como:

```java
Integer calcular(Integer a, Integer b);
```

A Lambda recebe dois números inteiros e retorna um número inteiro.

---

## OperacoesUmtipo

Essa interface recebe **um único valor** como parâmetro e retorna um resultado, que pode ser do mesmo tipo ou de um tipo diferente.

```java
public interface OperacoesUmtipo<T, R> {

    R calcular(T a);
}
```

Essa interface possui dois tipos genéricos:

- `T` → representa o tipo do valor recebido.
- `R` → representa o tipo do valor retornado.

Por exemplo:

```java
OperacoesUmtipo<String, String> convertString =
        nome -> nome.toUpperCase();
```

Nesse caso:

- `T` é `String`.
- `R` é `String`.

Podemos entender a interface como:

```java
String calcular(String a);
```

A Lambda recebe uma `String` e retorna uma `String`.

Outro exemplo utilizado no projeto:

```java
OperacoesUmtipo<Integer, Boolean> ehprimo =
        numero -> {
            if (numero <= 1) {
                return false;
            }

            for (int i = 2; i * i <= numero; i++) {
                if (numero % i == 0) {
                    return false;
                }
            }

            return true;
        };
```

Nesse caso:

- `T` é `Integer`.
- `R` é `Boolean`.

Podemos entender a interface como:

```java
Boolean calcular(Integer a);
```

A Lambda recebe um `Integer` e retorna um `Boolean`.

---

## 📌 Diferença entre as interfaces

| Interface | Entrada | Retorno |
|---|---|---|
| `OperacoesDoistipos<T>` | 2 valores do tipo `T` | `T` |
| `OperacoesUmtipo<T, R>` | 1 valor do tipo `T` | `R` |

### OperacoesDoistipos

```text
T + T → T
```

Exemplo:

```text
Integer + Integer → Integer
```

### OperacoesUmtipo

```text
T → R
```

Exemplos:

```text
Integer → Boolean
String → String
String → Boolean
List<Integer> → List<Integer>
```

