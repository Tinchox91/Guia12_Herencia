
package Entidades;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class BarcoMotor extends Barco {
    private int potenciaCV;

    public BarcoMotor() {
    }

    public BarcoMotor(int potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

    public BarcoMotor(int potenciaCV, String matricula, int escora, Date anioFabricacion) {
        super(matricula, escora, anioFabricacion);
        this.potenciaCV = potenciaCV;
    }

    public int getPotenciaCV() {
        return potenciaCV;
    }

    public void setPotenciaCV(int potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

    @Override
    public double calcularModulo() {
        return super.calcularModulo()+potenciaCV; 
    }

    @Override
    public void crearBarco() throws ParseException {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        super.crearBarco(); 
        System.out.println("Ingrese potencia CV");
        potenciaCV = leer.nextInt();
    }
    
    
}
