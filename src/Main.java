import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[20];

        // Leer 20 números enteros desde el teclado
        for (int i = 0; i < 20; i++) {
            System.out.print("Introduce un número entero: ");
            numeros[i] = scanner.nextInt();
        }

        // Mostrar cada número, su cuadrado y su cubo
        System.out.println("Número\tCuadrado\tCubo");
        for (int i = 0; i < 20; i++) {
            int numero = numeros[i];
            int cuadrado = numero * numero;
            int cubo = numero * numero * numero;
            System.out.println(numero + "\t" + cuadrado + "\t\t" + cubo);
        }

        // Cerrar el scanner
        scanner.close();
    }
}
