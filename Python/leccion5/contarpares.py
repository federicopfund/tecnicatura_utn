
def conteopares():
    n_elementos = int(input('Digitela cantidad de numeros: '))
    suma_pares=0
    conteo_pares=0
    conteo_impares=0
    suma_impares=0
    i=0
    while i<=n_elementos:
        num=input('Digite un numero: ')
        if num % 2 ==0:
            suma_pares +=1
            conteo_pares+=1
        else:
            suma_impares +=1
            conteo_impares +=1 
        i+=1
        if conteo_pares==0:
            print('No se han digitado numeros')
        else:
            print('la suma de numeros pares es: ',suma_pares)
            print('El conteo de los numeros pares es: ',conteo_pares)
        if conteo_impares==0:
            print('No se han digitado numeros impares')
        else:
            promedio_impares= suma_impares/conteo_impares
            print('El promedio de los numeros impares es: ',promedio_impares)
            
def main():
    conteopares()

if __name__ == '__main__':
    main()