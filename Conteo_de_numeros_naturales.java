//12. Lea 100 números naturales y cuente cuántos de ellos son positivos, negativos o nulos.

import java.util.Scanner;
public class Conteo_de_numeros_naturales {
    public static void main(String  args[]){
        Scanner leer = new Scanner(System.in);


        int posiv=0,negat=0,nulll=0,ale,n=1;
        
        System.out.println("Se mostraran 100 números naturales y te dire si son positivos,negativos o nulos");
        System.out.println("--------------------------------------------------------------------------------");

        while(n<=100){
        ale=(int) (Math.random() * 50 + (-5));
        System.out.println(ale);
        
        if(ale == 0 ){
            nulll = nulll + 1;
        }
        if(ale < 0 ){
            negat = negat + 1;
        }
        if(ale > 0 ){
            posiv = posiv + 1;

        }
        n++;
        }

        System.out.println("Se ingresarón " + posiv + " números positivos");
        System.out.println("Se ingresarón " + negat + " números negativos");
        System.out.println("Se ingresarón " + nulll + " números nulos");

        }
  }

  
  