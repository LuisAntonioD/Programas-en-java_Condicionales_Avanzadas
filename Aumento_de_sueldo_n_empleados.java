//15. Calcule el aumento de sueldos para N empleados de una empresa, bajo el
//siguiente criterio: si el sueldo es menor a $1000 aumento 12%, si el sueldo esta
//comprendido entre $1000 y $2500 aumenta 10%, si el sueldo es mayor a $2500
//aumenta 8%. Imprima lo siguiente: a) el nuevo sueldo del trabajador. b) el monto
//total de la nómina considerando el aumento.

import java.util.Scanner;
public class Aumento_de_sueldo_n_empleados {
    public static void main(String  args[]){
        Scanner leer=new Scanner(System.in);


        int tra;
        double sueldo=0,aumento,stot=0,nomina=0;
        
        
        System.out.println("Dime cuantos empleados son");
        tra=leer.nextInt();

    for(int n = 1 ; n <= tra ;n = n+1){
        System.out.println("Ingresa el sueldo del empleado");
        sueldo=leer.nextDouble();
        if(sueldo < 1000){
            aumento = sueldo * 0.12;
            stot= sueldo + aumento;
            System.out.println("Te daremos un aumento del 12%");
            System.out.println("Tu sueldo final sera de $" + stot);
        }
        if(sueldo >= 1000 && sueldo <= 2500){
            aumento = sueldo * 0.10;
            stot= sueldo + aumento;
            System.out.println("Te daremos un aumento del 10%");
            System.out.println("Tu sueldo final sera de $" + stot);
        }
        if(sueldo >= 2500){
            aumento = sueldo * 0.08;
            stot= sueldo + aumento;
            System.out.println("Te daremos un aumento del 8%");
            System.out.println("Tu sueldo final sera de $" + stot);

        }    
        nomina= nomina + stot;
        }
            System.out.println("------------------------------------------------------");
            System.out.println("La empresa pagara en total $" + nomina + " de nomina");
    }
}