class Vehiculo:
    '''
    Definir una clase padre llamada Vehiculo y dos clases hijas llamadas
    Auto y Bicicleta, las cuales heredan de la clase padre Vehiculo. La clase
    padre debe tener los siguientes atributos y métodos:

    Vehiculo (clase padre)
    -Atributos(color, ruedas)
    -Métodos(__init__(color, ruedas) y __str__())

    Auto(clase hija de Vehiculo)
    -Atributos(velocidad (km/hr))
    -Métodos(__init__(color, ruedas, velocidad) y __str__())

    Bicicleta(clase hija de Vehiculo)
    -Atributos(tipo(urbana/montaña/etc.)
    -Métodos(__init__(color, ruedas, tipo) y __str__()

    Crear un objeto de cada clase
    '''

    def __init__(self, color, ruedas):
        self.color = color
        self.ruedas = ruedas

    def __str__(self):
        return 'Color: ' + self.color + ', Ruedas: ' + str(self.ruedas)


class Auto(Vehiculo):
    def __init__(self, color, ruedas, velocidad):
        super().__init__(color, ruedas)
        self.velocidad = velocidad

    def __str__(self):
        return super().__str__() + ', Velocidad(km/hr): ' + str(self.velocidad)


class Bicicleta(Vehiculo):
    def __init__(self, color, ruedas, tipo):
        super().__init__(color, ruedas)
        self.tipo = tipo

    def __str__(self):
        return super().__str__() + ', Tipo: ' + self.tipo


# Primer dobjeto de la clase padre Vehiculo
vehiculo = Vehiculo('Rojo', 4)
print(vehiculo)

# Segundo objeto, pero ahora de la clase Auto
auto = Auto('Azul', 4, 100)
print(auto)

# Tercer objeto, el último de la clase Bicicleta
bicicleta = Bicicleta('Verde', 2, 'Sport')
print(bicicleta)
