package PRACTICA2_3;

import java.util.*;

import PRACTICA2_3.Pedido;


public class PedidoDAO implements DAO<Pedido> {

	List<Pedido> pedidos;

	public PedidoDAO() {
	
	
        pedidos = new ArrayList<>();
        
        pedidos.add(new Pedido.PedidoBuilder(1).setCod_cliente(5544).setFecha_creacion(new Date("05/28/2021")).setFecha_entrega(new Date("05/29/2021")).build());
        pedidos.add(new Pedido.PedidoBuilder(2).setCod_cliente(3366).setFecha_creacion(new Date("05/28/2021")).setFecha_entrega(new Date("05/29/2021")).build());
        
	}

	@Override
	public List<Pedido> listarTodos() {
		// TODO Auto-generated method stub
		return pedidos;
	}

	@Override
	public Pedido get(int codigo_pedido) {
		
		return pedidos.stream().filter(p -> p.getCod_pedido() == codigo_pedido).findAny().orElse(null);
		
	}

	@Override
	public void guardar(Pedido pedido) {

		if (pedidos.stream().anyMatch(p -> p.getCod_pedido() == pedido.getCod_pedido())) {
			
			System.out.println("No se pudo crear el pedido, codigo repetido");
			
		}
		
		if (pedido.getFecha_creacion().getDay() != new Date().getDay()
                || pedido.getFecha_creacion().getMonth() != new Date().getMonth()
                || pedido.getFecha_creacion().getYear() != new Date().getYear()) {
					
					System.out.println("La fecha de creacion no es la fecha actual, no se ha creado el pedido");
					
				}
		
		if ((pedido.getFecha_creacion().getDay() + 3) > pedido.getFecha_entrega().getDay()) {
			
			System.out.println("No se ha podido crear el pedido, la fecha no coincide con los criterios necesarios");
			
		}
		
		pedidos.add(pedido);
		
	}

	@Override
	public void borrar(int codigo_pedido) {

		pedidos.remove(pedidos.stream().filter(p -> p.getCod_pedido() == codigo_pedido).findAny().orElse(null));

	}

}
