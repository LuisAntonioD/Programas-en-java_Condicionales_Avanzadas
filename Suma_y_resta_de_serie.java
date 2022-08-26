//10. Que lea un número entero N y calcule el resultado de la siguiente serie:
//1-1/2+1/3-…+- 1/N

import java.util.Scanner;
public class Suma_y_resta_de_serie {
    public static void main(String  args[]){
        Scanner leer=new Scanner(System.in);


        boolean bandera = true;
        int numero,i=2;
        double op=0,resta=0,suma=1;


        System.out.println("dame el tope de la serie");
        numero=leer.nextInt();
        System.out.print("LA SERIE ES: 1");
        while(i <= numero){
            if(bandera==false){
                System.out.print(" + 1/"+i);
                suma += (double)1/i;
                bandera=true;
            }
            else{
                System.out.print("- 1/"+i);
                resta -= (double)1/i;
                bandera=false;
            }
            i = i + 1;
            }

            op=resta+suma; 
            System.out.println("    ");
            System.out.println("El resultado de la serie es: "+ op);

    }
        
}


