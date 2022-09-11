
# Tipo set
letras = {'l', 'd', 's'}
print(letras)
print(len(letras))
# buscar un elemento existe dentro de set
print('M' in letras) 
# Agregar un elemento
letras.add('T') # add es una funcions de python
print(letras)

letras.add('T')  # Esto no tendrá ningún tipo de efecto, ya que le elemento
# 'T' ya se encuentra dentro del set
# Eliminar elemnetos, puede arrojar un error si el elemento no existe

letras.remove('l')
print(letras)

# en cambio con discard no se generara un error
letras.discard('l')
print(letras)
letras.discard('d')

# Limpiar nuestro tipo set
letras.clear()
print(letras)


# Repaso de set o conjunto
# para definir un conjunto

conjunto2 = set()
conjunto1 = {'9'}
conjunto2.add(5)
conjunto2.add('fender')
print(conjunto2)
conjunto1.add('fender')
print(conjunto1)
print(3 not in conjunto1)  # Preguntamos sie el número 3 NO está en el conjunto1

# igualdad de dos conjuntos
print(conjunto1 == conjunto2)

# operaciones en conjuntos
conjunto3 = conjunto1 | conjunto2  # Union de conjuntos
print(conjunto3)

conjunto3 = conjunto1 & conjunto2  # Que elemento tienen en común
print(conjunto3)

conjunto3 = conjunto1 - conjunto2  # Asigna el valor que esta en el conjunto1 y no en el conjunto2
print(conjunto3)
conjunto3 = conjunto2 - conjunto1  # Asigna el valor que esta en el conjunto2 y no en el conjunto1
print(conjunto3)

conjunto3 = conjunto1 ^ conjunto2  # Asigna los elementos que no comparten los conjuntos
print(conjunto3)

conjunto3 = conjunto1 | conjunto2
print(conjunto1.issubset(conjunto3))    # Comprobar si el conjunto1 es subconjunto de conjunto3
print(conjunto2.issubset(conjunto3))    # Comprobar si el conjunto2 es subconjunto de conjunto3
print(conjunto3.issubset(conjunto1))    # Comprobar si el conjunto3 es subconjunto de conjunto1
print(conjunto3.issubset(conjunto2))    # Comprobar si el conjunto1 es subconjunto de conjunto2

print(conjunto3.issuperset(conjunto1))  # Comprobar si el conjunto3 es superconjunto de conjunto1 
print(conjunto3.issuperset(conjunto2))  # Comprobar si el conjunto3 es superconjunto de conjunto2 
print(conjunto2.issuperset(conjunto3))  # Comprobar si el conjunto2 es superconjunto de conjunto3 