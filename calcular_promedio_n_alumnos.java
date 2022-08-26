//26. Haga un programa para registrar las n calificaciones de m alumnos, calcular y
//desplegar su promedio. También desplegar si esta aprobado con calificación
//mayor o igual a 70, en caso contrario no aprobado. Al final debe indicar la cantidad
//de aprobados y la cantidad de no aprobados.

import java.util.Scanner;
public class calcular_promedio_n_alumnos {
    public static void main(String  args[]){
        Scanner leer=new Scanner(System.in);

            float calif,CCalificaciones=0;
            double promedio=0,prom=0;
            int al,cont2=0,cont3=0,CcontCalificaciones;
            
                System.out.println("Dime cuantos alumnos seran");
                al=leer.nextInt();
                for(int p = 1 ; p <= al ;p = p+1){
                System.out.println("Cuantas calificaiones seran para el alumno? " + p);
                CcontCalificaciones=leer.nextInt();
                for(int n = 1 ; n <= CcontCalificaciones ;n = n+1){
                    System.out.println("ingresa la calificacion del alumno");
                    calif=leer.nextFloat();
                    promedio+=calif;
                    CCalificaciones += 1;
                }
                prom = promedio / CcontCalificaciones;
                promedio=0; //esta asignacion sirve para resetear el acumulador y no afecte el promedio del siguiente alumno
                CCalificaciones=0;//esta asignacion sirva para resetear el contador de calificaciones del siguiente alumno
                if(prom >= 70){
                    System.out.println("Aprovaste con promedio de: " + prom);
                    cont2+=1;
                }
                if(prom < 70){
                    System.out.println("No pasaste tu promedio fue de: " + prom);
                    cont3+=1;
                } 
                }
            System.out.println("Los alumnos aprobados fueron: " + cont2);
            System.out.println("Los alumnos no aprobados fueron: " + cont3);
    }    
}