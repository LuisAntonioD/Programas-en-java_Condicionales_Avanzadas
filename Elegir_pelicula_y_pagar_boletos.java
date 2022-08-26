//7. Realiza un programa que muestre el nombre de 3 películas (las que tu quieras),
//el usuario deberá elegir la opción y luego deberá solicitar el número de boletos
//que quiere comprar. El costo de boleto es de $30 por persona. Deberá calcular el
//monto a pagar e indicar el nombre de la película seleccionada. Enseguida deberá
//mostrar nuevamente las 3 películas disponibles y volver a solicitar elegir película y
//el número de boletos a comprar. Agrega la opción de salir.

import java.util.Scanner;
public class Elegir_pelicula_y_pagar_boletos {
    public static void main(String  args[]){
        Scanner leer=new Scanner(System.in);


        int op=0,pel1,pel2,pel3;
        int boletos=30,total;

        do{
        System.out.println("Escoge una opción de peliculas disponibles");
        System.out.println("[1] Eternals");
        System.out.println("[2] Venom-Carnage liberado-");
        System.out.println("[3] Spiderman-No way home-");
        System.out.println("[4] Salir");
        op=leer.nextInt();
                    switch(op){
                        case 1:
                        System.out.println("¿Cuantos boletos deseas comprar?");
                        pel1=leer.nextInt();
                        total=pel1*boletos;
                        System.out.println("Vas a ver la pelicula de Eternals");
                        System.out.println("El total a pagar sera de:$" + total + " pesos");
                                break;
                        case 2:
                        System.out.println("¿Cuantos boletos deseas comprar?");
                        pel2=leer.nextInt();
                        total=pel2*boletos;
                        System.out.println("Vas a ver la pelicula de Venom-Carnage liberado-");
                        System.out.println("El total a pagar sera de:$" + total + " pesos");
                                break;  
                        case 3:
                        System.out.println("¿Cuantos boletos deseas comprar?");
                        pel3=leer.nextInt();
                        total=pel3*boletos;
                        System.out.println("Vas a ver la pelicula de Spiderman-No way home-");
                        System.out.println("El total a pagar sera de:$" + total + " pesos");
                                break;                  
                        }
                        System.out.println("---------------------------------------------------");

                }
                        while(op != 4);
                                 System.out.println("[[Listo saliste de la cartelera]]");

        }
}