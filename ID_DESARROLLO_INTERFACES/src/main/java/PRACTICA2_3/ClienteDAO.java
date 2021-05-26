package PRACTICA2_3;

import java.util.ArrayList;
import java.util.List;

public class ClienteDAO implements DAO<Cliente> {

	List<Cliente> clientes;

	public ClienteDAO() {

		clientes = new ArrayList<>();

		clientes.add(new Cliente.ClienteBuilder(1).setTipoDeDocumento(TipoDeDocumento.DNI).setDocumentacion("345678098M").setNombre("Alejandro").setApellido("López de Zubiría")
				.setEmail("emaildeprueba@gmail.com").setTelefono("664887700").setContraseña("Palo345").build());
		clientes.add(new Cliente.ClienteBuilder(2).setTipoDeDocumento(TipoDeDocumento.DNI).setDocumentacion("657890010Z").setNombre("Ismael").setApellido("ElHaddyouy")
				.setEmail("correoIsmael@gmail.com").setTelefono("665309988").setContraseña("Manzana123").build());

	}

	@Override
	public List<Cliente> listarTodos() { //Metodo para listar por pantalla todos los clientes del arraylist
		
		return clientes;
	}

	@Override
	public Cliente get(int codigo_cliente) { //Este metodo nos permite buscar un cliente por su codigo
	
		return clientes.stream().filter(c -> c.getCod_cliente() == codigo_cliente).findAny().orElse(null); //Gracias al .stream recorre el arraylist uno por uno
	}																									   // y comparamos con el predicado con el codigo introducido y si lo encuentra lo sacara.	

	@Override
	public void guardar(Cliente cliente) {

		if (clientes.stream().anyMatch(c -> c.getCod_cliente() == cliente.getCod_cliente())) { //Si se repite el codigo del cliente

			System.out.println("Codigo de cliente repetido, no se pudo crear el cliente"); //Sacara un mensaje como que esta repetido

		} else if (clientes.stream().anyMatch(c -> c.getNombre().equals(cliente.getNombre()) //Si se repite el nombre el apellido o el telefono o el correo tambien saltara un mensaje de error
				&& c.getApellido().equals(cliente.getApellido()) && c.getTelefono().equals(cliente.getTelefono()) && c.getEmail().equals(cliente.getEmail()))) {

			System.out.println("Los datos coinciden con los de otro cliente, no se pudo crear el cliente");

		} else { //Y si no se repite ningun campo anterior pues se creara el nuevo cliente

			clientes.add(cliente);

		}

	}

	@Override
	public void borrar(int codigo_cliente) {
		
		clientes.remove(clientes.stream().filter(c -> c.getCod_cliente() == codigo_cliente).findAny().orElse(null)); //Si el codigo del cliente coincide con el introducido
																												     // Se borrara el cliente que haya guardado

	}

}
