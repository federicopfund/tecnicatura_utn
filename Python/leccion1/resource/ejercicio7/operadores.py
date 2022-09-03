def operadoresAsignacion():
    
# # Operadores de reasignación
#
    miVariable3 = 10
    print(miVariable3)
#
    miVariable3 = miVariable3 + 1
    print(miVariable3)
# suma una unidad
    miVariable3 += 1
    print(miVariable3)
#
    miVariable3 = miVariable3 -2
    miVariable3 -= 2
    print(miVariable3)
#
    miVariable3 = miVariable3 * 3
    miVariable3 *= 3
    print(miVariable3)
#
    miVariable3 = miVariable3 / 2
    miVariable3 /= 2
    print(miVariable3)
    
def operadoresComparacion():
    
    d = 4
    b = 2
    print(f'd = {d}  y  b = {b}')
# # ==  Son iguales?
    resultado = d == b
    print(f'd y b son iguales?:        {resultado}')
#
# # !=  Son distintos?
    resultado = d != b
    print(f'd y b son distintos?:      {resultado}')
#
# # >   Es mayor que?
    resultado = d > b
    print(f'd es mayor que b?:         {resultado}')
#
# # <   Es menor que?
    resultado = d < b
    print(f'd es menor que b?:         {resultado}')
#
# # >=  Es mayor o igual que?
    resultado = d >= b
    print(f'd es mayor o igual que b?: {resultado}')
#
# # <=  Es menor o igual que?
    resultado = d <= b
    print(f'd es menor o igual que b?: {resultado}')
#
# # Ejercicio1 par o impar
def impar():
    num = int(input("ingrese un numero: "))
    if (num % 2) == 0:
      print("el numero es par")
    else:
      print("el numero es impar")
#
    comprobador = (num % 2) == 0
#
    if comprobador:
       print("el numero es par")
    else:
       print("el numero es impar")

def Edad():
    
# # Ejercicio2: Determinar si es mayor de edad
    edadAdulto = 18
    edad = int(input("Introduzca la edad: "))
    if edad >= edadAdulto:
      print(f'Tu edad es {edad} años, sos mayor de edad')
    else:
       print(f'Tu edad es {edad} años, sos menor de edad')


def Operadores_lógicos():
#
    a = True
    b = True
# # operador and
    print("operador and")
    resultado = a and b
    print(resultado)  # en este caso será True
    print(" ")
# # operador or
    print("operador or ")
    a = False
    b = True
    resultado = a or b
    print(resultado)  # en este caso será True
    print(" ")
# # operador not
    print("operador not ")
    resultado = not a
    print(resultado)  # en este caso será True


# # Ejercicio: Valor dentro de un rango
def dentro_de_rango():
    num = int(input("Por favor ingrese un numero entero: "))
    if (num <= 5) and (num >= 0):
      print("El valor se encuentra dentro del rango (0,5)")
    else:
      print("El valor se encuentra fuera del rango (0,5)")
#
#
# # Ejercicio: operador or
def operadorOr():
    vacaciones = False
    diaDescanso = False
    if vacaciones or diaDescanso:
      print("El padre puede ir a ver a su hijo")
    else:
      print("El padre no puede ver a su hijo")
#
#
# # Ejercicio: Rango entre las edades 20 y 30 años

def rango20a30():
    
    edad = int(input("Por favor ingrese su edad"))
    veinte = (edad >= 20) and (edad < 30)
    print(veinte)
    treinta = (edad >= 30) and (edad < 40)
    print(treinta)
#
    if veinte:
       print("Estas dentro del rango de los 20 años")
    elif treinta:
      print("Estas dentro del rango de los 30 años")
    else:
      print("No estas dentro del rango de los 20 o de los 30 años")
# # Ejercicio: el mayor de dos números
def numeroMayor():
    
    num1 = int(input("Ingrese el primer número: "))
    num2 = int(input("Ingrese el segundo número: "))
    if num1 < num2:
      print("El segundo numero es mayor")
    elif num2 < num1:
      print("El primer número es mayor")
    else:
       print("Los números son iguales")


# Ejercicio: tienda de libros
def libros():
    print("Ingrese los siguientes datos de libro")
    nombreLibro = input("Digite el nombre del libro: ")
    idLibro = input("Digite el ID del libro: ")
    precioLibro = input("Digite el precio del libro: ")
    envioGratuito = bool(input("Indicar con True / False si tiene envio gratuito: "))
    print("Nombre:"+nombreLibro)
    print("ID:"+idLibro)
    print("Precio:"+precioLibro)
    if envioGratuito:
     print("El envio es gratuito")
    else:
     print("El envio no es gratuito")