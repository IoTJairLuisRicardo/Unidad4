package tarea3;

public class ComisionVenta4_19 {
	
	private int sueldo;
	private int articulos, sueldoTotal;
	double ventasBrutas;
	public ComisionVenta4_19(int sueldo, int articulos, double ventasBrutas)
	{
		this.sueldo=sueldo;
		this.articulos=articulos;
		this.ventasBrutas=ventasBrutas;
		
	}
	public void establecer(int sueldo, int articulos, double ventasBrutas )
	{
		this.sueldo=sueldo;
		this.articulos=articulos;
		this.ventasBrutas=ventasBrutas;
	}
	public int obtenerSueldo()
	{
		
		return sueldo;
	}
	public int obtenerArticulos()
	{
		return articulos;
	}
	public double obtenerVentasBrutas()
	{
		return ventasBrutas;
	}
	public double obtenerSueldoTotal()
	{
		ventasBrutas=sueldo+(ventasBrutas*.09);
		return ventasBrutas;
	}

}
