import java.util.Scanner;

class NumeroNegativoExcepcion extends Exception {
    
    public NumeroNegativoExcepcion() {
        super("Número negativo ingresado.");
    }

    public NumeroNegativoExcepcion(String mensaje) {
        super(mensaje);
    }
}

public class Main {
    public static void main(String[] args) {
        Main programa = new Main();
        System.out.print("Inserte un número: ");
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        programa.caracterEn(numero);
    }

    public void caracterEn(int entero) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Pon una cadena de texto: ");
            String cadena = scanner.nextLine();

            if (entero >= 0 && entero < cadena.length()) {
                char caracter = cadena.charAt(entero);
                System.out.println("El carácter en la posición " + entero + " es: " + caracter);
            } else {
                System.out.println("Índice fuera de rango.");
            }
        } catch (Exception e) {
            System.out.println("Has intentado recuperar una posición de la cadena de caracteres que no existe.");
        }
    }
}

class Mainb {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        
        int numero = scanner.nextInt();
        
        try {
            if (numero < 0) {
                throw new NumeroNegativoExcepcion("El número " + numero + " es negativo.");
            } else {
                double raizCuadrada = Math.sqrt(numero);
                System.out.println("La raíz cuadrada de " + numero + " es: " + raizCuadrada);
            }
        } catch (NumeroNegativoExcepcion e) {
            System.out.println("Excepción: " + e.getMessage());
        }
    }
}

