package miPrincipal;
//Comentario
import biblioteca.Libro; //importa únicamente la clase Libro
import biblioteca.*; //importa todas las clases del paquete libro

public class Principal {
    
    public static void main(String[] args) {
        System.out.println("Hola Mundo, soy Lourdes"); //Esto es un comentario
        //Demostración de tipo de variable
        /*
         * Los tipos de datos float y double tienes 3 valores especiale:
         * infinito positivo
         * infinito negativo
         * NaN (Not a Number)
         */
        System.out.println(Math.sqrt(8)); //retorna un punto flotante
        System.out.println(Math.sqrt(-1)); //es un NaN
        System.out.println(1.1e5 * 1.1e2);
        System.out.println(1.10000 * 1.10);
        System.out.println(1.1e200 * 1.1e200); // esto retorna un Infinito positivo
        System.out.println(-1.1e200 * 1.1e200); // esto retorna un Infinito negativo
     
    }
}