import java.security.SecureRandom;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Instancias
        Scanner scanner = new Scanner(System.in);
        SecureRandom aleatorioSeguro = new SecureRandom();

        // Bucle principal para reiniciar el programa.
        while (true) {
            // Variables
            int resptCorrectas = 0;
            int totalPreguntas = 0;
            int nivelDificultad;
            int tipoProblema;

            // Punto 1: Mensaje de bienvenida e input del usuario
            System.out.println("*******************************************************************");
            System.out.println("***Bienvenido al programa de práctica de operaciones aritméticas***");
            System.out.println("*******************************************************************");
            System.out.println(" ");
            System.out.print("Por favor, elija el nivel de dificultad (1, 2, 3, ...): ");
            nivelDificultad = scanner.nextInt();


        }
    }
}

