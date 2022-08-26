//2. Realiza un programa que solicite al usuario números enteros hasta que:
//La suma de todos los números introducidos sea superior a 100
//Se introduzca 3 veces el valor 3
//Se introduzca 2 veces el valor 2
//Se introduzca 8 veces consecutivas el mismo valor

import java.util.Scanner;
public class Pedir_numeros_hasta_que {
    public static void main(String  args[]){
        Scanner leer=new Scanner(System.in);

        int tres=0,dos=0,ocho=0,otro,numero,suma1=0;
        boolean bandera=true;


        do{
            System.out.println("Dame el numero que sea");
            numero=leer.nextInt();
            suma1+=numero;
            otro=numero;
            if(numero == 3){
                tres++;
            }
            else if(numero == 2){
                dos++;
            }
            else if(otro == numero){
                ocho++;
            }
            else if(otro != numero){
                ocho=0;
            }
            else{
                ocho=0;
            }
            if(suma1 > 100){
            System.out.println("Se cumplio la condición de la suma de los numeros ingresados sea mayor a 100...");
            System.out.println("Por lo tanto la suma dio: " + suma1);
                bandera=false;
            }
            else if(tres==3){
                System.out.println("Se cumplio la condición de ingresar 3 veces el valor de 3...");
                bandera=false;
            }
            else if(dos==2){
                System.out.println("Se cumplio la condición de ingresar 2 veces el valor de 2...");
                bandera=false;
            }
            else if(ocho==8){
                System.out.println("Se cumplio la condición de ingresar 8 veces el mismo valor...");
                bandera=false;
            }
            
            
        }
        while(bandera != false);
    }
 }
