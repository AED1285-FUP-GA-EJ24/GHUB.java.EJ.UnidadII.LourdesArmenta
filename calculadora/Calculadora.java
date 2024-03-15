package calculadora;
// Proposito: generar una calculadora aritmetica
// Autor:Lourdes Armenta
// Fecha: 15/marzo/2024
import java.util.Scanner;

public class Calculadora {
    public void suma(){
        //declara objeto Scanner
        Scanner teclado = new Scanner(System.in);
        //variable de salida
        int r;
        //variable de entrada
        int op1,op2;

        System.out.println("*******************");
        System.out.println("***    SUMA     ***");
        System.out.println("*******************");
        System.out.print("\n");

        System.out.println("Proporciona valor 1:");
        op1 = teclado.nextInt();
        System.out.println("Proporciona valor 2:");
        op2 = teclado.nextInt();

        r = op1 + op2;

        System.out.println("Suma = "+r);
    }
    public void resta(){
        //declara objeto Scanner
        Scanner teclado = new Scanner(System.in);
        //variable de salida
        int r;
        //variable de entrada
        int op1,op2;

        System.out.println("********************");
        System.out.println("***    RESTA     ***");
        System.out.println("********************");
        System.out.print("\n");

        System.out.println("Proporciona valor 1:");
        op1 = teclado.nextInt();
        System.out.println("Proporciona valor 2:");
        op2 = teclado.nextInt();

        r = op1 - op2;
        System.out.println("Resta = "+r);
    }
    public void mult(){
        //declara objeto Scanner
        Scanner teclado = new Scanner(System.in);
        //variable de salida
        int r;
        //variable de entrada
        int op1,op2;

        System.out.println("**********************");
        System.out.println("*** MULTIPLICACION ***");
        System.out.println("**********************");
        System.out.print("\n");

        System.out.println("Proporciona valor 1:");
        op1 = teclado.nextInt();
        System.out.println("Proporciona valor 2:");
        op2 = teclado.nextInt();

        r = op1 * op2;

        System.out.println("Multiplicación = "+r);

    }
    public void div(){
        //declara objeto Scanner
        Scanner teclado = new Scanner(System.in);
        //variable de salida
        int r;
        //variable de entrada
        int op1,op2;

        System.out.println("*********************");
        System.out.println("***** DIVISION ******");
        System.out.println("*********************");
        System.out.print("\n");

        System.out.println("Proporciona valor 1:");
        op1 = teclado.nextInt();
        System.out.println("Proporciona valor 2:");
        op2 = teclado.nextInt();

        r = op1/op2;

        System.out.println("Cociente = "+r);
     
    }
    public void res(){
        //declara objeto Scanner
        Scanner teclado = new Scanner(System.in);
        //variable de salida
        int r;
        //variable de entrada
        int op1,op2;

        System.out.println("********************");
        System.out.println("****** RESIDUO *****");
        System.out.println("********************");
        System.out.print("\n");

        System.out.println("Proporciona valor 1:");
        op1 = teclado.nextInt();
        System.out.println("Proporciona valor 2:");
        op2 = teclado.nextInt();

        r = op1 % op2;

        System.out.println("Residuo = "+r);    

    }
    
}
