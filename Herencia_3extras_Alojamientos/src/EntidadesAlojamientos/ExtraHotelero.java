
package EntidadesAlojamientos;


public abstract class ExtraHotelero extends Alojamiento {

    protected boolean privado;
    protected float metrosCuadrados;

    public ExtraHotelero() {
    }

    public ExtraHotelero(boolean privado, float metrosCuadrados) {
        this.privado = privado;
        this.metrosCuadrados = metrosCuadrados;
    }

    public ExtraHotelero(boolean privado, float metrosCuadrados, String nombre, String direccion, String localidad, String encargado) {
        super(nombre, direccion, localidad, encargado);
        this.privado = privado;
        this.metrosCuadrados = metrosCuadrados;
    }

    
   

    public boolean isPrivado() {
        return privado;
    }

    public void setPrivado(boolean privado) {
        this.privado = privado;
    }

    public float getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(float metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }

   
    
    
}
