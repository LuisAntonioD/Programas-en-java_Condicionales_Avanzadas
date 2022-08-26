//5. Realiza un programa que calcula el cubo de un número entero de dos formas
//distintas: a) con Math.pow b) con ciclos c) salir. El programa debe empezar
//mostrando el menú con las opciones anteriores y realizar el cálculo según
//corresponda, en caso de elegir salir, deberá terminar el programa.

import java.util.Scanner;
public class Cubo_de_un_numero {
    public static void main(String  args[]){
        Scanner leer=new Scanner(System.in);


        int tot,pot=3,res,op;
        double cubo,tota=1;
        long cred=0,cred2=1;

        
        System.out.println("Vamos a calcular el cubo de un número");
        System.out.println("--------------------------------------------------------");


        
do{
        System.out.println("Escoge una de estas dos opciones para calcular tu número");
        System.out.println("[1] Forma con ciclos");
        System.out.println("[2] Froma con Math.pow");
        System.out.println("[3] Salir");
        op=leer.nextInt();
        switch(op){
            case 1:
            System.out.println("Dame tu número");
            tot=leer.nextInt();
            res=1;
            for (int j = 1;j <= pot ;j = j+1){
                res=res * tot;       
            }
            System.out.println(tot + "^3=" + res);
                    break;

            case 2:
            System.out.println("Dame tu número");
            tota=leer.nextDouble();
            cubo=Math.pow(tota, pot); 
            cred = Math.round(cubo); 
            cred2 = Math.round(tota);     
            System.out.println(cred2 + "^3=" + cred);
                    break;

        }

        }
        while(op !=  3);
        System.out.println("Saliste del programa");    
    }
}