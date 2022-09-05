
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
