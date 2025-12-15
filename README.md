# 🎮 Juego del Ahorcado en Java ⚽

Este proyecto es una implementación del **juego clásico del Ahorcado** desarrollado en **Java**, que se ejecuta directamente en la **consola**.
La palabra secreta se elige de forma **aleatoria** a partir de una lista de **jugadores históricos del fútbol**, haciendo el juego más divertido y temático.

---

## 📌 Características

* ✅ Juego del ahorcado totalmente funcional en consola
* ✅ Palabras aleatorias obtenidas desde una clase independiente
* ✅ Uso de **jugadores históricos del fútbol** como palabras secretas
* ✅ Control de letras repetidas
* ✅ Conversión automática a **mayúsculas**
* ✅ Número limitado de intentos
* ✅ Mensajes claros para el jugador

---

## 🧩 Estructura del proyecto

```text
📁 Proyecto
│── Main.java        // Lógica principal del juego
│── Palabras.java    // Lista de jugadores y selección aleatoria
│── README.md        // Documentación del proyecto
```

---

## ⚙️ Funcionamiento del juego

1. El programa selecciona **aleatoriamente** un nombre de jugador.
2. Se muestra la palabra oculta con guiones bajos (`_`).
3. El jugador introduce **una letra por turno**.
4. El programa comprueba:

   * Si la letra ya fue introducida.
   * Si la letra está en la palabra.
5. El jugador dispone de **6 intentos máximos**.
6. El juego termina cuando:

   * 🎉 Se adivina la palabra completa.
   * ❌ Se agotan los intentos.

---

## 🏆 Ejemplo de ejecución

```text
Palabra a adivinar: _ _ _ _ _ _
Introduce una letra: A
Incorrecto! Te quedan 5 intentos

Palabra a adivinar: _ A _ _ _ _
Introduce una letra: R

¡FELICIDADES, has adivinado la palabra secreta! MARADONA
```

---

## 🧠 Clases principales

### 🔹 Main.java

Contiene la **lógica principal del juego**:

* Control de intentos
* Entrada del usuario
* Comprobación de letras
* Detección de victoria o derrota

### 🔹 Palabras.java

* Almacena un **array de jugadores históricos**
* Devuelve una palabra aleatoria mediante `Random`

---

## ⚽ Ejemplos de jugadores incluidos

* PELE
* MARADONA
* MESSI
* CRISTIANO
* ZIDANE
* RONALDINHO
* CRUYFF
* BECKENBAUER
* MALDINI
* INIESTA

*(Todos los nombres están en mayúsculas y sin espacios)*

---

## 🚀 Cómo ejecutar el proyecto

1. Asegúrate de tener **Java JDK** instalado.
2. Compila los archivos:

```bash
javac Main.java Palabras.java
```

3. Ejecuta el programa:

```bash
java Main
```

---

## 🛠️ Posibles mejoras

* 🔹 Dibujar el ahorcado en ASCII
* 🔹 Dificultad variable
* 🔹 Guardar letras usadas
* 🔹 Modo multijugador
* 🔹 Temáticas adicionales

---

## 📚 Autor

Proyecto realizado como ejercicio práctico de **programación en Java**, enfocado en el uso de:

* Arrays
* Bucles
* Condicionales
* Métodos
* Entrada por consola

---

¡Disfruta del juego y que gane el mejor futbolero! ⚽🔥
