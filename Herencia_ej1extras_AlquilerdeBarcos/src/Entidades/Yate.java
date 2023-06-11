
package Entidades;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;


public class Yate extends Barco {
    private int numeroCamarotes;

    public Yate() {
    }

    public Yate(int numeroCamarotes) {
        this.numeroCamarotes = numeroCamarotes;
    }

    public Yate(int numeroCamarotes, String matricula, int escora, Date anioFabricacion) {
        super(matricula, escora, anioFabricacion);
        this.numeroCamarotes = numeroCamarotes;
    }

    public int getNumeroCamarotes() {
        return numeroCamarotes;
    }

    public void setNumeroCamarotes(int numeroCamarotes) {
        this.numeroCamarotes = numeroCamarotes;
    }

    @Override
    public double calcularModulo() {
        return super.calcularModulo()+numeroCamarotes; 
    }

    @Override
    public void crearBarco() throws ParseException {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        super.crearBarco(); 
        System.out.println("Ingrese numero de camarotes");
        numeroCamarotes= leer.nextInt();
    }
    
    
}
