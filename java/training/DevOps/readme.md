Tipos de aplicaciones de Java

 se distinguirá entre los diferentes tipos de aplicaciones de Java del lado servidor para ayudarle a elegir una solución en la nube correspondiente.

### Aplicaciones monolíticas
Una aplicación monolítica es una solución todo en uno que se adapta a muchos proyectos. Una aplicación monolítica es un buen punto de partida para prototipos e inicios. Es fácil de desarrollar, depurar, probar e implementar.

Tradicionalmente, las aplicaciones monolíticas se ejecutan en servidores de aplicaciones y escalan toda la aplicación como un conjunto.

### Microservicios
Hoy en día, para que las empresas tengan éxito, se les pide que se adapten, que respondan rápidamente a los errores y que esperen lo inesperado. Para reducir el tiempo de comercialización, se contrata a más ingenieros. ¡Pero el resultado puede ser el contrario! El resultado es un mayor tiempo de comercialización, ya que es necesario dedicar más esfuerzos a la comunicación cuando hay más ingenieros colaborando. La solución en este caso es aplicar el dicho "divide y vencerás".

En un equipo multifuncional, puede ofrecer características de la manera más independiente posible. Cada equipo debe ser responsable de su propia parte dedicada del software.

### Trabajos por lotes
Algunas aplicaciones están diseñadas para ejecutarse brevemente. Ejecutan una carga de trabajo concreta y, a continuación, se cierran en lugar de esperar solicitudes o datos proporcionados por el usuario. Los trabajos por lotes son una solución para este caso de uso. Aunque algunos lotes pueden durar horas, en ocasiones los trabajos se deben ejecutar una vez o a intervalos regulares programados.

### Arquitecturas sin servidor
Las funciones solo se ejecutan en un evento. Una función se "desencadena" mediante un tipo específico de evento. Los desencadenadores admitidos incluyen la respuesta a cambios en los datos, a mensajes, la ejecución según una programación o la recepción de una solicitud HTTP.

### Tecnologías de Java

En esta unidad distinguiremos entre los distintos tipos de marcos, servidores y plataformas de Java.

## Spring Framework
Spring Framework es un marco de trabajo de la aplicación y un contenedor de inversión de control (IoC). Se ha usado históricamente para complementar el modelo Enterprise JavaBeans (EJB). Sus funcionalidades principales son:

 - Inserción de dependencias
    - Programación orientada a objetos
    - Abstracción empresarial
    - Spring Boot
    - Spring Boot
        * se ejecuta sobre Spring Framework y tiene una configuración automática bien fundamentada. Las aplicaciones de Spring Boot se ejecutan de forma independiente y son una opción perfecta para los microservicios.

    - Spring Data
        * Spring Data simplifica el acceso a los datos para bases de datos relacionales y no relacionales, marcos MapReduce y servicios de datos basados en la nube.

    - Seguridad de Spring
        + Spring Security es el estándar de facto para proteger las aplicaciones basadas en Spring. Ofrece un alto nivel de autenticación y control de acceso. Por ejemplo, Spring Security se integra bien con Active Directory.

    - Spring Cloud
        - Spring Cloud se usa para sistemas distribuidos. Spring Cloud incluye detección de servicios, administración de configuración, supervisión y una buena experiencia de desarrollador.

    - Spring Batch
        - Spring Batch es un marco ligero para aplicaciones de lote sólidas que son vitales para las operaciones diarias.

    - MicroProfile y Jakarta EE
        - MicroProfile y Jakarta Enterprise Edition (EE) se pueden considerar la continuación en código abierto de las especificaciones de Java EE.

    - MicroProfile
        - es un conjunto de especificaciones para las arquitecturas de microservicios. Se autodenomina un foro abierto para optimizar Enterprise Java para una arquitectura de microservicios. MicroProfile tiene como objetivo innovar en múltiples implementaciones y colaborar en áreas de interés comunes.

    - Jakarta EE
        - es un conjunto de especificaciones para la creación de aplicaciones empresariales. Su estructura modular permite a los desarrolladores crear soluciones de software eficaces. Las aplicaciones Jakarta EE pueden empaquetarse como archivos EAR o WAR.

    - WebProfile
        - es un subconjunto de Jakarta EE para servicios de back-end con un enfoque web. Pero no se preocupe, Puede agregarle API específicas de la plataforma empresarial.

    - Servidores de aplicaciones
        -Las aplicaciones de Java EE se deben implementar en servidores de aplicaciones compatibles con Java EE (WebLogic, WebSphere, WildFly, GlassFish, Payara y otros).

    - Apache Tomcat
        - es un servidor HTTP y un contenedor de Java Servlet. Implementa las especificaciones de Servlet, Java Server Pages (JSP), Java Expression Language y Java WebSocket.

    - Oracle WebLogic Server 
        - es una plataforma unificada y extensible para desarrollar, implementar y ejecutar aplicaciones empresariales. WebLogic Server ofrece una implementación sólida y madura de Java EE y Jakarta EE.

    - Red Hat JBoss Enterprise Application Platform
        - ofrece seguridad y rendimiento de nivel empresarial para implementaciones locales y virtuales, o bien en nubes privadas, públicas o híbridas.

    - WildFly
        - es el nivel ascendente de código abierto para JBoss EAP. Esta variedad impulsada por la comunidad es excelente para tareas de desarrollo y pruebas.

    - IBM WebSphere Application Server(WAS)
        - es un entorno de ejecución de servidor Java flexible y muy seguro para aplicaciones empresariales. Se centra en la alta confiabilidad. Admite microservicios y modelos de programación basados en estándares. Puede modernizar a su propio ritmo, obtener una mayor visibilidad en las cargas de trabajo, analizar aplicaciones empresariales y progresar en el viaje hasta Kubernetes.

    - Open Liberty
        - es la versión de código abierto impulsada por la comunidad de WAS.

    - Oracle GlassFish
        - es la implementación de referencia de numerosos estándares web de Java EE (incluidos Servlet y JSP).

Otros marcos para arquitecturas orientadas a microservicios
    - Netty es un marco de cliente/servidor de E/S que no es de bloqueo (NIO). Permite el desarrollo rápido y sencillo de aplicaciones de red, como servidores de protocolo y clientes. Simplifica y agiliza considerablemente la programación de redes, como los servidores de sockets TCP y UDP. Netty es un marco de trabajo de la aplicación de red asincrónico controlado por eventos para el desarrollo rápido de servidores y clientes de protocolo de alto rendimiento que se pueden mantener.

    - Quarkus es una pila de Java nativa de Kubernetes adaptada para OpenJDK HotSpot y GraalVM. Quarkus está ganando cada vez más impulso. Es por ello que hay marcos más centrados en el rendimiento como este, por ejemplo Vert.x, Helidon, Payara Micro y KumuluzEE.

    - Micronaut es un marco moderno de pila completa basado en JVM para compilar aplicaciones sin servidor y microservicios modulares y fáciles de probar. Micronaut incluye una inyección de dependencias y un entorno de ejecución de programación orientado a aspectos que no usa ninguna reflexión. Esto facilita la ejecución de aplicaciones de Micronaut en GraalVM.

[Oportunidades de implementación en Azure](https://docs.microsoft.com/es-es/learn/modules/intro-to-java-azure/5-deployment-opportunities)

>[Estructura](https://github.com/Azure/azure-quickstart-templates/tree/master/quickstarts/microsoft.appplatform/azure-spring-cloud)
![spring bot](../Java_tutoriales/img/implementacion%20en%20azure.png)