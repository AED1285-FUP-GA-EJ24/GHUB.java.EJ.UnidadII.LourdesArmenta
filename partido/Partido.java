package partido;
// Proposito: Programa que permita ingresar el número de partidos
// ganados, perdidos y empatados, por algun equipo de tornes
// se debe mostrar su puntaje total, teniedo en cuenta
// que cada partido ganado vale 3 puntos, perdido vale 0
// puntos y el empatado vale 1 punto.
// Autor: Lourdes Armenta
// Fecha: 16/feb/2024

import java.util.Scanner;

public class Partido {
    public void calcularPuntaje(){
        //definir objeto Scanner
        Scanner teclado = new Scanner(System.in);
        //definir variable de entrada
        short g,p,e;
        //definir variable de salida
        short puntos;

        System.out.print("Proporciona Partidos ganados:");
        g = teclado.nextShort();
        System.out.print("Proporciona Partidos empatados:");
        e = teclado.nextShort();
        System.out.print("Proporciona Partidos perdidos:");
        p = teclado.nextShort();

        //puntos = g*3 + e +p*0;

        /*
         * La constante literal 3 es de tipo int, por lo tanto
         * toda la expresion se convierte a int, por lo que no 
         * puede de manera IMPLICITA, asignarla a un valor short
         * en este caso, la variable puntos es short, entonces
         * hemos de hacer una conversión EXPLICITA, a través
         * de una operación de CAST
         */
        puntos = (short)(g*3 + e);

        System.out.println("Puntaje Obtenido:"+puntos);

        teclado.close();

    }
}

    

