/*
Realiza un programa en donde una clase Persona tenga como atributo nombre, apellido y un
objeto de clase Dni. La clase Dni tendrá como atributos la serie (carácter) y número. Prueba
acceder luego a los atributos del dni de la persona creando objetos y jugando desde el main.
 */
package ej01guia8;

import entidades.Dni;
import entidades.Persona;
import java.util.ArrayList;
import java.util.Scanner;



public class Ej01Guia8 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        Dni dni = new Dni();
        dni.setSerie("f");
        dni.setNumero(32447252);
        
        Persona p = new Persona();
        p.setNombre("Maira");
        p.setApellido("Julian");
        p.setDni(dni);
        
//        System.out.print("Ingrese su nombre: ");
//        p.setNombre(leer.next());
//        System.out.print("Ingrese su apellido: ");
//        p.setApellido(leer.next());
//        System.out.print("Ingrese la serie de su DNI: ");
//        dni.setSerie(leer.next());
//        System.out.print("Ingrese su DNI: ");
//        dni.setNumero(leer.nextInt());
//        p.setDni(dni);
        
        System.out.println(p);
        
        
        
    }
    
}
