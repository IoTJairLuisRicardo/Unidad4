package tarea3;

import java.util.Scanner;

public class NumeroCifrado4_38 {

	public static void main(String[] args)
	{

	int num, num2;
      Scanner entrada=new Scanner(System.in);
      
      System.out.println("A CONTINUACION SE CIFRARA EL NUMERO QUE INGRESE\n\nIngrese el numero de 4 digitos enteros: ");
      num=entrada.nextInt();
      
      while(true)
      {
    	  if(num>999&&num<10000)
    	  {
    		  int cuatro=num%10;
    		  int tres=(num/10)%10;
    		  int dos=(num/100)%10;
    		  int uno=(num/1000)%10;
    		  
    		  cuatro+=7;
    		  tres+=7;
    		  dos+=7;
    		  uno+=7;
    		  
    		  cuatro%=10;
    		  tres%=10;
    		  dos%=10;
    		  uno%=10;
    		  
    		  System.out.println("El numero cifrado es: "+tres+""+cuatro+""+uno+""+dos); 
    		  
    		  System.out.println("\n\nA CONTINUACION SE DESIFRARA EL NUMERO QUE INGRESE\n\nIngrese el numero de 4 digitos enteros: ");
    	      num2=entrada.nextInt(); 
    	      if(num2>999&&num2<10000)
        	  {
    	    	  int cuatro2=num2%10;
        		  int tres2=(num2*10)%10;
        		  int dos2=(num2*100)%10;
        		  int uno2=(num2*1000)%10;
        		  
        		  
        		  
        		  cuatro2%=10;
        		  tres2%=10;
        		  dos2%=10;
        		  uno2%=10;
        		  
        		  cuatro2-=7;
        		  tres2-=7;
        		  dos2-=7;
        		  uno2-=7;
        		  
        		  System.out.println("El numero cifrado es: "+uno2+""+dos2+""+tres2+""+cuatro2); 
        	  }
    	      
    	      else
    	      {
    	    	  System.out.println("EL numero introducido es incorrecto intente otra ves"); 
        		  num=entrada.nextInt();
    	      }
    		  
    		  break;
  
    	  }
    	  else
    	  {
    		  System.out.println("EL numero introducido es incorrecto intente otra ves"); 
    		  num=entrada.nextInt();
    	  }
      }
      
		
	}

}
