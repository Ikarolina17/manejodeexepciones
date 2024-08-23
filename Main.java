import java.util.Scanner;

public class Main{
    //Punto 1
    public static void main(String[] args) {
        Main programa = new Main();
        programa.caracterEn(7);       
    }

    public void caracterEn(int entero) {
        try {
            Scanner n = new Scanner(System.in);
            //int entero = 7;  // Índice deseado
           // String cadena = "Hola como estas";
           System.out.print("Pon una cadena de texto: ");
           String cadena = n.nextLine();
            if(entero >= 0 && entero < cadena.length()) {
                char caracter = cadena.charAt(entero);
                System.out.println("El carácter en la posición " + entero + " es: " + caracter);
            } else {
                System.out.println("Índice fuera de rango.");
            }

        } catch(Exception e) {
            System.out.println( "Has intentado recuperar una posición de la cadena de caracteres que no existe");
        }
    }

    public class NumeroNegativoExcepcion{
        
        public static void main(String[] args) {
            
            Scanner hola = new Scanner(System.in);
            int valornum = hola.nextInt();
            try{
            if (valornum>0){
                double valornumRaiz = Math.sqrt(valornum);
                System.out.println((int) valornumRaiz);
            }
        } catch(Exception e){
            System.out.println(e);
        }
            
        }
        
    }

}