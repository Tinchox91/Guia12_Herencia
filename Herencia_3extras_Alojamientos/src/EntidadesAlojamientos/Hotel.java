
package EntidadesAlojamientos;


public abstract class Hotel  extends Alojamiento{
    protected int habitaciones;
    protected int camas;
    protected int pisos;
    protected float precioHabitaciones;

    public Hotel() {
    }

    public Hotel(int habitaciones, int camas, int pisos, float precioHabitaciones) {
        this.habitaciones = habitaciones;
        this.camas = camas;
        this.pisos = pisos;
        this.precioHabitaciones = precioHabitaciones;
    }

    public Hotel(int habitaciones, int camas, int pisos, float precioHabitaciones, String nombre, String direccion, String localidad, String encargado) {
        super(nombre, direccion, localidad, encargado);
        this.habitaciones = habitaciones;
        this.camas = camas;
        this.pisos = pisos;
        this.precioHabitaciones = precioHabitaciones;
    }

    public int getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(int habitaciones) {
        this.habitaciones = habitaciones;
    }

    public int getCamas() {
        return camas;
    }

    public void setCamas(int camas) {
        this.camas = camas;
    }

    public int getPisos() {
        return pisos;
    }

    public void setPisos(int pisos) {
        this.pisos = pisos;
    }
public abstract float calcularValorAgregadoRestaurante();

    public abstract float calcularValorAgregadoGimnasio();

    public abstract float calcularValorAgregadoLimosinas();

    @Override
    public float getPrecioHabitaciones() {
        float valorRestaurante = calcularValorAgregadoRestaurante();
        float valorGimnasio = calcularValorAgregadoGimnasio();
        float valorLimosinas = calcularValorAgregadoLimosinas();

        return 50 + (1 * habitaciones) + valorRestaurante + valorGimnasio + valorLimosinas;
    }

    
   
   
    
    
}
