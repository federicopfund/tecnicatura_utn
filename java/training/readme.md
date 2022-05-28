El lenguaje Java. El lenguaje Java se compone de tres estructuras básicas de código-- una clase, que codifica la unidad básica de su código y describe los datos y la lógica de su programa, un paquete, que es una agregación de código lógico intermedio-- eso es todo un bocado.

Un paquete es cero o más clases, típicamente un grupo de clases que están lógicamente relacionadas entre sí. Por ejemplo, si estuviera creando una aplicación para la entrada de pedidos, probablemente tendría un paquete de entrada de pedidos. Y tendría, como, una clase de pedidos, y tendría una clase de productos, y cosas por el estilo.

Con Java 9, presentamos el módulo. Esta es una agregación de código físico de alto nivel, y le permite anular la agregación de código de nivel inferior del paquete y elegir, explícitamente, qué partes de su código desea exponer para su reutilización y personas a las que acceder y qué partes no.

En la sintaxis de Java, el código Java se agrupa en clases. Aquí vemos una clase llamada employee. Tiene métodos, como, por ejemplo, establecer salario y obtener nombre, que en realidad llevan a cabo el código y hacer cosas, y variables que almacenan valores. Por ejemplo, tenemos una variable llamada name, que es una cadena, ya que almacenará sus nombres.

Y tenemos un método get name. Y cuando se invoca ese método, devuelve esta cadena, que es el nombre. También tenemos un salario fijo, que, cuando le pasamos un valor como flotador, lo usará para establecer el valor del salario.

Java incluye el manejo de excepciones, que le permite interrumpir el flujo normal de ejecución del programa cuando ocurre un problema. Aquí, por ejemplo, estamos tratando de leer líneas de un archivo. Y si no somos capaces de hacerlo- tal vez el archivo se ha ido o hay un problema con el sistema de archivos- una excepción sería lanzada.

Y en lugar de que el programa se caiga o tenga que escribir una lógica larga y complicada para lidiar con esto, es una forma mucho más limpia de simplemente cambiar el flujo de ejecución. Y hablaremos más de esto cuando hablemos del manejo de excepciones en el propio curso.


La mayoría de los lenguajes de programación modernos tienen alguna forma de manejo de excepciones. C++ hace. C# hace. PL/SQL hace. Todos estos tienen la misma idea básica de que, cuando se produce una excepción, se ramifica fuera de donde se produce la excepción y va a un controlador de excepción, donde luego continúa para tratar con la excepción. Hacer esto le permite decidir lo que su programa debe hacer en caso de un error.

El manejo de excepciones de Java le permite escribir código flexible que puede manejar diferentes tipos de circunstancias adversas. Cuando ocurre algo indeseable o un error en un programa en la ejecución de su programa, puede escribir código que pueda lidiar con ese problema.

La mentalidad de diseño de Java. Cuando trabajamos con Java y lenguajes de programación orientados a objetos, trabajamos con clases y objetos. Una clase representa un tipo de cosa o concepto que tiene atributos y comportamiento. Por ejemplo, aquí vemos un gato, o un perro, o una pelota, o un humano. Un objeto es una instancia -un ejemplo específico de una clase- que es creada en tiempo de ejecución por el equipo para ejecutar nuestro código.
[Obojetos y clases](./Java_tutoriales/img/object.png)
Así que aquí, vemos, por ejemplo, que en tiempo de ejecución, la computadora ha creado un nuevo perro cuyo nombre es Fido y otro nuevo perro cuyo nombre es Rex. Se trata de instancias de objeto creadas a partir de la clase de plantilla que se creó como parte del diseño.

Uno de los beneficios de trabajar con Java es la capacidad de reutilizar fácilmente el código. La herencia permite que clases de nivel superior más generales, como, por ejemplo, animales, que podrían tener atributos de nombre y peso y comportamientos de comer y respirar, se extiendan con clases de nivel inferior que tienen un comportamiento más específico dictado por las necesidades de la aplicación.

Por ejemplo, una forma más específica y de menor nivel de una clase de animales podría ser una clase de perros. Ahora, la clase de perros extendería la clase de animales y, por lo tanto, obtendría automáticamente el nombre y los atributos de peso y el comportamiento de comer y respirar de la clase de animales.

Si tuviéramos otra clase, como el pescado, sería lo mismo. La clase de peces podría extender la clase de animales. Y recibiría los atributos de nombre y peso, porque los peces pueden tener nombres y pesos, y también porque pueden comer y respirar. Ahora, los perros respiran de manera diferente a los peces, por lo que la implementación del comportamiento de respiración sería diferente en cada clase.

Y te preguntarás, bueno, ¿cómo se resuelve esto en tiempo de ejecución? Bueno, en tiempo de ejecución, Java detecta el tipo de objeto-perro o pez-que se está utilizando, y ejecuta el código apropiado para ese objeto. Así que si tuviéramos un objeto de perro y le pidiéramos que respirara, Java ejecutaría automáticamente el código de respiración para el perro.Si tuviéramos un objeto de pescado y le pidiéramos que respirara, Java ejecutaría automáticamente el código de respiración de un pez. Esta capacidad del sistema de tiempo de ejecución de Java para invocar el comportamiento correcto basado en el tipo de objeto se llama polimorfismo.

[polimorphismo](./Java_tutoriales/img/polimorphism.png)

También vale la pena mencionar que un perro puede tener otros comportamientos, como perseguir coches o enterrar huesos, que otros tipos de animales podrían no poseer. Así que podemos agregar atributos y comportamientos a nuestras clases de nivel inferior para extender y aumentar la funcionalidad heredada de las clases de nivel superior, creando así una aplicación flexible y extensible.

El gráfico aquí muestra la herencia trabajando en evolución. Muestra el árbol evolutivo desde una forma de vida unicelular hasta una forma de vida más compleja y específica, como un árbol o un perro.

Java tiene otras formas de lograr un diseño flexible, como interfaces que abstraen el comportamiento común entre clases, enumeraciones, llamadas enums, para crear constantes definidas por el usuario, y genéricos para pasar información de tipo específico al compilador, hacer programas más estables y menos propensos a errores.

Ahora, aquí, vemos, por ejemplo, un enum llamado alimento, que tendría dos constantes -una llamada comida para perros y otra llamada comida para peces- por lo que cuando vamos a alimentar a nuestras mascotas, podemos asegurarnos de que reciban el tipo correcto de alimento. También vemos que estamos creando una lista, o una colección, de objetos de mascotas, y hemos pasado información genérica a esa lista.

Ahora, esto asegurará que el compilador se asegure de que solo podamos agregar objetos a esta lista que implementen la interfaz de mascota. Así que el animal doméstico aquí hace referencia a la interfaz del animal doméstico aquí, y la interfaz del animal doméstico tendría ciertos comportamientos, como tal vez comer y respirar.

Ahora, si vamos a añadir un perro nuevo, podemos crear un nuevo objeto para perros y añadirlo a nuestra lista de mascotas. Podemos crear un nuevo objeto de pescado y añadirlo a nuestra lista de mascotas. Y funciona en ambos casos, porque el perro y los peces implementan la interfaz de mascota.
Pero digamos que tenemos un animal diferente. Digamos que tenemos una boa constructora que no implementa la interfaz de mascota. En ese caso, si intentamos agregar un nuevo objeto boa constructor -si creamos un nuevo objeto boa constructor y luego tratamos de agregarlo a la lista de mascotas- sería rechazado, y recibiríamos una advertencia.
[Flexibledesign](./Java_tutoriales/img/Flexibledesign.png)
Y por último, analizamos el análisis, el diseño y la arquitectura. Hacemos todo esto con Java y orientación a objetos. Y para hacerlo más fácil para nosotros, usamos algo llamado el Lenguaje de Modelado Unificado, UML. Esta es una notación de modelado que nos permite analizar nuestros requisitos de negocio, modelar nuestras estructuras de código y describir la implementación de aplicaciones. Y se hace con una serie de diagramas y meta información sobre la aplicación que estamos creando.
    
[uml](./Java_tutoriales/img/UML.png)

Normalmente comenzamos con un caso de uso que describe la interacción entre un usuario final y el sistema. Utilizamos diagramas de clases para representar las diferentes clases que vamos a necesitar, y también documentar sus comportamientos, atributos y relaciones entre sí.

Aquí, por ejemplo, vemos dos clases que están heredando de una superclase, o una clase de nivel superior. Tenemos diagramas de actividad para describir el flujo de control. Tenemos diagramas de secuencia para mostrar cómo un objeto puede invocar otro objeto, y el paso de datos de ida y vuelta. Y tenemos diagramas de transición de estado si necesitamos documentar que cierto objeto entra o sale de un cierto estado, por ejemplo, encender o apagar algo. Y luego tenemos diagramas de implementación que indican cómo se puede implementar la aplicación.

El uso de todos estos juntos nos permite analizar, diseñar nuestras aplicaciones.

