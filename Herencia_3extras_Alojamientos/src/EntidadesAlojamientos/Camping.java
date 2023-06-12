
package EntidadesAlojamientos;


public abstract  class Camping extends ExtraHotelero {
   private int capacidadCarpas;
   private int bañosDisponibles;
   private boolean restaurante;

    public Camping() {
    }

    public Camping(int capacidadCarpas, int bañosDisponibles, boolean restaurante) {
        this.capacidadCarpas = capacidadCarpas;
        this.bañosDisponibles = bañosDisponibles;
        this.restaurante = restaurante;
    }

    public Camping(int capacidadCarpas, int bañosDisponibles, boolean restaurante, boolean privado, float metrosCuadrados) {
        super(privado, metrosCuadrados);
        this.capacidadCarpas = capacidadCarpas;
        this.bañosDisponibles = bañosDisponibles;
        this.restaurante = restaurante;
    }

    public Camping(int capacidadCarpas, int bañosDisponibles, boolean restaurante, boolean privado, float metrosCuadrados, String nombre, String direccion, String localidad, String encargado) {
        super(privado, metrosCuadrados, nombre, direccion, localidad, encargado);
        this.capacidadCarpas = capacidadCarpas;
        this.bañosDisponibles = bañosDisponibles;
        this.restaurante = restaurante;
    }

    public int getCapacidadCarpas() {
        return capacidadCarpas;
    }

    public void setCapacidadCarpas(int capacidadCarpas) {
        this.capacidadCarpas = capacidadCarpas;
    }

    public int getBañosDisponibles() {
        return bañosDisponibles;
    }

    public void setBañosDisponibles(int bañosDisponibles) {
        this.bañosDisponibles = bañosDisponibles;
    }

    public boolean isRestaurante() {
        return restaurante;
    }

    public void setRestaurante(boolean restaurante) {
        this.restaurante = restaurante;
    }

    @Override
    public float getPrecioHabitaciones() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   public boolean isTieneRestaurante(){
       return restaurante;
   }
   
}
