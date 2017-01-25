package ejercicios;

public class Producto {
	private int identificador;
	private String nombreProducto;
	private double precioProducto;
	public Producto(int identificador, String nombreProducto, double precioProducto) {
		super();
		this.identificador = identificador;
		this.nombreProducto = nombreProducto;
		this.precioProducto = precioProducto;
	}
	public int getIdentificador() {
		return identificador;
	}
	public String getNombreProducto() {
		return nombreProducto;
	}
	public double getPrecioProducto() {
		return precioProducto;
	}
	@Override
	public String toString() {
		return "Producto [identificador=" + identificador + ", nombreProducto=" + nombreProducto + ", precioProducto="
				+ precioProducto + "]";
	}
	/**creamos un metodo main para probar la clase
	public static void main(String[] args){
		Producto p = new Producto(1, "producto ejemplo", 100.23);
		System.out.println(p);
	}*/
}
