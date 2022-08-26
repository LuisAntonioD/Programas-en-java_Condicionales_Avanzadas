//6. Realiza un programa que calcule e imprima las tablas de multiplicar del 2,4,6,8 y 10. 
//Ejemplo:
//2x1=2
///2x2=4
//…
//2x10=20
//4x1=4
//..
//4x10=10
//… etc hasta imprimir la tabla del 10.

import java.util.Scanner;
public class Tablas_de_multiplicar {
    public static void main(String  args[]){
        Scanner leer=new Scanner(System.in);
        int multi;

        for(int o = 2 ; o <= 10 ;o = o+2){
        System.out.println("---------------------------");
         
            for(int n = 1 ; n <= 10 ;n = n+1){
                multi = o * n;
                System.out.println(o + "X" + n + " = " + multi);    
            }
        } 

    }

}
