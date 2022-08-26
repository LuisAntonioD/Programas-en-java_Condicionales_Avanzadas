//17. Dado el peso, la altura y el sexo de N personas que pertenecen a un estado de
//la república, obtenga el promedio del peso y de la altura en función del sexo
//(femenino y masculino).

import java.util.Scanner;
public class promedio_peso_h_y_m {
    public static void main(String  args[]){
        Scanner leer=new Scanner(System.in);


        String sexo;
        int personas,contsexm=0,contsexf=0;
        double promalt=0,prompes=0,peso,altura,contp=0,conta=0;
        double contpm=0,contam=0,prompesm=0,promaltm=0;
        
        
        System.out.println("Dime cuantos personas son");
        personas=leer.nextInt();

    for(int n = 1 ; n <= personas ;n = n+1){
        System.out.println("Ingresa el sex de la persona");
        sexo=leer.next();
        
        if(sexo.equalsIgnoreCase("Masculino")){
            contsexm=contsexm + 1;
            System.out.println("Ingresa el peso de la persona");
            peso=leer.nextDouble();
            contpm = contpm + peso;
            System.out.println("Ingresa la altura de la persona");
            altura=leer.nextDouble();
            contam = contam + altura;
            prompesm = contpm / contsexm;
            promaltm = contam / contsexm;

        } 
        else if (sexo.equalsIgnoreCase("Femenino")){
            contsexf=contsexf + 1;
            System.out.println("Ingresa el peso de la persona");
            peso=leer.nextDouble();
            contp = contp + peso;
            System.out.println("Ingresa la altura de la persona");
            altura=leer.nextDouble();
            conta = conta + altura;
            prompes = contp / contsexf;
            promalt = conta / contsexf;

        }
        else{
            System.out.println("Erorr ingresaste mal la opción de sexo");
        }   
        }
        System.out.println("[M] El promedio del peso de los hombres sera de " + prompesm); 
        System.out.println("[M] El promedio de la altura de los hombres sera de " + promaltm);
        System.out.println("[F] El promedio del peso de las mujeres sera de " + prompes); 
        System.out.println("[F] El promedio de la altura de las mujeres sera de " + promalt);
    }
}