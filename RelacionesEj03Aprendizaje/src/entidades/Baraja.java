

package entidades;

import java.util.*;

public class Baraja {
    Scanner leer = new Scanner(System.in);
    private ArrayList<Cartas> mazo;
    private int k=0;
    private ArrayList<Cartas> aux;

    public Baraja() {
        mazo=new ArrayList();
        aux=new ArrayList();
    }

    public Baraja(ArrayList<Cartas> mazo) {
        this.mazo = mazo;
    }

    public ArrayList<Cartas> getMazo() {
        return mazo;
    }

    public void setMazo(ArrayList<Cartas> mazo) {
        this.mazo = mazo;
    }

    public int getK() {
        return k;
    }

    public ArrayList<Cartas> getAux() {
        return aux;
    }

    public void setAux(ArrayList<Cartas> aux) {
        this.aux = aux;
    }
    
    @Override
    public String toString() {
        return "Baraja{" + "mazo=" + mazo + '}';
    }
    
    public void crearBaraja() {
        
        for (int i = 1; i < 13; i++) {
            
            if (i==8 || i==9) {
                continue;   
            }
            mazo.add(new Cartas(i,"oro"));    
            mazo.add(new Cartas(i,"copa"));    
            mazo.add(new Cartas(i,"basto"));    
            mazo.add(new Cartas(i,"espada"));    
        }
           
    }
    public void barajar() {
        
        Collections.shuffle(mazo);
        for (Cartas carta : mazo) {
            System.out.println(carta);    
        }
    }
    
    public void siguienteCarta() {
        System.out.println("========");
        System.out.println(mazo.get(k));
 
        aux.add(mazo.get(k));
        mazo.remove(mazo.get(k));
    }
    
    public void cartasDisponibles() {
        System.out.println("La cantidad de cartas disponibles son "+mazo.size());
    }
    
    public void darCartas() {
        
        System.out.println("Indique numero de cartas");
        int cant = leer.nextInt();
        if (cant < mazo.size()) {
            for (int i = 0; i < cant; i++) {
                siguienteCarta();
            }
        }else {
            System.out.println("No existe esa cantidad de cartas");
        }
        cartasDisponibles();
    }
    
    public void mostrarBaraja() {
        for (Cartas cartas : mazo) {
            System.out.println(cartas);
        }
    }
    
    public void cartasMonton() {
        for (Cartas cartas : aux) {
            System.out.println(cartas);
        }
    }
    
    public boolean tieneSiguienteCarta(){
        if(k<40){
            return true;
        }else{
            System.out.println("no hay mas cartas");
            return false;
        }  
    }
    
    
    

}
