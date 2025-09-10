package matrices;

public class Reservas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Servicio servicio = new Servicio(16, "juana", "habitacion 32", 3, 25);
			
			servicio.setCapacidad(22);
			
			System.out.println(servicio.getPrecio());
			System.out.println(servicio.getNombre());
			
			
	}

}
