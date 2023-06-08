
import Entidades.Electrodomestico;
import Entidades.Lavadora;
import Entidades.Televisor;
import java.util.ArrayList;
import java.util.Scanner;


public class Tienda {

    
       public static void main(String[] args) {
           int Electrodomestico;
           ArrayList <Electrodomestico> elect = new ArrayList();
           int cont=0 ;
           Scanner leer = new Scanner(System.in).useDelimiter("\n");
    //Lavadora lavadora = new Lavadora().crearLavadora();
    //Televisor tele = new Televisor().crearTele();        
    //lavadora.precioFinal();
    //tele.precioFinal();
    //System.out.println("El precio final de la lavadora es: $" + lavadora.getPrecio());
   // System.out.println("El precio final del televisor es: $" + tele.getPrecio());
  
           for (int i = 0; i < 4; i++) {
                 System.out.println("Bienvenid@ a la Tienda!");
           System.out.println(" Elija una de las opciones");
           System.out.println("1.Comprar Lavadora");
           System.out.println("2.Comprar TV");
           String p= leer.next();
           if (p.equals("1")){
                     Lavadora lav = new Lavadora().crearLavadora();
                     lav.precioFinal();
                     cont+= lav.getPrecio();
               elect.add(lav);
           }
            if (p.equals("2")){
                     Televisor tv = new Televisor().crearTele();
                     tv.precioFinal();
                     cont+= tv.getPrecio();
                     elect.add(tv);
               
           }
               
               
           }
           
           System.out.println(" El precio final es de $ "+cont);
           
   
}
       /*
   Siguiendo el ejercicio anterior, en el main vamos a crear un ArrayList de Electrodomésticos
para guardar 4 electrodomésticos, ya sean lavadoras o televisores, con valores ya asignados.
Luego, recorrer este array y ejecutar el método precioFinal() en cada electrodoméstico. Se
deberá también mostrar el precio de cada tipo de objeto, es decir, el precio de todos los
televisores y el de las lavadoras. Una vez hecho eso, también deberemos mostrar, la suma del
precio de todos los Electrodomésticos. Por ejemplo, si tenemos una lavadora con un precio de
2000 y un televisor de 5000, el resultado final será de 7000 (2000+5000) para
electrodomésticos, 2000 para lavadora y 5000 para televisor. 
*/
       
       
}
