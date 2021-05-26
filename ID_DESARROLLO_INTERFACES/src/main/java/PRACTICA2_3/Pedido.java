package PRACTICA2_3;

import java.util.Date;

public class Pedido {

	public static class PedidoBuilder {

		int codigo_pedido, codigo_cliente;
		Date fecha_pedido, fecha_entrega;

		public PedidoBuilder(int cod_pedido) {
			this.codigo_pedido = cod_pedido;
		}

		public PedidoBuilder setCod_cliente(int cod_cliente) {
			this.codigo_cliente = cod_cliente;
			return this;
		}

		public PedidoBuilder setFecha_creacion(Date fecha_creacion) {
			this.fecha_pedido = fecha_creacion;
			return this;
		}

		public PedidoBuilder setFecha_entrega(Date fecha_entrega) {
			this.fecha_entrega = fecha_entrega;
			return this;
		}

		public Pedido build() {
			
			Pedido pedido = new Pedido();

			pedido.codigo_pedido = this.codigo_pedido;
			pedido.codigo_cliente = this.codigo_cliente;
			pedido.fecha_pedido = this.fecha_pedido;
			pedido.fecha_entrega = this.fecha_entrega;

			return pedido;
		}
	}

	int codigo_pedido, codigo_cliente;
	Date fecha_pedido, fecha_entrega;

	public int getCod_pedido() {
		return codigo_pedido;
	}

	public void setCod_pedido(int cod_pedido) {
		this.codigo_pedido = cod_pedido;
	}

	public int getCod_cliente() {
		return codigo_cliente;
	}

	public void setCod_cliente(int cod_cliente) {
		this.codigo_cliente = cod_cliente;
	}

	public Date getFecha_creacion() {
		return fecha_pedido;
	}

	public void setFecha_creacion(Date fecha_creacion) {
		this.fecha_pedido = fecha_creacion;
	}

	public Date getFecha_entrega() {
		return fecha_entrega;
	}

	public void setFecha_entrega(Date fecha_entrega) {
		this.fecha_entrega = fecha_entrega;
	}

	public String toString() {

		return "Los datos del pedido son: C�DIGO_PEDIDO: " + codigo_pedido + " / FECHA PEDIDO: " + fecha_pedido
				+ " / FECHA ENTREGA: " + fecha_entrega + " / C�DIGO CLIENTE: " + codigo_cliente;

	}

}
