package distancia;
import java.util.Scanner;
public class Distancia {
    public void calcular(){
        int v,t,d;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Propociona velocidad:");
        v = teclado.nextInt();
        System.out.print("Proporciona tiempo:");
        t = teclado.nextInt();
        d = v * t;
        System.out.printf("distancia = %d mts\n",d);

    }

    
}