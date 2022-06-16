def añobisiesto():
    opcion = True

    while opcion:
        try:
            año = int(input("Introduce un año: "))
            if año % 4 == 0:
                if año % 100 == 0:
                    if año % 400 == 0:
                        print("El año {} es bisiesto".format(año))
                    else:
                        print("El año {} no es bisiesto".format(año))
                else:
                    print("El año {} es bisiesto".format(año))
            else:
                print("El año {} no es bisiesto".format(año))
        except ValueError:
            print("El valor introducido no es un número")
        except KeyboardInterrupt:
            print("Has interrumpido la ejecución")
        finally:
            opcion = input("¿Deseas continuar? (S/N): ")
            if opcion.lower() == "n":
                opcion = False