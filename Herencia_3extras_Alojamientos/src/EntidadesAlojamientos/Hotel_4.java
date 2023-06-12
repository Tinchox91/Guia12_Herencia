
package EntidadesAlojamientos;


public abstract class Hotel_4 extends Hotel {
    /*
    Gimnasio,
Nombre del Restaurante, Capacidad del Restaurante
    */
    private char gimnasio;
    private String nombreResto;
    private int cpacidadResto;

    public Hotel_4() {
    }

    public Hotel_4(char gimnasio, String nombreResto, int cpacidadResto) {
        this.gimnasio = gimnasio;
        this.nombreResto = nombreResto;
        this.cpacidadResto = cpacidadResto;
    }

    public Hotel_4(char gimnasio, String nombreResto, int cpacidadResto, int habitaciones, int camas, int pisos, float precioHabitaciones) {
        super(habitaciones, camas, pisos, precioHabitaciones);
        this.gimnasio = gimnasio;
        this.nombreResto = nombreResto;
        this.cpacidadResto = cpacidadResto;
    }

    public Hotel_4(char gimnasio, String nombreResto, int cpacidadResto, int habitaciones, int camas, int pisos, float precioHabitaciones, String nombre, String direccion, String localidad, String encargado) {
        super(habitaciones, camas, pisos, precioHabitaciones, nombre, direccion, localidad, encargado);
        this.gimnasio = gimnasio;
        this.nombreResto = nombreResto;
        this.cpacidadResto = cpacidadResto;
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

    public int getCpacidadResto() {
        return cpacidadResto;
    }

    public void setCpacidadResto(int cpacidadResto) {
        this.cpacidadResto = cpacidadResto;
    }

    @Override
    public float calcularValorAgregadoRestaurante() {
       if (cpacidadResto < 30) {
            return 10;
        } else if (cpacidadResto >= 30 && cpacidadResto <= 50) {
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
return 0;
        
    
}
}