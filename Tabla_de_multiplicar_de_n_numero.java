//30. Muestre por pantalla la tabla de multiplicar de un número entero introducido
//por el usuario. El proceso debe repetirse mientras que el usuario lo desee.

import java.util.Scanner;
public class Tabla_de_multiplicar_de_n_numero {
    public static void main(String  args[]){
        Scanner leer=new Scanner(System.in);

        int multi,con;
        String respuesta;

                do{
                    System.out.println("Dime un número y te dire su tabla de multiplicar hasta el 10");
                    System.out.println("-------------------------------------------------------------");
                    multi=leer.nextInt();
                    System.out.println("Esta es la tabla del " + multi);
                    for(int n = 1 ; n <= 10 ;n = n+1){
                        con=n*multi;
                        System.out.println(multi + " X " + n + " = " + con);
                    }
                System.out.println("¿Quieres saber otra tabla de multiplicar?");
                respuesta=leer.next();
            }
            while(respuesta.equalsIgnoreCase("si"));
            System.out.println("ADIOS");
              
    }
}
  