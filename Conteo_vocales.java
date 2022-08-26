//3. Que lea una cadena y cuente cuántas vocales tiene.

import java.util.Scanner;
public class Conteo_vocales {
    public static void main(String  args[]){
        Scanner leer=new Scanner(System.in);


        int totvocales=0,cont=0;
        String vocs;
        
        
        System.out.println("Ingresa una palabra");
        vocs=leer.next();

    for(int n = 0 ; n < vocs.length() ;n = n+1){
        cont++;
    }
    for(int n = 0 ; n < vocs.length() ;n = n+1){
        if(vocs.charAt(n) == 'a' || vocs.charAt(n) == 'A'){
            totvocales++;
        }
        else if(vocs.charAt(n) == 'e' || vocs.charAt(n) == 'E'){
            totvocales++;

        }
        else if(vocs.charAt(n) == 'i' || vocs.charAt(n) == 'I'){
            totvocales++;

        }
        else if(vocs.charAt(n) == 'o' || vocs.charAt(n) == 'O'){
            totvocales++;

        }
        else if(vocs.charAt(n) == 'u' || vocs.charAt(n) == 'U'){
            totvocales++;

        }
        }
        System.out.println("Se ingresarón " + totvocales + " vocales");
    }
        

}
  
  
