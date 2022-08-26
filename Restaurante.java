//24. En un restaurante se sirven 7 platillos diferentes. Cada platillo se reconoce por
//una clave, que es un valor numérico comprendido entre 1 y 7. Diariamente se
//atienden a numerosos clientes. Haga lo siguiente: a) Lea los precios de los 7
//platillos. b) lea los datos de cada cliente y entregue un recibo del consumo. c)
//calcule lo que ha vendido el restaurante al final del día. d) Imprima cual es el
//platillo más consumido al final del día.

import java.util.Scanner;
public class Restaurante {
    public static void main(String  args[]){
        Scanner leer=new Scanner(System.in);


        int op=0,pla1,pla2,pla3,pla4,pla5,pla6,pla7;
        int cplatillos,total=0,cont=0;
        int contp1=0,contp2=0,contp3=0,contp4=0,contp5=0,contp6=0,contp7=0;
        int platillomv=0,platillomvtotal=0;
         

        System.out.println("[¿Que precio tiene el platillo 1?]  ");
        pla1=leer.nextInt();
        System.out.println("[¿Que precio tiene este platillo 2?]  ");
        pla2=leer.nextInt();
        System.out.println("[¿Que precio tiene este platillo 3?]  ");
        pla3=leer.nextInt();
        System.out.println("[¿Que precio tiene este platillo 4?] ");
        pla4=leer.nextInt();
        System.out.println("[¿Que precio tiene este platillo 5?] ");
        pla5=leer.nextInt();
        System.out.println("[¿Que precio tiene este platillo 6?] ");
        pla6=leer.nextInt();
        System.out.println("[¿Que precio tiene este platillo 7?]");
        pla7=leer.nextInt();


        do{
        System.out.println("Para elegir un platillo ingresa un número del 1 al 7");
        System.out.println("[Ingresa el numero 8 para salir] Salir");
        op=leer.nextInt();
                    switch(op){
                        case 1:
                        System.out.println("Eligio el platillo número 1");
                        System.out.println("¿Cuantos platillos quiere de esta elección?");
                        cplatillos=leer.nextInt();
                        contp1+=cplatillos;
                        total = cplatillos * pla1;
                        cont+= total;
                        System.out.println("-----------------------------------------------");
                        System.out.println("Eligio el platillo: 1 ");
                        System.out.println("Tiene un preo de:$" + pla1);
                        System.out.println("Va a comprar: " + contp1);
                        System.out.println("El total a pagar sera de:$" + total + " pesos");
                        System.out.println("-----------------------------------------------");

                                break;
                        case 2:
                        System.out.println("Eligio el platillo número 2");
                        System.out.println("¿Cuantos platillos quiere de esta elección?");
                        cplatillos=leer.nextInt();
                        contp2+=cplatillos;
                        total = cplatillos * pla2;
                        cont+= total;
                        System.out.println("-----------------------------------------------");
                        System.out.println("Eligio el platillo: 2 ");
                        System.out.println("Tiene un precio de:$" + pla2);
                        System.out.println("Va a comprar: " + contp2);
                        System.out.println("El total a pagar sera de:$" + total + " pesos");
                        System.out.println("-----------------------------------------------");
                                break;  
                        case 3:
                        System.out.println("Eligio el platillo número 3");
                        System.out.println("¿Cuantos platillos quiere de esta elección?");
                        cplatillos=leer.nextInt();
                        contp3+=cplatillos;
                        total = cplatillos * pla3;
                        cont+= total;
                        System.out.println("-----------------------------------------------");
                        System.out.println("Eligio el platillo: 3 ");
                        System.out.println("Tiene un precio de:$" + pla3);
                        System.out.println("Va a comprar: " + contp3);
                        System.out.println("El total a pagar sera de:$" + total + " pesos");
                        System.out.println("-----------------------------------------------");
                                break;
                        case 4:
                        System.out.println("Eligio el platillo número 4");
                        System.out.println("¿Cuantos platillos quiere de esta elección?");
                        cplatillos=leer.nextInt();
                        contp4+=cplatillos;
                        total = cplatillos * pla4;
                        cont+= total;
                        System.out.println("-----------------------------------------------");
                        System.out.println("Eligio el platillo: 4 ");
                        System.out.println("Tiene un precio de:$" + pla4);
                        System.out.println("Va a comprar: " + contp4);
                        System.out.println("El total a pagar sera de:$" + total + " pesos");
                        System.out.println("-----------------------------------------------");
                                break;
                        case 5:
                        System.out.println("Eligio el platillo número 5");
                        System.out.println("¿Cuantos platillos quiere de esta elección?");
                        cplatillos=leer.nextInt();
                        contp5+=cplatillos;
                        total = cplatillos * pla5;
                        cont+= total;
                        System.out.println("-----------------------------------------------");
                        System.out.println("Eligio el platillo: 5 ");
                        System.out.println("Tiene un precio de:$" + pla5);
                        System.out.println("Va a comprar: " + contp5);
                        System.out.println("El total a pagar sera de:$" + total + " pesos");
                        System.out.println("-----------------------------------------------");
                                break; 
                        case 6:
                        System.out.println("Eligio el platillo número 6");
                        System.out.println("¿Cuantos platillos quiere de esta elección?");
                        cplatillos=leer.nextInt();
                        contp6+=cplatillos;
                        total = cplatillos * pla6;
                        cont+= total;
                        System.out.println("-----------------------------------------------");
                        System.out.println("Eligio el platillo: 6 ");
                        System.out.println("Tiene un precio de:$" + pla6);
                        System.out.println("Va a comprar: " + contp6);
                        System.out.println("El total a pagar sera de:$" + total + " pesos");
                        System.out.println("-----------------------------------------------");
                                break;
                        case 7:
                        System.out.println("Eligio el platillo número 7");
                        System.out.println("¿Cuantos platillos quiere de esta elección?");
                        cplatillos=leer.nextInt();
                        contp7+=cplatillos;
                        total = cplatillos * pla7;
                        cont+= total;
                        System.out.println("-----------------------------------------------");
                        System.out.println("Eligio el platillo: 7 ");
                        System.out.println("Tiene un precio de:$" + pla7);
                        System.out.println("Va a comprar: " + contp7);
                        System.out.println("El total a pagar sera de:$" + total + " pesos");
                        System.out.println("-----------------------------------------------");
                                break;

                                
       
                }
                    if( contp1>platillomv ){
                        platillomv = contp1;
                        platillomvtotal = 1;                
                        }
                    if( contp2>platillomv ){
                        platillomv = contp2;
                        platillomvtotal = 2;
                        }
                    if( contp3>platillomv ){
                        platillomv = contp3;
                        platillomvtotal = 3;
                        }
                    if( contp4>platillomv ){
                        platillomv = contp4;
                        platillomvtotal = 4;
                        }
                    if( contp5>platillomv ){
                        platillomv = contp5;
                        platillomvtotal = 5;
                        }
                    if( contp6>platillomv ){
                        platillomv = contp6;
                        platillomvtotal = 6;
                        }
                    if( contp7>platillomv ){
                        platillomv = contp7;
                        platillomvtotal = 7;
                
                        }
                    

                    
    }
    
    while(op != 8);
    System.out.println("El total de la venta del dia fue:$" + cont + " pesos");
    System.out.println("El platillo mas vendido fue el número: " + platillomvtotal);


}
}