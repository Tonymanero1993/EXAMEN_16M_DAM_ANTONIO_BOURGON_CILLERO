package Numero_Primo;

import java.util.Scanner;

public class Num_primo {

	public static void main(String[] args) {
		
		System.out.println("Buenos días Ceinmark, soy Marta Gómez");
		
		Scanner ent = new Scanner(System.in);		
		int indice = 1;
		int r;
		int primo = 0;
		
		System.out.println("Introduce un numero para averiguar si es primo o no: ");
		int num = ent.nextInt();
        
        System.out.println(num + "/" + num + " = " + num/num);
        
        while ((num-indice)>1) {
            if (num%(num-indice)==0) {
                r=num/(num-indice);
                primo=1;
                System.out.println(num + "/" + (num-indice) + " = " + r);
            }
            indice++;
        }

        System.out.println(num + "/1 = " + num);
        
        if (primo==0) System.out.println("El número es primo"); else System.out.println("El numero no es primo");
        System.out.println("\n==========================");
    }

}
