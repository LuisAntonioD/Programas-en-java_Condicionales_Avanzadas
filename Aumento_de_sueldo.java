//11. Dado el sueldo de N trabajadores, considere un aumento del 15% a cada uno
//de ellos, si su sueldo es inferior a $800. Imprima el sueldo con el aumento
//incorporado (si corresponde).

import java.util.Scanner;
public class Aumento_de_sueldo {
    public static void main(String  args[]){
        Scanner leer=new Scanner(System.in);


        long rede=0;
        int tra;
        double sueldo=0,aumento,stot;
        
        
        System.out.println("Dime cuantos trabajadores son");
        tra=leer.nextInt();

    for(int n = 1 ; n <= tra ;n = n+1){
        System.out.println("Ingresa el sueldo del trabajador");
        sueldo=leer.nextDouble();
        if(sueldo < 800){
            aumento = sueldo * 0.15;
            stot= sueldo + aumento;
            System.out.println("Te daremos un aumento del 15%!!!");
            System.out.println("Tu sueldo final sera de $" + stot);
        }
        if(sueldo > 800){
            rede = Math.round(sueldo);
            System.out.println("Lo sentimos,no tendras aumento de sueldo y te daremos lo mismo $" + rede);

        }
        }
        
        
    }
}