package PRACTICA1;

import java.util.*;

import PRACTICA1.Factura;
import PRACTICA1.Producto;
import PRACTICA1.UtilidadesFactura;
import PRACTICA1.Producto.Impuesto;

public class ejercicio2 {

	static Producto producto;
	static Factura factura;
	static Impuesto impuesto;

	public static void main(String[] args) {

		List<Producto> productos = new ArrayList<>();

		producto = new Producto(0.75, "Leche", impuesto = Impuesto.REDUCIDO);
		productos.add(producto);

		producto = new Producto(0.50, "Pan", impuesto = Impuesto.SUPERREDUCIDO);
		productos.add(producto);

		producto = new Producto(8.99, "Salmon", impuesto = Impuesto.REDUCIDO);
		productos.add(producto);

		producto = new Producto(2.95, "Aguacates", impuesto = Impuesto.NORMAL);
		productos.add(producto);

		producto = new Producto(1.20, "Friegasuelos", impuesto = Impuesto.NORMAL);
		productos.add(producto);

		producto = new Producto(0.56, "Cerveza", impuesto = Impuesto.NORMAL);
		productos.add(producto);

		producto = new Producto(1.45, "Sandia", impuesto = Impuesto.SUPERREDUCIDO);
		productos.add(producto);

		factura = new Factura(0, productos, new Date());
		factura.consola();

		System.out.println("\nImporte sin IVA: " + UtilidadesFactura.calcularImporteFactura(factura));

		System.out.println("Calcular Factura sin IVA : " + UtilidadesFactura.calcularIVAFactura(factura));

		System.out.println("Calcular FActura con IVA : " + UtilidadesFactura.calcularIVAFacturaConIVA(factura));

	}

}
