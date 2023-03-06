package tarea3;

import java.util.Scanner;

public class LimiteCreditos4_18 {

	public static void main(String[] args) 
	{

       int   NumCuenta=626584651,SaldoInicial=5000,TotalArticulos=0,CreditoCliente=0,LimiteCredito=5000;
       
        
       System.out.println("ESTADO DE CUENTA\n"
       		+     "Numero de cuenta:     "+NumCuenta+
	              "\nSaldo inicial:        "+SaldoInicial+
	              "\nTotal de articulos:   "+TotalArticulos+
	              "\nCredito del Cliente:  "+CreditoCliente+
	              "\nLimiteCredito:        "+LimiteCredito);
       
       while(CreditoCliente < 5001)
       {
       System.out.println("\nESTADO DE CUENTA ACTUALIZADO\nNumero de cliente:    "+NumCuenta+
    		              "\nSaldo Nuevo:          "+SaldoInicial+
    		              "\nTotal de articulos:   "+TotalArticulos+
    		              "\nCredito del Cliente:  "+CreditoCliente+
    		              "\nLimiteCredito:        "+LimiteCredito);
       
           Scanner entrada=new Scanner(System.in);
      
    	 
           System.out.println("Que precio cuesta el articuloque desea comprar:");
          int a=entrada.nextInt();
           
           SaldoInicial=SaldoInicial-a;
           CreditoCliente= CreditoCliente+a;
           TotalArticulos ++;
         
       }
     
       System.out.println("\n\nEXCEDIO EL CREDITO DE "+LimiteCredito);
      
	}

}
