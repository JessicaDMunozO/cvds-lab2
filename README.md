# Laboratorio 2 - PATTERNS
## CVDS 2023-1
#### Integrantes
+ Jessica Muñoz
+ Ricardo Pulido
## Desarrollo
### LA HERRAMIENTA MAVEN
+ ¿Cuál es su mayor utilidad?

  La mayor utilidad de Maven es que se ahorra el tiempo de configurar en implementar un entorno de desarrollo para poder trabajar directamente con la parte de 
  desarrollo de software y documentación del código.
    
+ Fases de Maven

  Las fases de Maven son: Validate que valida el proyecto, Compile que compila el proyecto, Test trabaja con los test unitarios,
  Package tranforma el código compilado en un ejecutable, Intergation Test trabaja los test de integración, Verify que verifica que el codigo cumpla con los criterios
  de calidad, Install prepara el código para poderlo usar en otros proyectos y Deploy despliega el código en un entorno.
   
+ Ciclo de vida de la contrucción

  El ciclo de vida de la construcción se divide en tres partes que son: default permite administrar el despliegue del proyecto, clean organiza el proyecto de forma 
  que quede limpio y site administra la documentación del proyecto.
    
+ ¿Para qué sirven los plugins?

  Los plugins permiten añadir funcionalidades extra sobre aplicaciones o códigos. Esto implica que no pueden funcionar por sí solos, se deben agregar sobre un
  programa que ya esté creado y que requiera de dicha funcionalidad específica.
    
+ ¿Qué es y para qué sirve el **repositorio central de Maven**?

  Es un repositorio que contiene todas las dependencias o librerías que se pueden usar en nuestros proyectos. Se dispone de diferentes versiones y se mantienen
  actualizadas. Sirve para que al momento de compilar y empaquetar nuestro proyecto en Maven añada las librerías colocadas en la parte de las dependencias
  del archivo `pom.xml` de forma automática para que el proyecto funcione.
    
### EJERCICIO DE LAS FIGURAS
Para crear un proyecto en Maven con ayuda de los arquetipos se usa el siguiente comando `mvn archetype:generate -Dfilter=maven-archetype-quickstart` y a medida que
se requiera se ingresan los parámetros indicados en el enunciado del laboratorio, los demás se dejan en la opción que viene por defecto.

Se accede al directorio *Patterns* que es el directorio del proyecto con el comando `cd Patterns`. Luego con el comando `tree` se ven los archivos y directorios
que fueron creados por maven.

![c16fc3e8-52fc-4a36-9ee1-c75bc4ef0a51](https://user-images.githubusercontent.com/123814482/219980341-c1ba9633-ab1b-47e7-b018-16e17fed639b.jpg)

### AJUSTAR ALGUNAS CONFIGURACIONES EN EL PROYECTO
Para esto se debe editar el archivo *pom.xml* con un comando que permita abrir algún editor, en este caso se uso `notepad`. Luego se debe cambiar la versión del
compilador de Java a la 8 en la sección de *properties*.

![cvds-lab2-i1](https://user-images.githubusercontent.com/123814482/219980537-ee2dc3f7-0d53-4d3f-95b3-4be1df757768.jpg)

### COMPILAR Y EJECUTAR
Se compiló con el comando `mvn package` y con el comando `mvn exec:java - Dexec.mainClass="edu.eci.cvds.patterns-App"` se ejecutó la clase *App.java* del paquete 
`edu.eci.cvds.patterns`.

Para crear un saludo personalizado se edita el archivo *App.java*

![cvds-lab2-i2](https://user-images.githubusercontent.com/123814482/219980860-4bf9a9e0-f331-482a-b5e5-7849605fb833.jpg)

De este modo, si no se envían parámetros imprime el Hello World y en caso contrario imprime el nombre contemplando la cantidad de parámetros ingresados.

Y para poder enviar los parámetros se ejecuta el comando `mvn exec:java - Dexec.mainClass="edu.eci.cvds.patterns-App" -Dexec.args="nombre apellido_opcional"`.

### HACER EL ESQUELETO DE LA APLICACIÓN
Se creó el directorio *shapes* y dentro de este se creó el directorio *concrete*. Ahora, en *shapes* se crea la interfaz *Shape.java* con el código
incluido en el enunciado del laboratorio.

![cvds-lab2-i3](https://user-images.githubusercontent.com/123814482/219981367-4629708b-ce7f-4d40-a078-907d3e3a7e75.jpg)

También se crea una enumeración llamada *RegularShapeType.java* en el directorio de *shapes*

![cvds-lab2-i4](https://user-images.githubusercontent.com/123814482/219981498-4b8a6a19-48cc-41d3-92d1-32771b06e1ca.jpg)

Ahora, dentro del directorio *concrete* se crean las clases para las 4 figuras que implimentan la interfaz de *Shape*.

![cvds-lab2-i5](https://user-images.githubusercontent.com/123814482/219981684-8d1ccc5f-6bf2-48b9-9ffa-bcafb173cf9a.jpg)
![cvds-lab2-i6](https://user-images.githubusercontent.com/123814482/219981685-fa0d5c90-28b1-4dde-938e-0add094d79a2.jpg)
![cvds-lab2-i7](https://user-images.githubusercontent.com/123814482/219981687-fa39f234-4991-4adf-bdb9-ab16a8e45ecf.jpg)
![cvds-lab2-i8](https://user-images.githubusercontent.com/123814482/219981682-a8955080-2605-4b97-84ad-e8abfc9848d7.jpg)

Nuevamente, en el directorio de *shapes* se crea el archivo *ShapeMain.java*

![cvds-lab2-i9](https://user-images.githubusercontent.com/123814482/219981778-4501cda0-50ec-432e-b67a-8d46456c18e3.jpg)

Siguiendo el *patrón creacional factory* se crea la clase *ShapeFactory.java* necesaria para el funcionamiento de la clase *ShapeMain* en el directorio de *shapes*.

![cvds-lab2-i10](https://user-images.githubusercontent.com/123814482/219981863-86ddb8e3-c9ea-4292-9627-1ad83f03228b.jpg)

Por último, se realizan las ejecuciones con los parámetros indicados.

![c52ba3c1-128a-4e98-9c79-b2227fa94ff8](https://user-images.githubusercontent.com/123814482/219982122-84751c19-c3d7-4c9f-8282-385f28a50a98.jpg)
![2331ce32-6b3c-4a53-a544-f461ba7f6293](https://user-images.githubusercontent.com/123814482/219982142-72c9d70f-b6de-4c1e-9ea3-f78ec0078e58.jpg)
![c0493e38-406e-406c-9595-b4b942d25fa1](https://user-images.githubusercontent.com/123814482/219982174-5fe3d58b-a3aa-4c81-9e44-2de3d68c53b0.jpg)
![3192fa50-718d-4f01-b115-4d34412eccd0](https://user-images.githubusercontent.com/123814482/219982221-faf783b9-cb09-4549-83a8-901bfbce4312.jpg)

Todas las instrucciones se ejecutan. Sin embargo, en los primero tres casos salta la excepción dado que está mal escrito o falta el parámetro. En el último caso,
al ser un parámetro válido porque es una de las clases de las figuras implementadas, muestra el valor correspondiente.

### gitignore
*gitignore* es un archivo de texto en el que se le indica a git qué archivos o directorios se deben ignorar de nuestro proyecto. Se puede manejar de forma local
en cada trabajo o se puede manejar de forma global para que se aplique sobre cada proyecto. Con el *#* se hacen comentario en el archivo, con el */* se pueden 
indicar rutas de los directorios a ignorar y con * se buscan todas las coincidencias respecto a una extensión dada.

![7511360c-5969-4a02-9b9e-5b81799c1e70](https://user-images.githubusercontent.com/123814482/219982808-d0e8c206-a6ac-4d23-b42c-86c31630db4d.jpg)

## Bibliografía
+ Gonzalez, A. (27 de febrero del 2014). *¿QUÉ ES MAVEN? ¿QUÉ VENTAJAS TIENE EN PROYECTOS JAVA?*. Recuperado de:
<http://www.t3cnologic.com/blog/2014/02/27/que-es-maven-que-ventajas-tiene-en-proyectos-java/>

+ Rubio Ballesteros, E. (24 de enero del 2023). *Fases de Maven explicadas en un gráfico*. Recuperado de:
<https://eusebiorubio.es/fases-de-maven-explicadas-en-un-grafico/>

+ El blog de rubensa. (10 de junio del 2016). *Maven Lifecycle*. Recuperado de:
<https://rubensa.wordpress.com/2016/06/10/maven-lifecycle/#:~:text=Existen%20tres%20ciclos%20de%20vida,de%20documentación%20de%20tu%20proyecto.>

+ IONOS. (9 de octubre del 2020). *¿Qué es un plugin y para qué se usa*. Recuperado de:
<https://www.ionos.es/digitalguide/servidores/know-how/que-es-un-plugin/>

+ Maven. (s.f). *Maven Central Repository*. Recuperado de:
<https://maven.apache.org/repository/index.html>

+ Hanoli, T. (23 de agosto del 2019). *3 pasos para crear un archetype Maven desde el CMD de Windows*. Recuperado de:
<https://hanolisite.wordpress.com/2019/08/23/3-pasos-para-crear-un-archetype-maven-desde-el-cmd-de-windows/>

+ MojoHaus. (19 de julio del 2022). *Exec Maven Plugin*. Recuperado de:
<https://www.mojohaus.org/exec-maven-plugin/usage.html>

+ freeCodeCamp. (21 de octubre del 2022) *Explicación de Gitignore: Qué es Gitignore y cómo añadirlo a tu repositorio*. Recuperado de:
<https://www.freecodecamp.org/espanol/news/gitignore-que-es-gitignore-y-como-anadirlo-a-tu-repositorio/#:~:text=gitignore%20es%20un%20archivo%20de,También%20puedes%20crear%20un%20archivo%20.>
