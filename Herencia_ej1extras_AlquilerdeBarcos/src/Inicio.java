
import Entidades.Alquiler;
import Entidades.Barco;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class Inicio {

  
    public static void main(String[] args) throws ParseException {
        

      Alquiler alquiler = new Alquiler();
      alquiler.crearAlquiler();
      alquiler.calcularPrecioAlquiler();
     
      
     
     
    }
    
}
