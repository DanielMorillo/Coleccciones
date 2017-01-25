package ejercicios;

import java.util.Arrays;

public class TestColecciones1 {
	public static void main(String[] args){
		double[] datos = {1,2,3,4,5,6,7,8,9,10,11,12};
		Colecciones1 c1 = new Colecciones1(datos);
		Arrays.fill(datos, 0);
		System.out.println(c1);
		c1.getdatos()[c1.getDatos().length - 1 ] = 5;
		System.out.println("Arrays con el valor 5 en el ultimo" +
		 "elemento " +c1);
		//añadir la secuencia
		for (int i = 0; i < c1.getDatos().length - 1; i++){
			c1.getDatos()[i] = 3 * (i+1);
		}
		System.out.println(c1);
		//sumamos los valores del array
		double suma = 0;
		for (double d : c1.getdatos()){
			suma += d;
		}
		System.out.printf("La suma de los valores del array vale %.2f%n", suma);
		
		
	}
}
