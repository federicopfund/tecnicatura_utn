def estacion_del_año():
    mes = int(input("Ingrese el numero del mes: "))
    estacion = None
    if 1 <= mes <= 3:
      estacion = "Verano"
    elif 4 <= mes <= 6:
        estacion = "Otoño"
    elif 7 <= mes <= 9:
        estacion = "Invierno"
    elif 10 <= mes <= 12:
        estacion = "Primavera"

    print(f'El mes {mes} se encuentra en la estación {estacion}')