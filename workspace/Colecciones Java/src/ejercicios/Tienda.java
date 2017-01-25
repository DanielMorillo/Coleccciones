package ejercicios;
import java.util.List;
import java.util.ArrayList;
public class Tienda {
	private List<Producto> listaProductos;
	//constructor genera lista vacia

	public Tienda(){
		this.listaProductos = new ArrayList<Producto>();
	}
	public boolean insertarProducto(Producto p){
		return listaProductos.add(p);
	}
	public boolean eliminarProducto(Producto p){
		return listaProductos.remove(p);
	}
	public List<Producto> getListaProductos(){
		return listaProductos;
	}
	public Producto obtenerProductoMasCaro(){
		Producto productoMasCaro = listaProductos.get(0);
		for (Producto producto : listaProductos) {
		if (producto.getPrecioProducto() > productoMasCaro.getPrecioProducto())
			productoMasCaro = producto;
		}
		
		return productoMasCaro;
	}
	public Producto obtenerProductoMasBarato(){
		Producto productoMasBarato = listaProductos.get(0);
		for (Producto producto : listaProductos) {
		if (producto.getPrecioProducto() < productoMasBarato.getPrecioProducto())
			productoMasBarato = producto;
		}
		
		return productoMasBarato;
	}
}
