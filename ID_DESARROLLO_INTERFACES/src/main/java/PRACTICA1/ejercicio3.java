package PRACTICA1;

import java.util.*;

import PRACTICA1.Factura;
import PRACTICA1.Producto;
import PRACTICA1.Producto.Impuesto;
import PRACTICA1.*;

public class ejercicio3 {

	static Producto producto;
	static Factura factura;
	static Impuesto impuesto;
	static Date fechaRealizacion = new Date();

	public static void main(String[] args) {

		List<Producto> productos = new ArrayList<>();
		List<Producto> productosBorrador;
		List<Factura> facturas = new ArrayList<>();

		int random;

		producto = new Producto(0.75, "Leche", Impuesto.REDUCIDO);
		productos.add(producto);

		producto = new Producto(0.50, "Pan", Impuesto.SUPERREDUCIDO);
		productos.add(producto);

		producto = new Producto(8.99, "Salmon", Impuesto.REDUCIDO);
		productos.add(producto);

		producto = new Producto(2.95, "Aguacates", Impuesto.NORMAL);
		productos.add(producto);

		producto = new Producto(1.20, "Friegasuelos", Impuesto.NORMAL);
		productos.add(producto);

		producto = new Producto(0.56, "Cerveza", Impuesto.NORMAL);
		productos.add(producto);

		producto = new Producto(1.45, "Sandia", Impuesto.SUPERREDUCIDO);
		productos.add(producto);

		for (int i = 0; i < 5; i++) {
			
			int random2 = ((int) (Math.random() * 7));

			productosBorrador = new ArrayList<>();

			for (int x = random2; x < productos.size(); x += random2 + 1) {
				
				productosBorrador.add(productos.get(x));
			}
			
			factura = new Factura(i + 1, productosBorrador, fechaRealizacion);
			facturas.add(factura);
			
		}
		
		for (Factura f : facturas) {
			
			f.consola();
		}
	}

}
