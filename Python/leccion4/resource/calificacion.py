def calificacionpromedioymasbaja(calificaciones):
    suma = 0
    masbaja=0
    for calificacion in calificaciones:
        suma += calificacion
        promedio = suma / len(calificaciones)
        masbaja = min(calificaciones)
    print(f" la suma promedio de calificaciones es: {promedio},Mientras que la nota mas baja es:{masbaja}")