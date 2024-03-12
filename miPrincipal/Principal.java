package miPrincipal;
//Comentario
import biblioteca.Libro; //importa únicamente la clase Libro
import distancia.Distancia;
import expresion.Expresion;
import biblioteca.*; //importa todas las clases del paquete libro

import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args) {
         Distancia objDistancia = new Distancia();
        objDistancia.calcularDistancia();
        Expresion objExpresion = new Expresion();
        objExpresion.calcularExpresion(); 
    }
    
}