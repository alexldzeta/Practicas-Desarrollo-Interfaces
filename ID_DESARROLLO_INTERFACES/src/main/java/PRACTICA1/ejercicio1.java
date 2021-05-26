package PRACTICA1;

import java.util.*;

import PRACTICA1.Factura;
import PRACTICA1.Producto;
import PRACTICA1.Producto.Impuesto;

public class ejercicio1 {
	
	static Producto producto;
	static Factura factura;

	public static void main(String[] args) {
		
		List <Producto> productos = new ArrayList<>();
		
		producto = new Producto(0.75, "Leche", null);
		productos.add(producto);
		
		producto = new Producto(0.50, "Pan", null);
		productos.add(producto);
		
		producto = new Producto(8.99, "Salmón", null);
		productos.add(producto);

		producto = new Producto(2.95, "Aguacates", null);
		productos.add(producto);
		
		producto = new Producto(1.20, "Friegasuelos", null);
		productos.add(producto);
		
		producto = new Producto(0.56, "Cerveza", null);
		productos.add(producto);

		producto = new Producto(1.45, "Sandía", null);
		productos.add(producto);
		
		factura = new Factura(1, productos, null);
		factura.consola();
		
	}

}
