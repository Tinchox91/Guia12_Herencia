
package Entidades;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class Barco {
    /*
    Un Barco se caracteriza por: su matrícula, su eslora en metros y año de fabricación.
    */
   private String matricula;
   private int escora;
   private Date anioFabricacion;

    public Barco() {
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getEscora() {
        return escora;
    }

    public void setEscora(int escora) {
        this.escora = escora;
    }

    public Date getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(Date anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public Barco(String matricula, int escora, Date anioFabricacion) {
        this.matricula = matricula;
        this.escora = escora;
        this.anioFabricacion = anioFabricacion;
    }
   
    public double calcularModulo(){
       return escora*10;
    }
    
    public void crearBarco() throws ParseException{
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese numero de matricula");
        matricula= leer.next();
        System.out.println("Ingrese tamanio de escora");
        escora= leer.nextInt();
         System.out.println("Ingrese fecha de fabricacion: (dd/mm/aaaa)");
        SimpleDateFormat dia1 = new SimpleDateFormat("dd/mm/yyyy");
        String fecha=leer.next();
     anioFabricacion= dia1.parse(fecha);
     
        
    
        
    }
            
    
    
            
    
}
