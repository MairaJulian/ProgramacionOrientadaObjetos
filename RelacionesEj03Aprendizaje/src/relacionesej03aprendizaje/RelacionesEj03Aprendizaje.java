
package relacionesej03aprendizaje;

import entidades.*;
import java.util.*;



public class RelacionesEj03Aprendizaje {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        
        Baraja b = new Baraja();
        b.crearBaraja();
        b.barajar();

        System.out.println("============================");
        System.out.println("============================");
        
        while (b.tieneSiguienteCarta()) {
            System.out.println("la siguiente carta es: ");
            b.siguienteCarta();
            System.out.println("desea mostrar otra carta");
            if(leer.next().equalsIgnoreCase("n")){
                break;
            }
        }
        
        b.cartasDisponibles();
        System.out.println("============================cartas disponibles");
        
        b.darCartas();
        System.out.println("============================dar cartas");
        
        b.mostrarBaraja();
        System.out.println("===========================mostrar baraja");
        
        b.cartasMonton();

    }
    
    
    
}
