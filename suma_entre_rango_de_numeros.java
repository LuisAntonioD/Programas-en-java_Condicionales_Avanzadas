//16. Calcule la suma de los números pares comprendidos entre 10 y 50.

import java.util.Scanner;
public class suma_entre_rango_de_numeros {
    public static void main(String  args[]){
        Scanner leer=new Scanner(System.in);



        int suma=0,n=8;
        //int suma1=0;
        

        while(n <= 48 ){
            n = n+2;
            suma= suma + n; 
            System.out.println(n);
        }
       
        System.out.println("La suma de esos números es = " + suma);

////////////////      segunda opción  ///////////////

        //for(int p=10;p <= 50;p+=2){
            //suma1= suma1 + p; 
            //System.out.println(p);
            //}
           
            //System.out.println("La suma de esos números es = " + suma1);

        }
  }