//23. En una universidad con un número determinado de alumnos se desea obtener:
//a) el porcentaje y promedio de la población femenina
//b) el porcentaje y promedio de la población masculina y el promedio general. 
//Por cada alumno se ingresa: matrícula, sexo, semestre y promedio. 
//c) matrícula y mayor promedio de la población femenina 
//d) matrícula y mayor promedio de la población masculina, promedios de los alumnos de 1er, 3er, 5to. Y 7mo. semestre.

import java.util.Scanner;
public class Porcentaje_y_promedio {
    public static void main(String  args[]){
        Scanner leer=new Scanner(System.in);


        String sexo;
        int personas,contsexm=0,contsexf=0,matricula,semestre=0,porcentajeh=1,porcentajem=1,sumasexo,marticulamayorM=0,marticulamayorF=0;
        int prom1er=0,prom3er=0,prom5to=0,prom7mo=0,acumprom=0,acumprof=0,acumsem=0,opcion,contsem=0;
        double promm=0,promf=0,promedio=0,promgeneral=0,mejorprohombres=0,mejorpromujeres=0;
        double promediofinal1=0,promediofinal3=0,promediofinal5=0,promediofinal7=0;
        
        
        System.out.println("Dime cuantas personas son");
        personas=leer.nextInt();

    for(int n = 1 ; n <= personas ;n = n+1){
        System.out.println("Ingresa el sex de la persona");
        sexo=leer.next();
        
        if(sexo.equalsIgnoreCase("Masculino")){
            contsexm=contsexm + 1;
            System.out.println("Ingresa la matricula de la persona");
            matricula=leer.nextInt();
            System.out.println("Ingresa el semestre de la persona");
            semestre=leer.nextInt();
            acumsem+=semestre;
            System.out.println("Ingresa el promedio de la persona");
            promedio=leer.nextDouble();
            acumprom+=promedio;
            if(promedio > mejorprohombres){
                mejorprohombres = promedio;
                marticulamayorM = matricula;
            }
            if(semestre == 1){
                prom1er++;
                promediofinal1= acumprom/(double)prom1er;
            }
            if(semestre == 3){
                prom3er++;
                promediofinal3= acumprom/(double)prom3er;
            }
            if(semestre == 5){
                prom5to++;
                promediofinal5= acumprom/(double)prom5to;
            }
            if(semestre == 7){
                prom7mo++;
                promediofinal7= acumprom/(double)prom7mo;
                
            }
            
            
        }

        else if (sexo.equalsIgnoreCase("Femenino")){
            contsexf=contsexf + 1;
            System.out.println("Ingresa la matricula de la persona");
            matricula=leer.nextInt();
            System.out.println("Ingresa el semestre de la persona");
            semestre=leer.nextInt();
            contsem++;
            acumsem+=semestre;
            System.out.println("Ingresa el promedio de la persona");
            promedio=leer.nextDouble();
            acumprof+=promedio;
            if(promedio > mejorpromujeres){
                mejorpromujeres = promedio;
                marticulamayorF=matricula;
            }
            if(semestre == 1){
                prom1er++;
                promediofinal1= acumprof/(double)prom1er;
            }
            if(semestre == 3){
                prom3er++;
                promediofinal3= acumprof/(double)prom3er;
            }
            if(semestre == 5){
                prom5to++;
                promediofinal5= acumprof/(double)prom5to;
            }
            if(semestre == 7){
                prom7mo++;
                promediofinal7= acumprof/(double)prom7mo;
                
            }
            }

            
      
        }
       
        
        System.out.println("Son de 1: " +  prom1er);
        System.out.println("Son de 3: " + prom3er);
        System.out.println("Son de 5: " + prom5to);
        System.out.println("Son de 7: " + prom7mo);
    
        
        do{
        System.out.println("-----------------------------------------------------------------");
        System.out.println("Elige una opcion correspondiente a lo que quieres consultar");
        System.out.println("[1] Porcentaje y promedio de la poblacion femenina");
        System.out.println("[2] Porcentaje y promedio de la poblacion masculina");
        System.out.println("[3] Promedio de la poblacion en general");
        System.out.println("[4] Matrícula y mayor promedio de la población femenina");
        System.out.println("[5] Matrícula y mayor promedio de la población masculina");
        System.out.println("[6] Promedios de los alumnos de 1er, 3er, 5to. Y 7mo. semestre");
        System.out.println("[7] Salir");
        System.out.println("-----------------------------------------------------------------");
        opcion=leer.nextInt();
        switch (opcion) {
            case 1:
            porcentajem = (contsexf*100)/personas;
            promf = (double)acumprof / contsexf;//Suma los promedio de las mujeres y saca su prodeo final
            System.out.println("[F] porcentaje de las mujeres %" + porcentajem);
            System.out.println("[F] promedio de las mujeres = " + promf);
                break;
            case 2:
            porcentajeh = (contsexm*100)/personas;
            promm =  (double)acumprom / contsexm;//Suma los promedio de los hombres y saca su prodeo final
            System.out.println("[M] porcentaje de los hombres %" + porcentajeh);
            System.out.println("[M] promedio de los hombres = " + promm); 
                break;
            case 3:
            sumasexo=acumprof + acumprom;
            promgeneral = (double)sumasexo/personas;//Promedio general de las calificaiones
            System.out.println("[PROM-GEN] Promedio general de población de la universidad = " + promgeneral);
                break;
            case 4:
            System.out.println("[PROM_MAYOR_FEMENINO] El alumno " + marticulamayorF + "  tiene promedio de: " +  mejorpromujeres + " y fue el mejor promedio de las mujeres");
                break;
            case 5:
            System.out.println("[PROM_MAYOR_MASCULINO] El alumno " + marticulamayorM + "  tiene promedio de: " +  mejorprohombres + " y fue el mejor promedio de los hombres");
                break;
            case 6:
            System.out.println("[PROMEDIO DE SEMESTRE 1] " + promediofinal1);
            System.out.println("[PROMEDIO DE SEMESTRE 3] " + promediofinal3);
            System.out.println("[PROMEDIO DE SEMESTRE 5] " + promediofinal5);
            System.out.println("[PROMEDIO DE SEMESTRE 7 MO] " + promediofinal7);
                break;
        
        
        }    
        }
        while(opcion != 7);
        System.out.println("Saliste del programa bye...");

    }
}