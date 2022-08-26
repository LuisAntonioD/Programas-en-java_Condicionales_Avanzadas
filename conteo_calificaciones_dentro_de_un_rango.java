//18. Dadas las calificaciones de un grupo de alumnos que presentaron un examen
//de metodología de la programación, calcule e imprima cuántas calificaciones hay
//en cada uno de los siguientes rangos:
//0..3.99
//4..5.99
//6..7.99
//8..10
//Considere el fin de los datos por -1

import java.util.Scanner;
public class conteo_calificaciones_dentro_de_un_rango {
    public static void main(String  args[]){
        Scanner leer=new Scanner(System.in);

        int contcalif1=0,contcalif2=0,contcalif3=0,contcalif4=0;
        double calificacion;

        do{
            System.out.println("Dame la calificaion del alumno");
            calificacion=leer.nextDouble();
            if(calificacion >=0 && calificacion <=3.99){
                contcalif1 += 1;      
            }
            if(calificacion >=4 && calificacion <=5.99){
                contcalif2 += 1;      
            }
            if(calificacion >=6 && calificacion <=7.99){
                contcalif3 += 1;      
            }
            if(calificacion >=8 && calificacion <= 10){
                contcalif4 += 1;      
            }   
        }
        while(calificacion != -1);
        System.out.println("Estos fueron los alumnos con calificaiones desde 0 hasta 3.99 = " + contcalif1);
        System.out.println("Estos fueron los alumnos con calificaiones desde 4 hasta 5.99 = " + contcalif2);
        System.out.println("Estos fueron los alumnos con calificaiones desde 6 hasta 7.99 = " + contcalif3);
        System.out.println("Estos fueron los alumnos con calificaiones desde 8 hasta 10 = " + contcalif4);
    }
}