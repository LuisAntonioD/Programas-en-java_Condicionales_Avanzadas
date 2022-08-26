//20. Lea dos números enteros positivos, calcule la potencia del primero por el
//segundo. No puede utilizar el operador de potencia.

import java.util.Scanner;
public class Potencia_de_numeros {
    public static void main(String  args[]){
        Scanner leer=new Scanner(System.in);

        int n1,n2,pot=1;

        System.out.println("Calculare la potencia de los números que me des");
        System.out.println("------------------------------------------------");
        System.out.println("Dame un numero");
        n1=leer.nextInt();
        System.out.println("Dame otro numero");
        n2=leer.nextInt();


        for(int contpot=1;contpot <= n2;contpot++){
            pot = pot * n1;
            
        }
        System.out.println(n1 + "^" + n2 + "=" + pot);
        
    }
}

