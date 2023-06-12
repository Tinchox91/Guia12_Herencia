
package Entidades;

public class Polideportivo extends Edificio {
    private String nombre;
    private String instalacion;

    public Polideportivo() {
    }

    public Polideportivo(String nombre, String instalacion) {
        this.nombre = nombre;
        this.instalacion = instalacion;
    }

    public Polideportivo(String nombre, String instalacion, float ancho, float alto, float largo) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.instalacion = instalacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getInstalacion() {
        return instalacion;
    }

    public void setInstalacion(String instalacion) {
        this.instalacion = instalacion;
    }
    

    @Override
    public float calcularSuperficie() {
         return 2 * (ancho * largo + ancho * alto + largo * alto);
        
    }

    @Override
    public float calcularVolumen() {
       return ancho * largo * alto;
       
    }
    
    
}
