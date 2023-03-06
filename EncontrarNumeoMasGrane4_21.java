package tarea3;

import java.util.Scanner;

public class EncontrarNumeoMasGrane4_21 {

	public static void main(String[] args) 
	{
int cont=0,num,mayor=0;
		
		Scanner entrada=new Scanner(System.in);
		System.out.println("INGRESA 10 NUMEROS Y TE DIREMOS EL MAYOR\n");

       while( cont<10 )
       {
    	 
    	   System.out.printf("Ingresa el numero: ",cont++);
    	   num=entrada.nextInt(); 
    	   
    	   if(num>mayor)
    	   {
    		   mayor=num;
    	   }
       }
       System.out.printf("El numero mayor es "+mayor);


	}

}
