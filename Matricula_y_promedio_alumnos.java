//22. En una clase de una universidad se tienen 35 alumnos. Calcule e imprima la
//matrícula y el promedio de calificaciones de cada alumno. Cabe aclarar que cada
//alumno de la clase tiene 5 calificaciones. No puede leer las calificaciones en 5
//variables diferentes, deberá usar solo una. Imprima además la matrícula y
//promedio del mejor y del peor alumno.

import java.util.Scanner;
public class Matricula_y_promedio_alumnos {
    public static void main(String  args[]){
        Scanner leer=new Scanner(System.in);

            float calif;
            double promedio=0,prom=0,mejorprom=9,peorprom=10;
            int contadorCalificaciones=0,mat=0,matricula,marticulamayor=0,marticulamenor=0;
            
            do{
                System.out.println("Dame la matricula del alumno");
                matricula=leer.nextInt();
                mat += 1;
                for(int n = 1 ; n <= 5 ;n = n+1){
                    System.out.println("ingresa la calificacion " );
                    calif=leer.nextFloat();
                    promedio+=calif;
                    contadorCalificaciones += 1;
                
                }
                prom = promedio / contadorCalificaciones;
                System.out.println("El alumno " + matricula + " tiene promedio de " + prom);
                promedio=0; //esta asignacion sirve para resetear el acumulador y no afecte el promedio del siguiente alumno
                contadorCalificaciones=0;//esta asignacion sirva para resetear el contador de calificaciones del siguiente alumno
                if(prom > mejorprom){
                    mejorprom = prom;
                    marticulamayor = matricula;
                }
                if(prom < peorprom){
                    peorprom = prom;
                    marticulamenor = matricula;
                }
            }
            while(mat <= 2);

            System.out.println("--------------------------------------------------------------------------------------------------------");
            System.out.println("El alumno " + marticulamenor + "  tiene promedio de: " + peorprom  + " y fue el peor promedio del salón");
            System.out.println("El alumno " + marticulamayor + "  tiene promedio de: " +  mejorprom + " y fue el mejor promedio del salón");
            System.out.println("--------------------------------------------------------------------------------------------------------");

    }    
}


