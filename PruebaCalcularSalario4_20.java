package tarea3;

public class PruebaCalcularSalario4_20 {

	public static void main(String[] args) 
	{

         CalcularSalario4_20 empleado1=new CalcularSalario4_20("jair",41);
         CalcularSalario4_20 empleado2=new CalcularSalario4_20("luis", 41);
         CalcularSalario4_20 empleado3=new CalcularSalario4_20("ricardo", 39);
         
         System.out.println("Nombre del empleado         Horas trabajadas         Pago total(Si excedes de 40 sera mas 50%)\n");
         System.out.println(empleado1.obtenerNombre()+"                         "+empleado1.HT()+"                             "+empleado1.obtenerSueldoTotal()+"\n"+
        		            empleado2.obtenerNombre()+"                         "+empleado2.HT()+"                             "+empleado2.obtenerSueldoTotal()+"\n"+
        		            empleado3.obtenerNombre()+"                      "+empleado3.HT()+"                             "+empleado3.obtenerSueldoTotal()+"\n");
	}

}
