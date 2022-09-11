
# Tuplas
""" 
Los elementos de las tuplas son inmutables, no se pueden modificar 
"""
# Definimos una tupla
veiculos = ('auto', 'camion', 'camioneta')
print(veiculos)
# Para ver el número de elementos de una tupla
print(len(veiculos))
# Acceder a un elemento, para esto utilizamos corchetes, no paréntesis
print(veiculos[0])
# mostrar de manera inversa
print(veiculos[-1])
# Acceder a un rango
print(veiculos[0:1])
# ejemplo

# Recorremos los elementos de la tupla
for veiculo in veiculos:
    print(veiculo, end=' ')  # Dejamos de ejecutar el salto de linea al final de utilizar print, para usar un espacio

# esto no es una buena practica
listaveiculos = list(veiculos)
listaveiculos[0] = 'mercedes'
cocina = tuple(listaveiculos)
print('\n', listaveiculos)
del listaveiculos
# print(cocina) # nos generará un error porque la tupla cocina no existe más
""" 
Dada la siguiente tupla 
reglas = (110, 255, 30, 87, 45, 129) # definir la tupla
Crear una lista que solo incluya los números menores a 5 e imprima por consola [1, 3, 2]
"""
reglas = (110, 255, 30, 87, 45, 129)  # definimos la tupla
lista = []
for regla in reglas:
    if regla < 255:
        lista.append(regla)
    else:
        print(f"No es una Regla computacional")
print(lista)
