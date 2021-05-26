package PRACTICA2_3;

import java.util.*;

public class Main {

	private static ClienteDAO CDAO = new ClienteDAO(); //Instanciamos las clases DAO para poder utilizarlas mas adelante
	private static PedidoDAO PDAO = new PedidoDAO();
	final static Scanner teclado = new Scanner(System.in);
	static boolean salir = false;

	public static void main(String[] args) {

		while (!salir) {

			System.out.println("************* CREACIÓN DE CLIENTES PEDIDOS *************"); //Menu con el cual construiremos los metodos de la clase main
			System.out.println("1.- Ver todos los clientes");
			System.out.println("2.- Ver todos los pedidos");
			System.out.println("3.- Buscar un cliente");
			System.out.println("4.- Buscar un pedido");
			System.out.println("5.- Crear un nuevo cliente");
			System.out.println("6.- Crear un nuevo pedido");
			System.out.println("7.- Eliminar un cliente");
			System.out.println("8.- Eliminar un pedido");
			System.out.println("9.- Salir del programa");

			int numero = teclado.nextInt();

			switch (numero) {

			case 1:

				mostrarClientes();

				break;

			case 2:

				mostrarPedido();

				break;

			case 3:

				buscarCliente();

				break;

			case 4:

				buscarPedido();

				break;

			case 5:

				nuevoCliente();

				break;

			case 6:
				nuevoPedido();
				break;

			case 7:

				eliminarCliente();

				break;

			case 8:

				eliminarPedido();

				break;
				
			case 9:
				
				salir = true;
				System.out.println("Has salido del programa");

			default:
				break;

			}
		}
	}

	public static void mostrarClientes() { //Metodo para listar todos los clientes que tenemos en la clase CLIENTEDAO

		for (Cliente c : CDAO.listarTodos()) {	//Usamos un for each para recorrer el metodo listartodos() de CDAO

			System.out.println(c.toString());	//Y los mostramos todos con el metodo toString previamente creado en la clase CDAO

		}

	}

	public static void mostrarPedido() { // Hacemos exactamente lo mismo que en el metodo de los clientes pero con los pedidos

		for (Pedido p : PDAO.listarTodos()) {

			System.out.println(p.toString());

		}

	}

	public static void buscarCliente() { //Metodo para buscar un cliente por si codigo

		try { //hacemos un try catch para que en caso de que no haya un cliente con el codigo introducido nos saque un error por pantalla

			System.out.println("¿Cual es el codigo del cliente que quieres buscar?"); // preguntamos por el codigo
			Cliente cliente = CDAO.get(teclado.nextInt()); //con un nuevo cliente llamamos al metodo get e introducimos el codigo para que compare

			if (cliente != null) { //Si hay un cliente con ese codigo

				System.out.println(cliente.toString()); //lo mostramos por pantalla con el toString

			} else {

				System.out.println("El cliente no ha sido encontrado"); //Si no lo hay sacamos un mensaje como que no ha sido encontrado

			}

		} catch (Exception e) { // y si a la primera no encontraba el cliente pues saca un error por consola

			e.printStackTrace();

		}

	}

	public static void buscarPedido() { //Lo mismo que el de buscar cliente pero con el codigo del pedido

		System.out.println("¿Cual es el código del pedido que quieres buscar?");
		Pedido pedido = PDAO.get(teclado.nextInt());

		if (pedido != null) {

			System.out.println(pedido.toString());

		} else {

			System.out.println("El código del pedido no coincide con ninguno");

		}

	}

	public static void nuevoCliente() { //Metodo para crear un nuevo cliente

		try {

			System.out.println("¿Código del cliente?"); //Preguntamos por los distintos datos del cliente
			int codigo_cliente = teclado.nextInt();
			teclado.nextLine();
			
			System.out.println("¿Tipo de documentacion? --> DNI / NIE");
			String tipoDOC = teclado.nextLine();
			
			TipoDeDocumento TD;
			
			if (tipoDOC.equals("DNI")) {
				
				TD = TipoDeDocumento.DNI;
				
			} else {
				
				TD = TipoDeDocumento.NIE;
			}
			
			teclado.nextLine();

			System.out.println("Numero de documento:");
			String documentacion = teclado.nextLine();
			
			Test.validarDocumento(TD, documentacion);
			
			System.out.println("Nombre del cliente:");
			String nombre = teclado.nextLine();

			System.out.println("Apellido del cliente:");
			String apellido = teclado.nextLine();

			System.out.println("Teléfono del cliente:");
			String telefono = teclado.nextLine();

			System.out.println("E-mail del cliente:");
			String email = teclado.nextLine();
			
			System.out.println("Contraseña:");
			String contraseña = teclado.nextLine();

			CDAO.guardar(new Cliente.ClienteBuilder(codigo_cliente).setTipoDeDocumento(TD).setDocumentacion(documentacion).setNombre(nombre).setApellido(apellido) //y con el metodo guardar de la clase CDAO, vamos seteando		
			.setTelefono(telefono).setEmail(email).setContraseña(contraseña).build()); //las variables que antes hemos pedido por teclado

		} catch (Exception e) {

			e.printStackTrace();

		}

	}

	public static void nuevoPedido() { //lo mismo que con el metodo del cliente

		try {

			System.out.println("¿Cual es el codigo del pedido?");
			int codigo_pedido = teclado.nextInt();

			System.out.println("¿Cual es el codigo del cliente?");
			int codigo_cliente = teclado.nextInt();
			teclado.nextLine();

			System.out.println("Introduzca la fecha de creacion del pedido de la siguiente forma -> mm/dd/yyyy");
			String fecha_creacion = teclado.nextLine();

			System.out.println("Introduzca la fecha de cracion del pedido de la siguiente forma -> mm/dd/yyyy");
			String fecha_entrega = teclado.nextLine();

			PDAO.guardar(new Pedido.PedidoBuilder(codigo_pedido).setCod_cliente(codigo_cliente)
					.setFecha_creacion(new Date(fecha_creacion)).setFecha_entrega(new Date(fecha_entrega)).build());

		} catch (Exception e) {

			e.printStackTrace();

		}

	}

	public static void eliminarCliente() { //Metodo para eliminar un cliente

		System.out.println("Introduce el código del cliente que quieras eliminar");
		int codigo_cliente = teclado.nextInt(); //introducimos el codigo del cliente
		CDAO.borrar(codigo_cliente); //con el metodo de borrar de la clase CDAO borramos el cliente por el codigo

	}

	public static void eliminarPedido() { //Lo mismo para los pedidos

		System.out.println("Introduce el código del pedido que quieras eliminar");
		int codigo_pedido = teclado.nextInt();
		PDAO.borrar(codigo_pedido);

	}
	
}
