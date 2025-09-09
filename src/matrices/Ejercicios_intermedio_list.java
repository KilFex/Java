package matrices;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Ejercicios_intermedio_list {
	
	public static void main(String[] args) {
		
		Random rand = new Random();
		
		List<Integer> aleatorio = new ArrayList<>();
		
		for(int i = 0; i < 10; i++) {
			aleatorio.add(rand.nextInt(100));
		}
		
		System.out.println(aleatorio);
		
		int max = aleatorio.get(0);
		int min = aleatorio.get(0);
		
		for(int i = 1; i < aleatorio.size(); i++) {
			
			if(aleatorio.get(i) > max) {
				max = aleatorio.get(i);
			}
			if(aleatorio.get(i) < min) {
				min = aleatorio.get(i);
				
			}
		}
		
		System.out.println("El numero maximo es: " + max);
		System.out.println("El numero minimo es: " + min);
		
		List<Integer> primos = new ArrayList<>();
		List<Integer> sonPrimos = new ArrayList<>();
	
		for(int i = 2; i <= 50; i++) {
			if(primo(i)) {
				primos.add(i);
			}
		}
		
		Set<Integer> agregar = new LinkedHashSet<>(primos);
		
		sonPrimos.addAll(agregar);
		System.out.println("Estos son los numeros primos: " + sonPrimos);
		
		
		
		List<String> nombresMenosde5 = new ArrayList<>();
		
		nombresMenosde5.add("thalia");
		nombresMenosde5.add("mario");
		nombresMenosde5.add("marecela");
		nombresMenosde5.add("juana");
		nombresMenosde5.add("marcoandre");
		
		nombresMenosde5.removeIf(n -> n.length() >= 8);
		System.out.println("estos son los nombrs: " + nombresMenosde5);
		
		
		
		
		
}
	
	public static boolean primo(int num) {
		if(num <= 1) {
			return false;
		}
		
		for(int i = 2; i * i <= num; i++) {
			if(num % i == 0) {
				return false;
			} 
		}		
		return true;	
	}
}



