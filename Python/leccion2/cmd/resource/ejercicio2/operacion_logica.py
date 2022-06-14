def operacionLogica():
    a = int(input('Digite un valor entero: a = '))
    b = int(input('Digite un valor entero: b = '))
    resultado = (((3 + 5 * 8) < 3) and ((((-6 / 3) * 4) + 2) < 2)) or (a > b)
    print(f'El resultado de la operación es: {resultado}')
