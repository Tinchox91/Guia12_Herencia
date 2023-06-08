
package Entidades;

import java.util.Scanner;


public class Electrodomestico {
    
   protected double precio;
   protected String color;
   protected char consumo;
   protected float peso;

    public Electrodomestico() {
    }

    public Electrodomestico(double precio, String color, char consumo, float peso) {
        this.precio = precio;
        this.color = color;
        
        this.consumo = consumo;
        comprobarConsumoEnergetico(consumo);
        comprobarColor( color);
        this.peso = peso;
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

    public void setComsumo(char consumo) {
        this.consumo = consumo;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
   public void comprobarConsumoEnergetico(char letra) {       
        if (letra >= 'A' && letra <= 'F') {
           this.consumo=letra;
        } else {
            this.consumo= 'f'; 
        }
    }
   
   public void comprobarColor(String color){
         String[] coloresDisponibles = {"blanco", "negro", "rojo", "azul", "gris"};
        boolean colorValido = false;
        for (String c : coloresDisponibles) {
            if (c.equalsIgnoreCase(color)) {
                colorValido = true;
                break;
            }
        }
        if (!colorValido) {
            this.color = "blanco";
        }
   
       
}
   public void crearElectrodomestico(){
      
       Scanner leer = new Scanner(System.in).useDelimiter("\n");
     
       System.out.println("Ingrese el color");
       this.color= leer.next();
       comprobarColor(this.color);
       System.out.println("Ingrese consumo (tiene que ser 'a' hasta 'f')");
       this.consumo = leer.next().charAt(0);
      comprobarConsumoEnergetico(this.consumo);
       System.out.println(" Ingrese el peso");
      this.peso = leer.nextFloat();
        
      
   }
   
 public void precioFinal() {
   
    switch (this.consumo) {
        case 'a':
            this.precio += 1000;
            break;
        case 'b':
            this.precio += 800;
            break;
        case 'c':
            this.precio += 600;
            break;
        case 'd':
            this.precio += 500;
            break;
        case 'e':
            this.precio += 300;
            break;
        case 'f':
            this.precio += 100;
            break;
       
    }
   
    if (this.peso >= 1 && this.peso <= 19) {
            this.precio += 100;
        } else if (this.peso >= 20 && this.peso <= 49) {
            this.precio += 500;
        } else if (this.peso >= 50 && this.peso <= 79) {
            this.precio += 800;
        } else if (this.peso >= 80) {
            this.precio += 1000;
        }
    }



   
}