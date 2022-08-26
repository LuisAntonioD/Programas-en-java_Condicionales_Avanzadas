//25. Calcule e imprima todos los números perfectos de un número leído por
//teclado. Recuerde que la suma de sus divisores excepto el mismo es igual al
//propio número.
//Ejemplo: Ingresa un número: 8
//Sus números perfectos son: 6
//6= 3+2+1

import java.util.Scanner;
public class Numeros_perfectos {
public static void main(String[] args) {
Scanner leer = new Scanner(System.in);

            int numero,divicion=0,suma=0;

            System.out.print("Dime un número: ");
            numero = leer.nextInt();
            System.out.println("Estos son sus números perfectos");
            for(int i = 1;i < numero ;i ++){

            if(numero % i == 0){
                    divicion = i;
                    suma+=divicion;
                    System.out.println(divicion);
            }
            }
            if(suma == numero){
                System.out.println("            ");
                System.out.println("La suma de dichos números da: " + suma + " estonces deducimos que...");
                System.out.println("Este si es un número perfecto");
            }
            else if(suma != numero){
                System.out.println("            ");
                System.out.println("La suma de dichos números da: " + suma + " estonces deducimos que...");
                System.out.println("Este no es un número perfecto");
            }
        
    }
}
