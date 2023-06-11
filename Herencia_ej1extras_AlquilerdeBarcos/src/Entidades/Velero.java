
package Entidades;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;


public class Velero extends Barco {
    private int numeroMastiles;

    public Velero(int numeroMastiles) {
        this.numeroMastiles = numeroMastiles;
    }

    public Velero(int numeroMastiles, String matricula, int escora, Date anioFabricacion) {
        super(matricula, escora, anioFabricacion);
        this.numeroMastiles = numeroMastiles;
    }

    public int getNumeroMastiles() {
        return numeroMastiles;
    }

    public void setNumeroMastiles(int numeroMastiles) {
        this.numeroMastiles = numeroMastiles;
    }

    public Velero() {
    }

    @Override
    public double calcularModulo() {
        return super.calcularModulo()+numeroMastiles; 
    }

    @Override
    public void crearBarco() throws ParseException {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        super.crearBarco();
        System.out.println(" Ingrese numero de mastiles");
        numeroMastiles= leer.nextInt();
        
    }
    
}
