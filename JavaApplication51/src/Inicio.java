
import Entidades.Edificio;
import Entidades.Oficinas;
import Entidades.Polideportivo;
import java.util.ArrayList;


public class Inicio {

    
    public static void main(String[] args) {
        ArrayList<Edificio> edificios = new ArrayList<>();
        edificios.add(new Polideportivo( "Polideportivo 1", "Techado",30, 20, 40));
        edificios.add(new Polideportivo( "Polideportivo 2", "Abierto",25, 15, 35));
        edificios.add(new Oficinas(50, 40, 60, 10, 5, 4));
        edificios.add(new Oficinas(45, 35, 55, 8, 6, 5));

        for (Edificio edificio : edificios) {
            System.out.println("Superficie: " + edificio.calcularSuperficie());
            System.out.println("Volumen: " + edificio.calcularVolumen());

            if (edificio instanceof Polideportivo) {
                Polideportivo polideportivo = (Polideportivo) edificio;
                System.out.println("Tipo de instalación: " + polideportivo.getInstalacion());
            } else if (edificio instanceof Oficinas) {
                Oficinas oficinas = (Oficinas) edificio;
                System.out.println("Cantidad de personas en todo el edificio: " + oficinas.cantPersonas());
            }

            System.out.println();
        }
    }
    }
    

