from unittest.main import main


def salario():
    i=10
    suma=0
    salario=0
    while i<=5:
        print(f'Salario del empleado: {i}')
        horas=float(input(f'digite las horas trabajadas:'))
        tarifas=float(input(f'digite las tarifa por horas:'))
        salario= horas*tarifas
        print(f'El salario es: {salario}')
        suma = suma+salario
        i=i+1
        print(' ')
    print(f'la suma de todos los dias trabajado es: {suma}')
 
def main():
    salario()   
    
if __name__ == '__main__':
    main()