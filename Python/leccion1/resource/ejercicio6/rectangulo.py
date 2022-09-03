def rectangulo():
    alto = int(input("Proporciona el alto del rectángulo: "))
    ancho = int(input("Proporciona el ancho del rectángulo: "))
    area = alto * ancho
    perimetro = (alto + ancho)*2
    print(f"El perimetro de el rectángulo es {perimetro} y el area es {area}")
