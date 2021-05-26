package PRACTICA1;

import java.util.*;

public class Factura {

	private int numero;
	private List<Producto> productos;
	private Date fechaRealizacion;

	public Factura(int numero, List<Producto> productos, Date fechaRealizacion) {

		super();
		this.numero = numero;
		this.productos = productos;
		this.fechaRealizacion = fechaRealizacion;

	}

	public int getNumero() {

		return numero;

	}

	public void setNumero(int numero) {

		this.numero = numero;

	}

	public List<Producto> getProductos() {

		return productos;

	}

	public void setProductos(List<Producto> productos) {

		this.productos = productos;

	}

	public Date fechaRealizacion() {

		return fechaRealizacion;

	}

	public void setFechaRealizacion(Date fechaRealizacion) {

		this.fechaRealizacion = fechaRealizacion;

	}

	@Override
	public String toString() {

		return "Factura (numero: " + numero + ", productos: " + productos + ".)";

	}

	public void consola() {

		for (Producto p : productos) {

			p.pantalla();

		}

	}

}
