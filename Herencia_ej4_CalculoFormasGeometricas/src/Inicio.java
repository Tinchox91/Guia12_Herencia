
import Entidades.Circulo;
import Entidades.Rectangulo;
import java.util.Scanner;


public class Inicio {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Circulo circulo= new Circulo();
        Rectangulo rectangulo = new Rectangulo();
        boolean val=true;
        do {
            System.out.println("Indica el calculo:");
            System.out.println("1.Circulo");
            System.out.println("2.Rectangulo");
            System.out.println("3.Salir");
            String var= leer.next();
            if (var.equals("3")){
                val=false;
            }
            switch (var) {
                case "1":System.out.println("ingrese Radio");
                double radio=leer.nextDouble();
                circulo.setRadio(radio);
                double area1=circulo.calcularArea();
                double perimetro1=circulo.calcularPerimetro();
                    System.out.println("El aerea es: "+area1);
                    System.out.println("El perimetro es: "+perimetro1);
                    
                    break;
                case "2":
                    System.out.println("Ingrese base: ");
                    rectangulo.setBase(leer.nextDouble());
                    System.out.println("Ingrese Altura");
                    rectangulo.setAltura(leer.nextDouble());
                    double area2=rectangulo.calcularArea();
                    double perimetro2 = rectangulo.calcularPerimetro();
                    System.out.println("El aerea es: "+area2);
                    System.out.println("El perimetro es: "+perimetro2);
                    break;
                case "3":
                    break;
                default:
                    System.out.println("Letra equivocada");
            }
            
            
        } while (val);
    }
    
}
