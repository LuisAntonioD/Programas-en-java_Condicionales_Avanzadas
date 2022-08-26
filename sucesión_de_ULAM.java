//19. Lea un entero positivo y obtenga e imprima la sucesión de ULAM.
//⁃ Comience con cualquier entero positivo
//⁃ Si es par, divídalo entre 2, si es impar, multiplíquelo por 3 y agregue 1.
//⁃ Obtenga enteros sucesivamente repitiendo el proceso. Al final obtendrá el número 1.

import java.util.Scanner;
public class sucesión_de_ULAM {
    public static void main(String  args[]){
        Scanner leer=new Scanner(System.in);

        int n;

        System.out.println("Dame un numero");
        n=leer.nextInt();


        if(n == 0){
            System.out.println("Dame un número valido para hacer la sucesión de ULAM");
        }
        while(n != 1){
            System.out.println(n); 
            if(n % 2 == 1){
                n = (n*3) + 1;
            }
            else{
                n = n/2;
            }
        }
        System.out.println(n);
    }
}