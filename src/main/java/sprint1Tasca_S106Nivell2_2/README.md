# Genéricos - Nivel 2 Ejercicio 2
Lista de argumentos de longitud variable (varargs)

## Descripción - Enunciado del ejercicio
Este ejercicio modifica el anterior (Nivel 2 - Ejercicio 1) para que el método genérico acepte una lista de argumentos de número indefinido usando varargs.
Se mantiene:

Clase Persona con atributos: nombre, apellido, edad.
Un parámetro fijo de tipo String.
Un parámetro inicial de tipo genérico.

Cambio clave:

El tercer grupo de parámetros es una lista variable (U... others) de tipo genérico.
Permite pasar 0, 1 o más argumentos del mismo tipo genérico.

Demuestra:

Uso de varargs con genéricos.
Flexibilidad en el número de parámetros.
Combinación de tipos fijos y variables.


## Tecnologías Utilizadas

Java 23
IntelliJ IDEA (opcional)
JDK estándar (no requiere bibliotecas externas)


## Requisitos

Tener instalado Java JDK 23 o superior.
Un IDE o editor compatible con Java (IntelliJ, Eclipse, VS Code, etc.).


## Instalación
Clona este repositorio (reemplaza con la URL real):
```
git clone https://github.com/jrffruit518-enrich/JavaSprint1_6Genricos.git
```
Accede al directorio del proyecto:
```
cd JavaSprint1_6_Nivel2_Ej2
```
Abre el proyecto en IntelliJ IDEA o tu IDE favorito.

## Ejecución
Compila los archivos Java desde la terminal:
```
javac sprint1Tasca_S106Nivell2_2/*.java
```
Ejecuta la clase principal:
```
java sprint1Tasca_S106Nivell2_2.GenericMethodsMain2
```
Verás la salida en consola con los tipos de los argumentos, por ejemplo:
```
Arg1: Person
Arg2: String
Arg3+ (others): Integer, Double, String

Arg1: String
Arg2: String
Arg3+ (others): []
```
## Despliegue
Este proyecto es un ejercicio educativo y no requiere despliegue en producción.
Opcionalmente, puedes empaquetarlo como un .jar ejecutable:
```
jar cfe GenericMethodsN2E2.jar sprint1Tasca_S106Nivell2_2.GenericMethodsMain2 sprint1Tasca_S106Nivell2_2/*.class
```
Ejecuta el .jar:
```
java -jar GenericMethodsN2E2.jar
```

Contribuciones
¡Las contribuciones son bienvenidas! Sigue estos pasos:

Haz un fork del repositorio.
Crea una nueva rama:
```
git checkout -b feature/varargs-mejora
```
Realiza tus cambios y haz commit:
```
git commit -m "Mejora en impresión de varargs genéricos"
```
Sube los cambios:
```
git push origin feature/varargs-mejora
```
Abre un Pull Request para revisión.