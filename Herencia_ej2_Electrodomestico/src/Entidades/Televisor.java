
package Entidades;

import java.util.Scanner;

public class Televisor extends Electrodomestico {
    protected boolean sintonizador;
    protected Integer resolucion;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Televisor() {
        
    }

    public Televisor(boolean sintonizador, Integer resolucion, double precio, String color, char consumo, float peso) {
        super(precio, color, consumo, peso);
        this.sintonizador = sintonizador;
        this.resolucion = resolucion;
    }

    public boolean isSintonizador() {
        return sintonizador;
    }

    public void setSintonizador(boolean sintonizador) {
        this.sintonizador = sintonizador;
    }

    public Integer getResolucion() {
        return resolucion;
    }

    public void setResolucion(Integer resolucion) {
        this.resolucion = resolucion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumo() {
        return consumo;
    }

    public void setConsumo(char consumo) {
        this.consumo = consumo;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    @Override
    public void precioFinal() {
        super.precioFinal();
        if (this.resolucion > 40) {
            this.setPrecio(this.getPrecio() * 1.3);
        }
        if (this.sintonizador) {
            this.setPrecio(this.getPrecio() + 500);
        }
    }
    

   public Televisor crearTele() {
    System.out.println("Crear Televisor");
    System.out.println("********************");
    super.crearElectrodomestico();
    System.out.println("Indica si tiene o no Sintonizador con 'S' o 'N':");
    char pa = leer.next().charAt(0);
    pa = Character.toLowerCase(pa);
    if (pa == 's') {
        this.sintonizador = true;
    } else {
        this.sintonizador = false;
    }
    System.out.println("Indica las pulgadas de la pantalla:");
    this.resolucion = leer.nextInt();
    precioFinal();
    return this;
}

    
    
    
    
}
