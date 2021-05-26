package PRACTICA2_3;

public class Cliente {

	public static class ClienteBuilder {

		int codigo_cliente;
		TipoDeDocumento tipoDOC;
		String nombre, apellido, telefono, email, contrase�a;
		String documentacion;

		public ClienteBuilder(int cod_cliente) {
			this.codigo_cliente = cod_cliente;
		}

		public ClienteBuilder setTipoDeDocumento(TipoDeDocumento tipoDOC) {

			this.tipoDOC = tipoDOC;
			return this;

		}

		public ClienteBuilder setDocumentacion(String documentacion) {

			this.documentacion = documentacion;
			return this;

		}

		public ClienteBuilder setNombre(String nombre) {
			this.nombre = nombre;
			return this;
		}

		public ClienteBuilder setApellido(String apellido) {
			this.apellido = apellido;
			return this;
		}

		public ClienteBuilder setTelefono(String telefono) {
			this.telefono = telefono;
			return this;
		}

		public ClienteBuilder setEmail(String email) {
			this.email = email;
			return this;
		}

		public ClienteBuilder setContrase�a(String contrase�a) {

			this.contrase�a = contrase�a;
			return this;

		}

		public Cliente build() {

			Cliente cliente = new Cliente();

			cliente.cod_cliente = this.codigo_cliente;
			cliente.nombre = this.nombre;
			cliente.apellido = this.apellido;
			cliente.telefono = this.telefono;
			cliente.email = this.email;
			cliente.documentacion = this.documentacion;
			cliente.contrase�a = this.contrase�a;

			return cliente;
		}
	}

	int cod_cliente;
	String nombre, apellido, telefono, email, documentacion, contrase�a;

	public int getCod_cliente() {
		return cod_cliente;
	}

	public void setCod_cliente(int cod_cliente) {
		this.cod_cliente = cod_cliente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDocumentacion() {
		return documentacion;
	}

	public void setDocumentacion(String documentacion) {
		this.documentacion = documentacion;
	}

	public String getContrase�a() {
		return contrase�a;
	}

	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}

	public String toString() {
		return "Los datos de cliente son: / C�DIGO CLIENTE: " + cod_cliente + " / NOMBRE: " + nombre + " / APELLIDO: "
				+ apellido + " / TEL�FONO: " + telefono + " / E-MAIL: " + email;
	}
}
