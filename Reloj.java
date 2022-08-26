//29.Imprima la funcionalidad de un reloj con el siguiente formato: hh:mm:ss deberá
//empezar en 00:00:00 y terminará en 24:00:00

import java.util.Scanner;
public class Reloj {
public static void main(String[] args) {
Scanner leer = new Scanner(System.in);


            for(int HORA=0;HORA<=23;HORA++){ 
                for(int MINUTO=0;MINUTO<=59;MINUTO++){
                    for(int SEGUNDO=0;SEGUNDO<=59;SEGUNDO++){
                            System.out.println(HORA + ":" + MINUTO + ":" + SEGUNDO);
                        }
                    }
                
                }
                System.out.println("24:00:00");
                System.out.println("A finalizado el reloj");

    
    
    }
    
}


                    
