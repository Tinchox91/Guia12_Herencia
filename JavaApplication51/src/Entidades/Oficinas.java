
package Entidades;


public class Oficinas extends Edificio {
    //con sus atributos número de oficinas, cantidad de personas
//por oficina y número de pisos. Esta clase implementará los dos métodos abstractos y
    private  int numero;
    private int personas;
    private int pisos;

    public Oficinas() {
    }

    public Oficinas(int numero, int personas, int pisos) {
        this.numero = numero;
        this.personas = personas;
        this.pisos = pisos;
    }

    public Oficinas(int numero, int personas, int pisos, float ancho, float alto, float largo) {
        super(ancho, alto, largo);
        this.numero = numero;
        this.personas = personas;
        this.pisos = pisos;
    }
    

    @Override
    public float calcularSuperficie() {
        return ancho * largo;
       
    }

    @Override
    public float calcularVolumen() {
        
        return ancho * largo * alto;
        
    }
     public int cantPersonas() {
        return numero * personas * pisos;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getPersonas() {
        return personas;
    }

    public void setPersonas(int personas) {
        this.personas = personas;
    }

    public int getPisos() {
        return pisos;
    }

    public void setPisos(int pisos) {
        this.pisos = pisos;
    }
    
}
