# 1.1-NoGenericMethods-Nivell1
## 📄 Descripción - Enunciado del ejercicio
Este proyecto consiste en el desarrollo de una clase en Java llamada NoGenericMethods que permite almacenar tres argumentos del mismo tipo (en este caso, String) junto con métodos para acceder y modificar estos valores, y un constructor que inicializa los tres valores. El ejercicio requiere que los argumentos puedan ser pasados en cualquier orden en la llamada al constructor. En esta implementación, los campos son genéricos (value1, value2, value3), lo que implica que el orden de los parámetros en el constructor no afecta la funcionalidad del objeto, ya que los campos no tienen una semántica específica. Además, se incluye una clase principal para demostrar el uso de la clase, y se espera que se implementen pruebas unitarias para verificar su comportamiento.
Funcionalidades principales:

Almacena tres argumentos de tipo String en los campos value1, value2 y value3.
Proporciona métodos getter y setter para acceder y modificar los valores almacenados.
Incluye un constructor para inicializar los tres campos.
Permite que los argumentos del constructor se pasen en cualquier orden, dado que los campos son genéricos y no están ligados a significados específicos.
Incluye métodos equals, hashCode y toString para comparar objetos y representarlos como cadenas.
Demostración básica en una clase principal; las pruebas unitarias están pendientes de implementación.

Nota: La implementación actual utiliza campos genéricos (value1, value2, value3), lo que satisface implícitamente el requisito de "cualquier orden", ya que el orden de los parámetros no afecta el comportamiento del objeto. Sin embargo, para verificar explícitamente este requisito, se recomienda agregar pruebas unitarias que demuestren la equivalencia funcional con diferentes órdenes de parámetros.
## 💻 Tecnologías Utilizadas

Java 17
JUnit 5 (para pruebas unitarias, pendiente de implementación)
IntelliJ IDEA (opcional, como entorno de desarrollo)

## 📋 Requisitos

Java JDK 17 o superior instalado.
Un IDE o editor de texto compatible con Java (IntelliJ IDEA, Eclipse, VS Code, etc.).
JUnit 5 configurado en el proyecto para ejecutar pruebas unitarias (si se implementan).

## 🛠️ Instalación

Clona este repositorio:
```
git clone https://github.com/<tu-usuario>/javaSpring1_6.git
```
Accede al directorio del proyecto:
```
cd 1.1-NoGenericMethods-Nivell1
```
Asegúrate de tener el JDK configurado correctamente. Si usas un sistema de construcción como Maven o Gradle, incluye las dependencias de JUnit 5 para pruebas unitarias.

## ▶️ Ejecución


Compila los archivos Java:
```
javac sprint1Tasca_S106Nivell1_1/*.java
```

Ejecuta la clase principal para ver una demostración:
```
java sprint1Tasca_S106Nivell1_1.NoGenericMethodsMain
```
Ejemplo de salida esperada:
```
NoGenericMethods{value1='hi', value2='hello', value3='good'}

NoGenericMethods{value1='nice', value2='great', value3='wonder'}
```

Pruebas unitarias: Actualmente no se han implementado pruebas unitarias. Para verificar el comportamiento, se recomienda crear una clase NoGenericMethodsTest con JUnit 5 para probar:

Inicialización con diferentes órdenes de parámetros.
Funcionamiento de los métodos getter y setter.
Comportamiento de equals y hashCode.

Ejemplo de ejecución de pruebas (una vez implementadas):
```
mvn test
```
O, sin Maven:
```
java -cp <ruta-a-junit> org.junit.platform.console.ConsoleLauncher --select-class sprint1Tasca_S106Nivell1_1.NoGenericMethodsTest
```

## 🌐 Desplegament
No aplica para este ejercicio, ya que es un programa local para consola con fines educativos. Opcionalmente, se puede empaquetar como un archivo .jar ejecutable:
```
jar cfe NoGenericMethods.jar sprint1Tasca_S106Nivell1_1.NoGenericMethodsMain -C out .
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