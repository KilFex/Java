package matrices;

public class Reservas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Servicio servicio = new Servicio(16, "juana", "habitacion 32", 3, 25);
			Servicio servicio2 = new Servicio(2, "juanito", "habitacion 24", 2, 39.6);
			Servicio servicio3 = new Servicio();
			
			servicio.setCapacidad(6);
			
			System.out.println(servicio.getPrecio());
			
			servicio3.setCapacidad(0);
			
			System.out.println(servicio3.getPrecio());
			
	}

}
