
package Inicio;


import EntidadesAlojamientos.Alojamiento;
import EntidadesAlojamientos.Camping;
import EntidadesAlojamientos.Hotel;
import EntidadesAlojamientos.Hotel_4;
import EntidadesAlojamientos.Hotel_5;
import EntidadesAlojamientos.Residencia;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


public class Inicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public static void main(String[] args) {
        
        // Crear instancias de alojamientos
        Hotel hotel1 = new Hotel_4('a',"elpepe",20,50,50,3,200,"hotel 4 estrellas","pampa 22","mar del plata","pepe") {};
            
        Hotel hotel2 = new Hotel_5('b',"comela",20,30,50,10,30,80,5,500,"hotel 5 estrellas","su direccion","su localidad","encargado") {};
        Camping camping1 = new Camping(20,2,false,false,21,"El grillo","su direccion","sulocalidad","sergio") {}; 
        Residencia residencia1 = new Residencia(22,true,true,true,60,"caca","dire","necochea","pepardo") {};
        // Crear una lista de alojamientos
        List<Alojamiento> alojamientos = new ArrayList<>();
        alojamientos.add(hotel1);
        alojamientos.add(hotel2);
        alojamientos.add(camping1);
        alojamientos.add(residencia1);
          
        // Consultar todos los alojamientos
        System.out.println("Todos los alojamientos:");
        for (Alojamiento alojamiento : alojamientos) {
            System.out.println(alojamiento.getNombre());
        }

        // Consultar todos los hoteles de más caro a más barato
        System.out.println("Hoteles de más caro a más barato:");
        List<Hotel> hoteles = new ArrayList<>();
        for (Alojamiento alojamiento : alojamientos) {
            if (alojamiento instanceof Hotel) {
                hoteles.add((Hotel) alojamiento);
            }
        }
         Collections.sort(hoteles, new Comparator<Hotel>() {          
            public int compare(Hotel hotel1, Hotel hotel2) {
                return Float.compare(hotel2.getPrecioHabitaciones(), hotel1.getPrecioHabitaciones());
            }
        });
        for (Hotel hotel : hoteles) {
            System.out.println(hotel.getNombre() + " - Precio: $" + hotel.getPrecioHabitaciones());
        }

        // Consultar todos los campings con restaurante
        System.out.println("Campings con restaurante:");
        for (Alojamiento alojamiento : alojamientos) {
            if (alojamiento instanceof Camping) {
                Camping camping = (Camping) alojamiento;
                if (camping.isTieneRestaurante()) {
                    System.out.println(camping.getNombre());
                }
            }
        }
        // Consultar todas las residencias que tienen descuento
        System.out.println("Residencias con descuento:");
        for (Alojamiento alojamiento : alojamientos) {
            if (alojamiento instanceof Residencia) {
                Residencia residencia = (Residencia) alojamiento;
                if (residencia.isDescuentoGremios()) {
                    System.out.println(residencia.getNombre());
                }
            }
        }
        }
    
}
