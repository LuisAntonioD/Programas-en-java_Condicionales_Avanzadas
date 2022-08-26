//27. Crea una aplicación que dibuje una escalera de asteriscos. Nosotros le
//pasamos la altura de la escalera por teclado. Este es un ejemplo si insertaras un 5
//de altura:
//*
//**
//***
//****
//*****

import java.util.Scanner;
public class Escalera_de_asteriscos {
public static void main(String[] args) {
Scanner leer = new Scanner(System.in);

        int tamaño,i=1;

        System.out.println("¿De que altura quieres tu escalera?");
        tamaño = leer.nextInt();

        while(i<=tamaño){  
            for(int p=1;p<=i;p++){
                System.out.print("*");
            }
            i++;
            System.out.println();
        }
    }
}
