## calcular el factorial de un numero.
 

def factorial():
    i = 1
    factorial = 1      
    numero = int(input(f"ingresa un numero: "))
    try: 
        if numero >= 0:    
            while i<=numero:
                factorial = factorial * i
                i += 1
            print(f"El factorial de {numero} es: {factorial}")  
        else:
            print(f"Numero menor o igual a 0")    
    except ValueError or TypeError:
        print("Error, ingresa un numero") 
        factorial()
    


def factorial_normal(n):
    r = 1
    i = 2
    while i <= n:
        r *= i
        i += 1
    return r


def factorial_recursivo(n):
    if n == 1:
        return 1
    else:
        return n * factorial_recursivo(n-1)

def main():
    
    factorial()
    n=6
    print(f"El factorial de {n} es: { factorial_normal(n)}") 
    
    print(f"El factorial de {n} es: {  factorial_recursivo(n)}") 
    
    
if __name__ == '__main__':
    main()

