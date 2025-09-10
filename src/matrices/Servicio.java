package matrices;

public class Servicio extends Usuario{
	
	private int id;
	
	private String descripcion;
	private double capacidad;
	private double precio = 25;
	private double precioBase = precio;
	
	private double tarifaMas = 0.25;
	
	
	
	public Servicio(int i, String nombre, String string, int j, int k) {
		super(nombre);
	}
	
	
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public double getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(double capacidad) {
		
		
	
		
		if(capacidad > 3 & capacidad < 10) {
			precio = 56;
		} else if(capacidad == 0) {
			System.out.println("No hay personas en la habitacion entonces no hay precio");
		} else if(capacidad >= 10) {
			precio = masTarifaMas() + precio;
		}else {
			precio = precioBase;
		}
		
		this.capacidad = capacidad;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		setCapacidad(capacidad);
		this.precio = precio;
	}
	
	double masTarifaMas() {
		double verdaderaTarifa = tarifaMas * precioBase;
		return verdaderaTarifa;
	}
	
	
}
