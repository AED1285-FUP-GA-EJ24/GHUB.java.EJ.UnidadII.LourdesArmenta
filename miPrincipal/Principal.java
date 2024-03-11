package miPrincipal;
//Comentario
import biblioteca.Libro; //importa únicamente la clase Libro
import biblioteca.*; //importa todas las clases del paquete libro

import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args) {
        calcularDistancia();
        
        calcularExpresion();  
    }
    public static void calcularDistancia()
    {
        /*Proposito: Calcular la distancia a partir
               de la velocidad y el tiempo
          Autor:Maria Lourdes Armenta Lindoro
          Fecha:8/mar/2024
        */
        //definir objeto Scanner
        Scanner teclado = new Scanner(System.in);

        //Definir variable de salida
        float d;
        //Definir variable de entrada
        float v,t;

        System.out.print("Proporciona velocidad mts/seg:");
        v = teclado.nextFloat();

        System.out.print("Proporciona el tiempo seg:");
        t = teclado.nextFloat();

        d = v*t;

        System.out.println("Distancia = "+d+" mts");

        //teclado.close();

    }
    public static void calcularExpresion(){
        /*Proposito:Dado los enteros a y b, calcula y escribe
            el resultado de la expresion (a+b)^2/3b
        Autor: Lourdes Armenta
        Fecha: 14/feb/2024
        */
        //definir objeto Scanner
        Scanner teclado = new Scanner(System.in);

        //Definir variable de salida
        float r;
        //Definir variable de entrada
        int a,b;
        System.out.print("Proporciona valor de a:");
        a = teclado.nextInt();
        System.out.print("Proporciona valor de b:");
        b = teclado.nextInt();
        //r = (a+b)*(a+b)/(3*b); 
        r = (float)Math.pow((a+b),2)/(3*b);
        System.out.println("Resultado = "+r);
        teclado.close();
    }
}