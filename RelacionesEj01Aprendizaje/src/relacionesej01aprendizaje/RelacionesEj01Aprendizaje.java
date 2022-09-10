
package relacionesej01aprendizaje;

import utilidades.Perro;
import utilidades.Personaa;

public class RelacionesEj01Aprendizaje {

    public static void main(String[] args) {
        
        Perro p1 = new Perro();
        Perro p2 = new Perro();
        
        p1.setNombre("Renato");
        p1.setRaza("Caniche");
        p1.setEdad(5);
        p1.setTamaño("Pequeño");
        
        p2.setNombre("Pongo");
        p2.setRaza("Collie");
        p2.setEdad(4);
        p2.setTamaño("Grande");
        
        Personaa per1 = new Personaa();
        Personaa per2 = new Personaa();
        
        per1.setNombre("Maira");
        per1.setApellido("Julian");
        per1.setEdad(35);
        per1.setDni(32447252);
        per1.setPerro(p1);
        
        per2.setNombre("Romina");
        per2.setApellido("Julian");
        per2.setEdad(30);
        per2.setDni(36029254);
        per2.setPerro(p2);
        
        
        System.out.println(per1);
        System.out.println(per2);
    }
    
}
