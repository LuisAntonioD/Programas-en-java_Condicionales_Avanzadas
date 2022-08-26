//1.Realiza un programa que solicite por pantalla dos números (pueden tener decimales) y 
//un operador aritmético (+, -, *, /) deberá entonces calcular e imprimir
//el resultado de la operación y preguntar si desea realizar otra operación.

import java.util.Scanner;
public class Calculadora {
    public static void main(String  args[]){
        Scanner leer=new Scanner(System.in);

        double num11,num21,op2=0;
        String operador,respuesta;
   
        System.out.println("Dame dos números y te dire su operación correspondiente");
        System.out.println("--------------------------------------------------------");

                do{
                System.out.println("Dame el operador que necesites");
                operador=leer.next();
                System.out.println("Dame el primero");
                num11=leer.nextDouble();
                System.out.println("Dame el segundo");
                num21=leer.nextDouble();
                
                if(operador.equals("+")){
                    op2=num11 + num21;
                    System.out.println("El resultado es: " + op2);
                }
                else if(operador.equals("-")){
                    op2=num11 - num21;
                    System.out.println("El resultado es: " + op2);
                }
                else if(operador.equals("*")){
                    op2=num11 * num21;
                    System.out.println("El resultado es: " + op2);
                }
                else if(operador.equals("/")){
                    op2=num11 / num21;
                    System.out.println("El resultado es: " + op2);
                }
                System.out.println("¿Quieres hacer otra operación?");
                respuesta=leer.next();
            }
            while(respuesta.equalsIgnoreCase("si"));
            System.out.println("ADIOS");
              
    }
}
                

                    
            
                    
                    
                
               
            

            
            
        
    


