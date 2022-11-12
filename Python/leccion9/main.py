from Persona1 import Persona_decorada
from Persona import Persona

print('Creación de objetos'.center(50, '-'))
def main():
    persona1 = Persona('Ariel', 'Betancud', 32456987, 40)  # Necesitamos enviar argumentos
    # print(persona1.nombre) # Tarea: Hacer el print igual que con el objeto 2
    # print(persona1.apellido)
    # print(persona1.edad)
    print(f'El objeto1 de la clase persona: {persona1.nombre} {persona1.apellido} Su edad es: {persona1.edad}')
    persona2 = Persona('Osvaldo', 'Giordanini', 30321456, 45)
    print(f'El objeto2 de la clase persona: {persona2.nombre} {persona2.apellido} Su edad es: {persona2.edad}')

    persona1.nombre = 'Liliana'
    persona1.apellido = 'Buccella'
    persona1.edad = 40
    print(f'El objeto1 modificado de la clase persona: {persona1.nombre} {persona1.apellido} Su edad es: {persona1.edad}')

    # Los atributos son: caracteristicas
    # Los métodos son: el comportamiento que van a tener los objetos (acciones)
    persona1.mostrar_detalle() # La referencia en este caso se pasa de manera automatica
    persona2.mostrar_detalle()

    # Persona.mostrar_detalle(persona1) # Debemos pasarle una referencia para el self o dará error
    persona1.telefono = '44445555289'
    print(f'Este es el telefono de: {persona1.nombre} {persona1.telefono}') # Hemos creado un atributo de un objeto

    # print(persona2.telefono) el objeto persona2 no tiene este atributo, da error
    persona3 = Persona('Rogelio', 'Romero', 35789456, 22, 'Teléfono', '2614445557', 'Calle Lopez', 823, 'Manzana', 77, 'Casa', 18, Altura=1.83, Peso=105, CFavorito='Azul', Auto='Citroen', Modelo=2021)
    persona3.mostrar_detalle()
    # print(persona3._dni) # esto no se debe utilizar(esta encapsulado), esto dice que lo desconocemos python
    # persona3.__nombre # Esta totalmente encapsulado
    persona1 = Persona_decorada('miguel', 'martin', 41)
    print(persona1.nombre)  # Llamamos al método getter
    persona1.nombre = 'Juan Pedro'  # Llamamos el método setter
    print(persona1.nombre)  # Otra vez con el método getter
    print(persona1.mostrar_detalles())  # Llamamos el método mostrar_detalles
    # Atributo read-only (solo lectura) sería la edad porque no tiene el método set
    print(persona1.edad)

    # Tarea crear tres objetos más, utilizando los métodos getter and setter
    # para modificar, y mostrar los cambios con el método mostrar_detalles

    # Objeto número uno de la tarea
    persona2 = Persona_decorada('Flor', 'Romero', 23)
    print(persona2.nombre)
    print(persona2.apellido)
    print(persona2.edad)
    persona2.nombre = 'Florencia'
    persona2.apellido = 'Romery'
    persona2.edad = 22
    print(persona2.mostrar_detalles())

    # Objeto número dos de la tarea
    persona3 = Persona_decorada('Caro', 'Felisa', 21)
    print(persona3.nombre)
    print(persona3.apellido)
    print(persona3.edad)
    persona3.nombre = 'Carolina'
    persona3.apellido = 'Felix'
    persona3.edad = 31
    print(persona3.mostrar_detalles())

    # Objeto número tres de la tarea
    persona4 = Persona_decorada('Naty', 'Lucer', 35)
    print(persona4.nombre)
    print(persona4.apellido)
    print(persona4.edad)
    persona4.nombre = 'Natalia'
    persona4.apellido = 'Lucero'
    persona4.edad = 33
    print(persona4.mostrar_detalles())

 


    persona5 = Persona_decorada('Lionel', 'Messi', 35)
    persona5.mostrar_detalles()

    


    
     
if __name__ == '__main__':
    main()
    print('Eliminación de Objetos'.center(50, '-'))
