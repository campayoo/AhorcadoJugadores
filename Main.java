import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);
        String palabraSecreta = Palabras.obtenerPalabra(); // creamos la variable string de palabra secreta obteniendo una palabra aleatoria en la clase de Palabras.

        int intentosMaximos = 6;
        int intento = 0;
        boolean estaAdivinada = false;

        char[] letrasAdivinadas = new char[palabraSecreta.length()];

        // Inicializamos el array con "_" para que se muestre la barra baja.
        Arrays.fill(letrasAdivinadas, '_');

        while (!estaAdivinada && intento < intentosMaximos) {

            System.out.println("Palabra a adivinar: " + String.valueOf(letrasAdivinadas));
            System.out.print("Introduce una letra: ");

            char letra = Character.toUpperCase(tec.next().charAt(0));

            boolean letraCorrecta = false;
            boolean letraRepetida = false;
            boolean acabar = true;

            // Comprobar si la letra ya fue usada
                for (char letrasAdivinada : letrasAdivinadas) {
                    if (letrasAdivinada == letra && acabar) {
                        letraRepetida = true;
                        acabar = false;
                    }
            }

            if (!letraRepetida) {
                // Revisar si la letra está en la palabra secreta, recorre la palabra entera comprobando.
                for (int i = 0; i < palabraSecreta.length(); i++) {
                    if (palabraSecreta.charAt(i) == letra) {
                        letrasAdivinadas[i] = letra;
                        letraCorrecta = true;
                    }
                }

                if (!letraCorrecta) {
                    intento++;
                    System.out.println("Incorrecto! Te quedan " + (intentosMaximos - intento) + " intentos");
                }
            } else {
                System.out.println("¡Ya has ingresado esa letra! Intenta con otra.");
            }

            // Verificar si se completó la palabra
            if (String.valueOf(letrasAdivinadas).equalsIgnoreCase(palabraSecreta)) {
                estaAdivinada = true;
                System.out.println("¡FELICIDADES, has adivinado la palabra secreta! " + palabraSecreta.toUpperCase());
            }
        }

        if (!estaAdivinada) {
            System.out.println("TE HAS QUEDADO SIN INTENTOS. La palabra era: " + palabraSecreta.toUpperCase());
        }
    }
}