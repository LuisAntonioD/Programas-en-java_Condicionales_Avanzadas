//14. Calcule el aumento de sueldo para un grupo de empleados de una empresa,
//teniendo en cuenta el siguiente criterio. Si el sueldo es inferior a $1000 aumenta
//15%, si el sueldo es mayor o igual a $1000 aumenta 12%. Imprima el sueldo
//nuevo del trabajador y el total de nómina de la empresa, considerando este nuevo aumento.

import java.util.Scanner;
public class Aumento_de_sueldo_y_total {
    public static void main(String  args[]){
        Scanner leer=new Scanner(System.in);

        String respuesta="";
        double sueldo=0,aumento,stot=0,nomina=0;

    do{
        System.out.println("Ingresa el sueldo del empleado");
        sueldo=leer.nextDouble();
        if(sueldo < 1000){
            aumento = sueldo * 0.15;
            stot= sueldo + aumento;
            System.out.println("Te daremos un aumento del 15%");
            System.out.println("Tu sueldo final sera de $" + stot);
        }
        else if(sueldo >= 1000){
            aumento = sueldo * 0.12;
            stot= sueldo + aumento;
            System.out.println("Te daremos un aumento del 12%");
            System.out.println("Tu sueldo final sera de $" + stot);
              
        }  
        nomina= nomina + stot;     
        System.out.println("¿Quieres ingresar el suledo de otro empleado?");
        respuesta=leer.next();
            
        }
            
        while(respuesta.equalsIgnoreCase("si"));
            System.out.println("---------------------------------------");
            System.out.println("La empresa pagara en total $" + nomina + " de nomina");
    }
}