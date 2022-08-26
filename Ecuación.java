//8. Pida un el valor de x y demuestre si se satisface la expresión siguiente:
///El programa deberá terminar cuando SI se satisfaga la expresión, indicando un
//mensaje en la pantalla e indicando con que valor de X se logro. En caso de que
//NO se satisfaga deberá solicitar nuevamente un valor para X.


import java.text.DecimalFormat;
import java.util.Scanner;
public class Ecuación {
    public static void main(String  args[]){
        Scanner leer=new Scanner(System.in);
        DecimalFormat df = new  DecimalFormat("#0.0");


        float x;
        float op;
        boolean bandera= true;

    

        do{
            System.out.println("Dame el valor de x expresado en la operación");
            x=leer.nextFloat();
            op= (5 * x - 7) / (x + 2) - 1;
            if(op <= 0.5){
                System.out.println("(5 *"+ x + "- 7) / (" + x + "+2) - 1 = " +df.format(op));
                System.out.println("Se logro la operación con el valor de " + x + " en x y dio resultado la expresión requerida = " + "1/2 o bien 0.5");
                bandera = false;
            }
            else{
                System.out.println("(5 *"+ x + "- 7) / (" + x + "+2) - 1 = " +df.format(op));
                System.out.println("Vuelve a intentarlo no dio el resultado requerido");
            }
        }
        while(bandera != false);
        System.out.println("Adios");


        
    }
}