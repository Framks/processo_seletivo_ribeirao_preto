def numero_pertence_fibonacci(n):
    sequencia = ""
    if n < 0:
        return False 

    a, b = 0, 1
    while a <= n:
        sequencia += f" {a}"
        if a == n:
            print(sequencia)
            return True
        a, b = b, a + b

    print(sequencia)
    return False

entrada = input("Informe um número para verificar se pertence à sequência de Fibonacci: ")
numero = int(entrada)


if numero_pertence_fibonacci(numero):
    print(f"O número {numero} pertence à sequência de Fibonacci.")
else:
    print(f"O número {numero} não pertence à sequência de Fibonacci.")
