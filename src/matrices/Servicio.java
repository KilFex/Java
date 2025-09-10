package matrices;

public class Servicio {
	
	private int id;
	private String nombre;
	private String descripcion;
	private int capacidad;
	private double precio;
	
	public Servicio() {
		
	}
	
	
	public Servicio(int id, String nombre, String descripcion, int capacidad, double precio) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.capacidad = capacidad;
		this.precio = precio;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public int getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(int capacidad) {
		
		if(capacidad > 3) {
			precio = 56;
		} else if(capacidad == 0) {
			System.out.println("No hay personas en la habitacion entonces no hay precio");
		} else {
			precio = 25;
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
	
}
