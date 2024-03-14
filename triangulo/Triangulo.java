package triangulo;

import java.util.Scanner;

public class Triangulo {
    public void calcularPerimetroSupercie(){
        //declaro objeto tipo Scanner
        Scanner entrada = new Scanner(System.in);
        //definir variable de salida
        double per,sup;
        //definir variable de entrada
        double base,altura;
        //definir variable auxiliar
        double hip;

        System.out.print("Proporciona Base:");
        base = entrada.nextDouble();
        System.out.print("Proporciona Altura:");
        altura = entrada.nextDouble();

        sup = (base*altura)/2;

        hip = Math.sqrt(Math.pow(base, 2)+Math.pow(altura,2));

        per = base + altura +hip;

        System.out.println("Superficie = "+sup);
        System.out.println("Perimetro = "+per);

        entrada.close();


    }
    
    
}
