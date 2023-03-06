package tarea3;

public class CalcularSalario4_20 {
	
	private String nombre;
	private int sueldoH=10;
	private int HT;
	double sueldoTotal;
	public CalcularSalario4_20(String nombre, int HT)
	{
		this.nombre=nombre;
		this.HT=HT;
		
	}
	public void establecer(String nombre,int sueldoH, int HT )
	{
		this.nombre=nombre;
		this.sueldoH=sueldoH;
		this.HT=HT;
	}
	public String obtenerNombre()
	{
		return nombre;
	}
	public int obtenerSueldo()
	{
		
		return sueldoH;
	}
	public int HT()
	{
		return HT;
	}
	
	public double obtenerSueldoTotal()
	{
		
		if(HT>40)
		{
			sueldoTotal=sueldoH*HT;
			sueldoTotal=sueldoTotal+(sueldoTotal*.5);
		}
		else
		{
			sueldoTotal=sueldoH*HT;
		}
		return sueldoTotal;
	}


}
