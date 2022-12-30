from Color import Color
from FiguraGeometrica import FiguraGeometrica

    """
    Crear una clase llamada Rectangulo, debe tenér 2 atributos: altura y base
    el nombre del método será calcular_area utilizando la formula:
    area = base * altura. Pero la base y la altura deben ser ingresadas por
    el usuario y los objetos deben ser tres.
    """

class Rectangulo(FiguraGeometrica, Color):
    def __init__(self, ancho, alto, color):
        FiguraGeometrica.__init__(self, ancho, alto)
        Color.__init__(self, color)

    def calcular_area(self):
        return self.alto * self.ancho

    def __str__(self):
        return f'{FiguraGeometrica.__str__(self)} {Color.__str__(self)}'