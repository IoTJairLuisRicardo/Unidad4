package tarea3;

public class PruebaComisionVentas4_19 {

	public static void main(String[] args) 
	{
	
		ComisionVenta4_19 vendedor1= new ComisionVenta4_19(200, 1, 239.99);
		ComisionVenta4_19 vendedor2= new ComisionVenta4_19(200, 2, 129.75);
		ComisionVenta4_19 vendedor3= new ComisionVenta4_19(200, 3, 99.95);
		ComisionVenta4_19 vendedor4= new ComisionVenta4_19(200, 4, 350.89);	
		
		System.out.println("Articulo             Valor                   Sueldo total ya con el .9%\n");
		System.out.println(vendedor1.obtenerArticulos()+"                    "+vendedor1.obtenerVentasBrutas()+"                   "+vendedor1.obtenerSueldoTotal()+"\n"+
				+
				           vendedor2.obtenerArticulos()+"                    "+vendedor2.obtenerVentasBrutas()+"                   "+vendedor2.obtenerSueldoTotal()+"\n"+
				           vendedor3.obtenerArticulos()+"                    "+vendedor3.obtenerVentasBrutas()+"                    "+vendedor3.obtenerSueldoTotal()+"\n"+
				           vendedor4.obtenerArticulos()+"                    "+vendedor4.obtenerVentasBrutas()+"                   "+vendedor4.obtenerSueldoTotal()+"\n");
		
	}

}
