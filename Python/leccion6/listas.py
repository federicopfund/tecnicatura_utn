
nombres = ['laura', 'marcela', 'juliana', 'andrea','belen','naty']
print(nombres)

print(nombres[0:2])  # Rango de lista, el valor de cierre queda afuera
# ir del inicio de la lista al indice (sin incluirlo)
print(nombres[:3])
# Desde el indice indicado hasta el final
print(nombres[1:])
# Modificamos un valor
nombres[0] = 'Melany'
nombres[1] = 'flor'
print(nombres)
# Iterar nuestra lista
for nombre in nombres:  
    print(nombre)
else:
    print('Se acabaron los elementos de la lista')
# Preguntamos cuantos elementos tiene
print(len(nombres))  # le pasamos como parametro la lista
# Agregamos un elemento
nombres.append('inmaculada')
print(nombres)
# Insertar un elemento en un indice especifico
nombres.insert(2, 'july')
print(nombres)
nombres.insert(3, 'yamila')
print(nombres)
# Eliminamos un elemento
nombres.remove('yamila')
print(nombres)
# Eliminar el último elemento
nombres.pop()
print(nombres)
# Eliminar un indice especifico
del nombres[2]  # del significa delete (eliminar)
print(nombres)
# Eliminar, borrar o limpiar todos los elementos
nombres.clear()
print(nombres)
# Eliminar la lista
# del nombres
# print(nombres)  # generará un error porque no existe en la memoria la lista

""" Ejercicio 1:

    Iterar un rango de 0 a 10 e imprimir números divisibles entre 3
    ejemplo de ejecución: 0,3,6,9
"""
for i in range(0, 11):
    if i % 3 == 0:
        print(i)
""" 
Ejercicio 2:
  
    Crear un rango de números de 2 a 6 e imprimirlos
    Ejemplo de ejecucion: 2,3,4,5,6
"""
for i in range(2, 7):
    print(i)
""" 
Ejercicio 3:
  
    Crear un rango de 3 a 10 pero con un incremento de 2 en 2, en lugar de 1 en 1
    Ejemplo de ejecución: 3,5,7,9
"""
for i in range(3, 11, 2):
    print(i)

# Concatenar listas
lista1 = [13, 22, 53, 11]
lista2 = [14, 52, 6,4,41,2]

lista3 = lista1 + lista2
print(lista3)

# Agregar varios elementos a una lista
lista3.extend([7, 8, 9, 1])  # Función para agregar varios elementos a una lista
print(lista3)

# Averiguar el índice de un elemento de la lista
print(lista3.index(5))  # Función para ubicar en que indice está el valor ingresado

# print(lista3.index(0)) error por el elemento no ser parte de la lista
# Como saber cuantos valores repetidos hay dentro de una lista
print(lista3.count(1))  # Cuanta cuantos valores iguales hay dentro de la lista

# Para poner nustra lista al reves
lista3.reverse()
print(lista3)

# Para que una lista se multiplique repitiendo sus elementos
lista = [1, 2, 3] * 2
print(lista)
lista3 = lista3 * 2
print(lista3)
# Métodos de ordenamiento
lista3.sort()  # Ordena los elementos de forma ascendente
print(lista3)
lista3.sort(reverse=True)  # Ordena los elementos de forma descendente
print(lista3)
