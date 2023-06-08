
package Entidades;

import java.util.Scanner;


public class Lavadora extends Electrodomestico {
    
    protected Integer carga;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Lavadora() {
        super();
        this.carga = 0;
    }

    public Lavadora(double precio, String color, char consumo, float peso) {
        super(precio, color, consumo, peso);
        this.carga = carga;
    }

    

    public Integer getCarga() {
        return carga;
    }

    public void setCarga(Integer carga) {
        this.carga = carga;
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
        if (this.carga > 30) {
            this.setPrecio(this.getPrecio() + 500);
        }
    }

  
   
    
    public Lavadora crearLavadora() {
    System.out.println("Creando Lavadora");
    System.out.println("********************");
    super.crearElectrodomestico();
    System.out.println("Ingrese carga:");
    this.carga = leer.nextInt();
   precioFinal();
    return this;
}

    
}
