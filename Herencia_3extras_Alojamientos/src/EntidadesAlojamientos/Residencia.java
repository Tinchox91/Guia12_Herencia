
package EntidadesAlojamientos;

public abstract class Residencia extends ExtraHotelero {
    private int cantidadHabitaciones;
    private boolean descuento;
    private boolean campoDeportivo;

    public Residencia() {
    }

    public Residencia(int cantidadHabitaciones, boolean descuento, boolean campoDeportivo) {
        this.cantidadHabitaciones = cantidadHabitaciones;
        this.descuento = descuento;
        this.campoDeportivo = campoDeportivo;
    }

    public Residencia(int cantidadHabitaciones, boolean descuento, boolean campoDeportivo, boolean privado, float metrosCuadrados) {
        super(privado, metrosCuadrados);
        this.cantidadHabitaciones = cantidadHabitaciones;
        this.descuento = descuento;
        this.campoDeportivo = campoDeportivo;
    }

    public Residencia(int cantidadHabitaciones, boolean descuento, boolean campoDeportivo, boolean privado, float metrosCuadrados, String nombre, String direccion, String localidad, String encargado) {
        super(privado, metrosCuadrados, nombre, direccion, localidad, encargado);
        this.cantidadHabitaciones = cantidadHabitaciones;
        this.descuento = descuento;
        this.campoDeportivo = campoDeportivo;
    }

    public int getCantidadHabitaciones() {
        return cantidadHabitaciones;
    }

    public void setCantidadHabitaciones(int cantidadHabitaciones) {
        this.cantidadHabitaciones = cantidadHabitaciones;
    }

    public boolean isDescuento() {
        return descuento;
    }

    public void setDescuento(boolean descuento) {
        this.descuento = descuento;
    }

    public boolean isCampoDeportivo() {
        return campoDeportivo;
    }

    public void setCampoDeportivo(boolean campoDeportivo) {
        this.campoDeportivo = campoDeportivo;
    }

    @Override
    public float getPrecioHabitaciones() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
public boolean isDescuentoGremios(){
    return descuento;
}
 
}
