//21. Calcule de la secuencia de FIBONACCI 680 términos de ésta. Recuerde que
//los dos primeros números de la serie son 0 y 1. El resto se calcula como la suma
//de los dos inmediatos números que le preceden.
//0,1,1,2,3,5,8,13,21,34,55,….

import java.util.Scanner;
public class secuencia_FIBONACCII {
public static void main(String[] args) {
Scanner leer = new Scanner(System.in);

        int n,anterior=0,cont1=1,cont2=3,acum;

        System.out.println("Dime cuantos números quieres imprimir");
        n = leer.nextInt();


            if (n >= 1 && n >= 2) {
                System.out.println("0");
                System.out.println("1");
            }
            while (cont2 <= n) {
                acum = cont1;
                cont1 = cont1 + anterior;
                anterior = acum;
                cont2 = cont2 + 1;
                System.out.println(cont1); 
            }
    }
}





       