# Genéricos - Nivel 2 Ejercicio 1

## Descripción - Enunciado del ejercicio
Este ejercicio modifica el Nivel 1 - Ejercicio 2 para que uno de los tres argumentos del método genérico no sea genérico.
Se mantiene:

Clase Persona con atributos: nombre, apellido, edad.
Clase GenericMethods con un método que imprime los argumentos recibidos.

Cambio clave:

El tercer argumento es de tipo String fijo (no genérico).
Los dos primeros siguen siendo genéricos (<T, U>).

Demuestra:

Uso mixto de genéricos y tipos concretos.
Control de tipos en parámetros específicos.


## Tecnologías Utilizadas

Java 23
IntelliJ IDEA (opcional)
JDK estándar (no requiere bibliotecas externas)


## Requisitos

Tener instalado Java JDK 23 o superior.
Un IDE o editor compatible con Java (IntelliJ, Eclipse, VS Code, etc.).


Instalación
Clona este repositorio (reemplaza con la URL real):
```
git clone https://github.com/jrffruit518-enrich/JavaSprint1_6Genricos.git
```
Accede al directorio del proyecto:
```
cd JavaSprint1_6_Nivel2_Ej1
```
Abre el proyecto en IntelliJ IDEA o tu IDE favorito.

## Ejecución
Compila los archivos Java desde la terminal:
```
javac sprint1Tasca_S106Nivell2_1/*.java
```
Ejecuta la clase principal:
```
java sprint1Tasca_S106Nivell2_1.GenericMethodsMain1
```
Verás la salida en consola con el nombre de los tipos de los argumentos pasados, por ejemplo:
```
Arg1: Person
Arg2: Double
Arg3: String
```
## Despliegue
Este proyecto es un ejercicio educativo y no requiere despliegue en producción.
Opcionalmente, puedes empaquetarlo como un .jar ejecutable:

```
jar cfe GenericMethodsN2E1.jar sprint1Tasca_S106Nivell2_1.GenericMethodsMain1 sprint1Tasca_S106Nivell2_1/*.class
```
Ejecuta el .jar:
```
java -jar GenericMethodsN2E1.jar
```
## Contribuciones
¡Las contribuciones son bienvenidas! Sigue estos pasos:

Haz un fork del repositorio.
Crea una nueva rama:
```
git checkout -b feature/mejora-nivel2-ej1
```
Realiza tus cambios y haz commit:
```
git commit -m "Mejora en manejo de tipos no genéricos"
```
Sube los cambios:
```
git push origin feature/mejora-nivel2-ej1
```
Abre un Pull Request para revisión.