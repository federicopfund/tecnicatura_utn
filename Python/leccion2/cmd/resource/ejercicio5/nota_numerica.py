def nota_numerico():
    nota = None
    nota_numerica = float(input("Ingrese la nota que desea convertir: "))

    if 9 <= nota_numerica <= 10:
        nota = "A"
    elif 8 <= nota_numerica < 9:
        nota = "B"
    elif 7 <= nota_numerica < 8:
        nota = "C"
    elif 6 <= nota_numerica < 7:
        nota = "D"
    elif 0 <= nota_numerica < 6:
        nota = "F"
    else:
        nota = "ERROR!: el valor ingresado es incorrecto"

    print(f'La nota numerica {nota_numerica} equivale la letra {nota}')