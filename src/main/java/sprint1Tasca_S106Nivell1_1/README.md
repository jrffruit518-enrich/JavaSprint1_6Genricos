# 1.1-NoGenericMethods-Nivell1
## 📄 Descripción - Enunciado del ejercicio
Este proyecto consiste en el desarrollo de una clase en Java llamada NoGenericMethods que permite almacenar tres argumentos del mismo tipo (en este caso, String) junto con métodos para acceder a ellos y un constructor que inicializa los tres valores. El ejercicio requiere que los argumentos puedan ser pasados en cualquier orden en la llamada al constructor, aunque en este caso la implementación no permite dicha flexibilidad, ya que los parámetros están asignados a campos específicos (name, gender, hobby). Además, se incluye una clase de pruebas unitarias para verificar el comportamiento de la clase.
Funcionalidades principales:

Almacena tres argumentos de tipo String en los campos name, gender y hobby.
Proporciona métodos getter para acceder a los valores almacenados.
Incluye métodos equals, hashCode y toString para comparar objetos y representarlos como cadenas.
Verifica el comportamiento de la clase mediante pruebas unitarias con JUnit.

Nota: La implementación actual no cumple completamente con el requisito de permitir que los argumentos se pasen en cualquier orden, ya que los parámetros del constructor están asignados a campos específicos. Para cumplir este requisito, sería necesario modificar la clase para que los parámetros sean tratados de manera genérica o para proporcionar múltiples constructores que permitan diferentes combinaciones de argumentos.
## 💻 Tecnologías Utilizadas

Java 17

JUnit 5 (para pruebas unitarias)

IntelliJ IDEA (opcional, como entorno de desarrollo)

## 📋 Requisitos

Java JDK 17 o superior instalado.
Un IDE o editor de texto compatible con Java (IntelliJ IDEA, Eclipse, VS Code, etc.).
JUnit 5 configurado en el proyecto para ejecutar las pruebas unitarias.

## 🛠️ Instalación

Clona este repositorio:
```
git clone https://github.com/<tu-usuario>/javaSpring1_6.git
```
Accede al directorio del proyecto:
```
textcd 1.1-NoGenericMethods-Nivell1
```
Asegúrate de tener el JDK configurado correctamente y que las dependencias de JUnit 5 estén incluidas en el proyecto (por ejemplo, a través de Maven o Gradle, si se usa un sistema de construcción).

## ▶️ Ejecución

Compila los archivos Java:
```
textjavac spring1Tasca_S106Nivell1_1/*.java
```
Ejecuta las pruebas unitarias utilizando un IDE (como IntelliJ o Eclipse) o mediante la línea de comandos con un sistema de construcción como Maven:
```
mvn test
```
Si no usas Maven, puedes ejecutar la clase de prueba directamente (asegurándote de que JUnit esté en el classpath):
```
textjava -cp <ruta-a-junit> org.junit.platform.console.ConsoleLauncher --select-class spring1Tasca_S106Nivell1_1.NoGenericMethodsTest
```

Ejemplo de salida esperada:
```
Order 1: NoGenericMethods{name='José', gender='Male', hobby='Travel'}
Order 2: NoGenericMethods{name='Male', gender='José', hobby='Travel'}
Order 3: NoGenericMethods{name='Travel', gender='José', hobby='Male'}
```
Nota: La salida de las pruebas muestra que los valores se asignan a los campos según el orden en que se pasan al constructor, lo que indica que la implementación actual no cumple con el requisito de flexibilidad en el orden de los argumentos.
## 🌐 Desplegament
No aplica para este ejercicio, ya que es un programa local para consola con fines educativos. Opcionalmente, se puede empaquetar como un archivo .jar ejecutable para pruebas:
```
jar cfe NoGenericMethods.jar spring1Tasca_S106Nivell1_1.NoGenericMethodsTest -C out .
```
## 🤝 Contribucions
¡Las contribuciones son bienvenidas! Por favor, sigue los siguientes pasos para contribuir:

Haz un fork del repositorio.

Crea una nueva rama:
```
git checkout -b feature/NuevaFuncionalidad
```
Realiza tus cambios y haz commit:
```
git commit -m "Añade nueva funcionalidad"
```
Sube los cambios a tu rama:
```
git push origin feature/NuevaFuncionalidad
```
Abre un pull request para revisión.