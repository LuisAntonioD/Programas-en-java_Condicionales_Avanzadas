//13. Dado N números enteros como datos, obtenga: a) cuántos números leídos
//fueron mayores que cero. B) calcule el promedio de los números positivos. C)
//obtenga el promedio de todos los números.

import java.util.Scanner;
public class Numero_mayor_y_promedio {
    public static void main(String  args[]){
        Scanner leer = new Scanner(System.in);


        int promposiv=0,posiv=0,suma1=0,t,numero,n=1;
        double promtot=0;
        
        System.out.println("Dime cuantos numeros quieres ingresar");
        t=leer.nextInt();

        while(n<=t){                 
        System.out.println("Ingresa el numero positivo");
        numero=leer.nextInt();
        
        if(numero > 0 ){
            posiv = posiv + 1;
            suma1 = suma1 + numero;
            promposiv = suma1 / posiv;
            promtot = (double)suma1 / t;
            
        } 
        n++;
    
        }
        System.out.println("------------------------------");
        System.out.println("Se ingresarón " + posiv + " números mayores a cero");
        System.out.println("suma de los numeros es " + suma1);
        System.out.println("El promedio de los numeros positivos es " + promposiv);
        System.out.println("El promedio de todos los numeros es " + promtot);
        System.out.println("------------------------------");

        }
  }