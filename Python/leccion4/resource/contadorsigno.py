def contadorsigno(lista):
    positivos = 0
    negativos = 0
    neutros = 0
    for i in lista:
        if i > 0:
            positivos += 1
        elif i < 0:
            negativos += 1
        else:
            neutros += 1
    ##return positivos, negativos, neutros
    print(f"Cantidad de numeros de Positivos: {positivos},Cantidad de Numeros de Negativo: {negativos},Cantidad de Numeros de Neutro: {neutros}")