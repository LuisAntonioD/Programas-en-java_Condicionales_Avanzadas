//9. Calcule e imprima los elementos de la siguiente serie:
//1ˆ1 +2ˆ2 +3ˆ3+…NˆN

import java.util.Scanner;
public class Potencia_del_mismo_numero_serie {
    public static void main(String  args[]){
        Scanner leer=new Scanner(System.in);

        int tot,n=1,resultado=0;
        boolean bandera=true;
        
        System.out.println("Dime hasta donde llegara la serie");
        tot=leer.nextInt();

    while(n <= tot){
        if(bandera==true){
            resultado += Math.pow(n, n);
            System.out.print(n + "^" + n);
            bandera=false; 
        }
        else if(bandera==true){
            resultado += Math.pow(n, n);
            System.out.print(n + "^" + n + " + ");
            bandera=true;
        }
        else{
            resultado += Math.pow(n, n);
            System.out.print(" + " + n + "^" + n);
            bandera=false;
        }
        n = n + 1;
        }
        System.out.println("        ");
        System.out.println("El resultado se la suma de todos esos números es = " + resultado);
        }
  }

  