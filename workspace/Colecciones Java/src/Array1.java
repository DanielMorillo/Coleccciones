public class Array1 {

	public static void main(String[] args){
		//creo la colecci�n
		int[] coleccionEnteros = new int[3];
		//a�adimos elementos
		coleccionEnteros[0] = 1;
		coleccionEnteros[1] = 2;
		coleccionEnteros[2] = 3;
		//recorremos la colecci�n
		for(int i = 0; i < coleccionEnteros.length; i++) {
			System.out.println(coleccionEnteros[i]);
		}
		//otra forma de recorrer la colecci�n
		for (int i : coleccionEnteros) {
			System.out.println(i);
		}
		//coleccion de cadenas
		String[] coleccionCadenas = new String[4];
		coleccionCadenas[0] = "hola";
		coleccionCadenas[1] = " ";
		coleccionCadenas[2] = "mundo";
		coleccionCadenas[3] = "\n";
		//recorremos el array
		for( String string : coleccionCadenas){
			System.out.print(string);
		}
		//crear una colecci�n de doubles inicializada 
		double[] coleccionDouble = {1.2, 1.5, -23.65, 0.005, 7};
		for(double d : coleccionDouble){
			System.out.printf("%7.3f", d);
		}
	}
}
