
import java.util.ArrayList;
import java.util.List;
public class Listas1 {
	public static void main(String[] args){
		//TODO auto-generated method stub
	//creamos la lista vacia 
	List<String> listaCadenas = new ArrayList<String>();
	System.out.printf("Tamaño de la lista %d\n", listaCadenas.size());
	listaCadenas.add("Joaquin");
	listaCadenas.add("Luis");
	listaCadenas.add("Wences lao");
	
	System.out.printf("Tamaño de la lista %d\n", listaCadenas.size());
	System.out.printf("Primer elemento de la lista %s\n", listaCadenas.get(0));
	System.out.printf("Ultimo elemento de la lista %s\n", listaCadenas.get(listaCadenas.size()-1));
	System.out.printf("%s\n", listaCadenas);
	
	listaCadenas.add("Rodrigo");
	System.out.printf("%s\n", listaCadenas);
	
	listaCadenas.remove("0");
	System.out.printf("%s\n", listaCadenas);
	
	listaCadenas.remove("Luis");
	System.out.printf("%s\n", listaCadenas);
	
	//recorremos la lista
	for (String cadena : listaCadenas){
		System.out.println(cadena);
	}
}
}
