# 1.2 - Genéricos - Nivel 1
## 📄 Descripción - Enunciado del ejercicio

Este proyecto consiste en crear una clase con un método genérico que acepte tres argumentos de tipo genérico y demuestre que se pueden pasar diferentes tipos de parámetros en cualquier orden.

El sistema permite:

Definir una clase Persona con los atributos: nombre, apellido y edad.

Crear una clase GenericMethods con un método genérico que imprima los tres argumentos recibidos.

Llamar a dicho método desde un main() pasando:

Un objeto de tipo Persona

Un String

Un tipo primitivo (como int o double)

Este ejercicio demuestra que el método genérico acepta cualquier tipo de parámetro, en cualquier orden.

## 💻 Tecnologías Utilizadas

Java 23

IntelliJ IDEA (opcional)

JDK estándar (no requiere bibliotecas externas)




## 📋 Requisitos

Tener instalado Java JDK 23 o superior.

Un IDE o editor compatible con Java (IntelliJ, Eclipse, VS Code, etc.).

🛠️ Instalación

Clona este repositorio (reemplaza con la URL real):
```
git clone https://github.com/jrffruit518-enrich/JavaSprint1_6.git
```
Accede al directorio del proyecto:
```
cd JavaSprint1_6
```

Abre el proyecto en IntelliJ IDEA o tu IDE favorito.

## ▶️ Ejecución

Compila los archivos Java desde la terminal (ajusta el path según la estructura):
```
javac sprint1Tasca_S106Nivell1_2/*.java
```

Ejecuta la clase principal:
```
java sprint1Tasca_S106Nivell1_2.GenericMethodsMain
```

Verás la salida en consola con el nombre de los tipos de los argumentos pasados, por ejemplo:

Arg1: Person
Arg2: String
Arg3: Double


Esto se repetirá con diferentes combinaciones de orden de parámetros.

## 🌐 Despliegue

Este proyecto es un ejercicio educativo y no requiere despliegue en producción.

Opcionalmente, puedes empaquetarlo como un .jar ejecutable:
```
jar cfe GenericMethods.jar sprint1Tasca_S106Nivell1_2.GenericMethodsMain -C out .
```
## 🤝 Contribuciones

¡Las contribuciones son bienvenidas! Sigue estos pasos:

Haz un fork del repositorio.

Crea una nueva rama:
```
git checkout -b feature/NuevaFuncion
```

Realiza tus cambios y haz commit:
```
git commit -m "Agrega nueva función genérica"
```

Sube los cambios:
```
git push origin feature/NuevaFuncion
```

Abre un Pull Request para revisión.