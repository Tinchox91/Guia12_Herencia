
package EntidadesAlojamientos;


public abstract class Hotel_5 extends Hotel {
    
    /*
    Nombre del Restaurante, Capacidad del Restaurante, Cantidad Salones de
Conferencia, Cantidad de Suites, Cantidad de Limosinas, Precio de las Habitaciones.
    */
    private char gimnasio;
    private String nombreResto;
    private int capacidadResto;
    private int cantidadSalon;
    private int cantidadSuites;
    private int cantidadLimosinas;

    public Hotel_5() {
    }

    public Hotel_5(char gimnasio, String nombreResto, int capacidadResto, int cantidadSalon, int cantidadSuites, int cantidadLimosinas) {
        this.gimnasio = gimnasio;
        this.nombreResto = nombreResto;
        this.capacidadResto = capacidadResto;
        this.cantidadSalon = cantidadSalon;
        this.cantidadSuites = cantidadSuites;
        this.cantidadLimosinas = cantidadLimosinas;
    }

    public Hotel_5(char gimnasio, String nombreResto, int capacidadResto, int cantidadSalon, int cantidadSuites, int cantidadLimosinas, int habitaciones, int camas, int pisos, float precioHabitaciones) {
        super(habitaciones, camas, pisos, precioHabitaciones);
        this.gimnasio = gimnasio;
        this.nombreResto = nombreResto;
        this.capacidadResto = capacidadResto;
        this.cantidadSalon = cantidadSalon;
        this.cantidadSuites = cantidadSuites;
        this.cantidadLimosinas = cantidadLimosinas;
    }

    public Hotel_5(char gimnasio, String nombreResto, int capacidadResto, int cantidadSalon, int cantidadSuites, int cantidadLimosinas, int habitaciones, int camas, int pisos, float precioHabitaciones, String nombre, String direccion, String localidad, String encargado) {
        super(habitaciones, camas, pisos, precioHabitaciones, nombre, direccion, localidad, encargado);
        this.gimnasio = gimnasio;
        this.nombreResto = nombreResto;
        this.capacidadResto = capacidadResto;
        this.cantidadSalon = cantidadSalon;
        this.cantidadSuites = cantidadSuites;
        this.cantidadLimosinas = cantidadLimosinas;
    }

    public char getGimnasio() {
        return gimnasio;
    }

    public void setGimnasio(char gimnasio) {
        this.gimnasio = gimnasio;
    }

    public String getNombreResto() {
        return nombreResto;
    }

    public void setNombreResto(String nombreResto) {
        this.nombreResto = nombreResto;
    }

    public int getCapacidadResto() {
        return capacidadResto;
    }

    public void setCapacidadResto(int capacidadResto) {
        this.capacidadResto = capacidadResto;
    }

    public int getCantidadSalon() {
        return cantidadSalon;
    }

    public void setCantidadSalon(int cantidadSalon) {
        this.cantidadSalon = cantidadSalon;
    }

    public int getCantidadSuites() {
        return cantidadSuites;
    }

    public void setCantidadSuites(int cantidadSuites) {
        this.cantidadSuites = cantidadSuites;
    }

    public int getCantidadLimosinas() {
        return cantidadLimosinas;
    }

    public void setCantidadLimosinas(int cantidadLimosinas) {
        this.cantidadLimosinas = cantidadLimosinas;
    }

    @Override
    public float calcularValorAgregadoRestaurante() {
         if (capacidadResto < 30) {
            return 10;
        } else if (capacidadResto >= 30 && capacidadResto <= 50) {
            return 30;
        } else {
            return 50;
        }
    }

    @Override
    public float calcularValorAgregadoGimnasio() {
         if (gimnasio=='a') {
            return 50;
        } else {
            return 30;
        }
        
    }

    @Override
    public float calcularValorAgregadoLimosinas() {
       return 15 * cantidadLimosinas; 
      
    }
    
    
}
