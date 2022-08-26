//28. Crea una aplicación que dibuje una escalera de números, siendo cada línea
//números empezando en uno y acabando en el numero de la línea. Este es un
//ejemplo, si introducimos un 5 como altura:
//1
//12
//123
//1234
//12345


import java.util.Scanner;
public class Escalera_de_numeros {
public static void main(String[] args) {
Scanner leer = new Scanner(System.in);

        int tamaño,i=1;

        System.out.println("¿De que altura quieres tu escalera?");
        tamaño = leer.nextInt();

        while(i<=tamaño){  
            for(int p=1;p<=i;p++){
                System.out.print(p);
            }
            i++;
            System.out.println();
        }
    }
}