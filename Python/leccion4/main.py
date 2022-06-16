


from resource.calificacion import calificacionpromedioymasbaja
from resource.contadorsigno import contadorsigno
from resource.sum import sumanumeros
from resource.añobisiesto import añobisiesto


def main():
    añobisiesto()
    try:
        N = int(input("ingrese la cantidad de numeros a sumar: "))
        sumanumeros(N)
    except ValueError:
        print("El valor introducido no es un número")
    except KeyboardInterrupt:
        print("Has interrumpido la ejecución")
    contadorsigno([-1,2,1,0,-4,3,0,0,0])
    print("calificacion")
    calificacionpromedioymasbaja((1,4,5,2,4,6,8,4))
main()
