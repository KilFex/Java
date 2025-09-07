package matrices;
import java.util.*;
import java.util.jar.Attributes.Name;

public class ejercicio_con_list {
	
    public static void main(String[] args) {
    	 List<Integer> number = new ArrayList<>();
    	 
    	 int sumador = 1;
    	 for(int i = 0; i < 10; i++) {
    		 number.add(sumador++);
    	 }
    	 
    	 number.removeIf(num -> num %2 == 0);
    	 System.out.println("numero: " + number);
    	 
    	 System.out.println("------------------------------------");
    	 
    	 
    	 List<String> name = new ArrayList<>();
    	 
    	 name.add("Luis");
    	 name.add("Mario");
    	 name.add("Jota");
    	 name.add("Ander");
    	 name.add("Yokito");
    	 name.add("Yokito");
    	 name.add("Ander");
    	 
    	 List<String> name2 = new ArrayList<>();
    	 
    	 Set<String> nameFinal = new LinkedHashSet<>(name);
    	 
    	 name2.addAll(nameFinal);
    	 
    	 System.out.println(name2);
    } 	
}


	
	
	
	