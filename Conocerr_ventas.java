//Un vendedor ha hecho una serie de ventas y desea conocer aquellas de $200 o
//menos, las mayores a $200 pero inferiores a $400, y el número de ventas de $400

//o superiores a tal cantidad. Haga un diagrama de flujo que le proporcione al ven-
//dedor esta información después de haber leído los datos de entrada.

import java.util.Scanner;
public class Conocerr_ventas {
public static void main(String[] args) {
Scanner leer = new Scanner(System.in);

         double ventas;
         int cont1=0;
         int cont2=0;
         int cont3=0;
         String resp;


    do{
         System.out.println("Dame el monto de la venta...");
         ventas = leer.nextDouble();

         if(ventas > 200 && ventas < 400){
             cont1++;
         }
         else if(ventas == 400){
            cont2++;
        }
        else if(ventas < 200){
            cont3++;
        }
        System.out.println("¿Quieres ingresar otra venta?");
        resp = leer.next();

        }
        while(resp.equalsIgnoreCase("si"));
        System.out.println("Las ventas mayores a $200 y menores que $400 son : " + cont1);
        System.out.println("Las ventas iguales a $400 son : " + cont2);
        System.out.println("Las ventas iguales menores a $200 son : " + cont3);
   
    }
}