
package Entidades;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;


public class Alquiler {
    /*
    Para cada Alquiler se guarda: el
nombre, documento del cliente, la fecha de alquiler, fecha de devolución, la posición del
amarre y el barco que lo ocupará.
    */
 private String nombre;
 private long documentoCliente;
    private Date fechaAlquiler;
    private Date fechaDevolucion;
    private int posicionAmarre;
    private String tipoBarco;

    public String getTipoBarco() {
        return tipoBarco;
    }

    public void setTipoBarco(String tipoBarco) {
        this.tipoBarco = tipoBarco;
    }
    private Barco barco;

    public Alquiler() {
    }

    public Alquiler(String nombre, long documentoCliente, Date fechaAlquiler, Date fechaDevolucion, int posicionAmarre, Barco barco) {
        this.nombre = nombre;
        this.documentoCliente = documentoCliente;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.posicionAmarre = posicionAmarre;
        this.barco = barco;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getDocumentoCliente() {
        return documentoCliente;
    }

    public void setDocumentoCliente(long documentoCliente) {
        this.documentoCliente = documentoCliente;
    }

    public Date getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(Date fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public int getPosicionAmarre() {
        return posicionAmarre;
    }

    public void setPosicionAmarre(int posicionAmarre) {
        this.posicionAmarre = posicionAmarre;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }
    public void crearAlquiler() throws ParseException{
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println(" Ingrese nombre:");
        nombre= leer.next();
        System.out.println("Ingrese documento");
       documentoCliente=leer.nextLong();
        System.out.println("Ingrese fecha de inicio de alquiler: (dd/mm/aaaa)");
        SimpleDateFormat dia1 = new SimpleDateFormat("dd/mm/yyyy");
        String fechainicio=leer.next();
        fechaAlquiler  = dia1.parse(fechainicio);
        System.out.println("Ingrese fecha de devolucion: (dd/mm/aaaa)");
        String devolucion= leer.next();
        fechaDevolucion= dia1.parse(devolucion);
        System.out.println("Ingrese posicion de amarre");
        posicionAmarre = leer.nextInt();
        elejirBarco();
       barco.crearBarco();
       
       
        
    }
    public void  elejirBarco(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("ingrese el barco que desea:");
        System.out.println("1.Velero");
        System.out.println("2.A motor");
        System.out.println("3.Yate de lujo");
        char bar= leer.next().charAt(0);
        bar=Character.toLowerCase(bar);
        switch (bar) {
            case '1': Velero velero = new Velero();
          this.barco= velero;
          this.tipoBarco ="Velero";
              break;
            case '2':
                 BarcoMotor motor = new BarcoMotor();
              this.barco= motor;
              this.tipoBarco ="Barco a Motor";
                break;
                case '3':
                 Yate yate = new Yate();
               this.barco=yate;
               this.tipoBarco ="Yate";
                break;
            default:
                throw new AssertionError();
        }
    
    }
    public void calcularPrecioAlquiler() {       
       
        long diferenciaMillis = fechaDevolucion.getTime() - fechaAlquiler.getTime();
    long diferenciaDias = TimeUnit.DAYS.convert(diferenciaMillis, TimeUnit.MILLISECONDS);
     int diasAlquiler = (int) diferenciaDias;
        double moduloBarco = barco.calcularModulo();
        double total= diasAlquiler * moduloBarco;
        System.out.println(" El precio de alquiler del "+ this.tipoBarco + " es $ "+total);
    }
    
}

