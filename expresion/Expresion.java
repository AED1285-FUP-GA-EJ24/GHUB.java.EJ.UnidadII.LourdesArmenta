package expresion;
import java.util.Scanner;
public class Expresion{
    public  void calcularExpresion(){
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