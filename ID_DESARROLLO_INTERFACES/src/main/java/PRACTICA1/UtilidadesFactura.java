package PRACTICA1;

import PRACTICA1.Factura;
import PRACTICA1.Producto;

public class UtilidadesFactura {

	public static double calcularImporteFactura(Factura f) {
		double total = 0;

		for (Producto p : f.getProductos()) {
			total += p.getImporte();
		}
		return total;
	}

	public static double calcularIVAFactura(Factura f) {
		double total = 0;

		for (Producto p : f.getProductos()) {
			total = total + (p.getImporte() * (p.getTipoImpuesto().getValorImpuesto()));
		}
		return total;

	}

	public static double calcularIVAFacturaConIVA(Factura f) {
		double total = 0;

		for (Producto p : f.getProductos()) {
			total = total + (p.getImporte() * (p.getTipoImpuesto().getValorImpuesto() + 1));
		}
		return total;
	}
}
