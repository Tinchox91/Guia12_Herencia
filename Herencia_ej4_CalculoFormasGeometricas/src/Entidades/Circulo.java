
package Entidades;

import Interfaces.calculosFormas;


public class Circulo implements calculosFormas {

    public Circulo() {
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        
        return PI * Math.pow(radio, 2) ;
        
    }

    @Override
    public double calcularPerimetro() {
        
        return PI * 2*radio ;
    }

   
       
    
}
