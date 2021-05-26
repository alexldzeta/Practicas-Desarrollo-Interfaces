package PRACTICA2_3;

import java.util.List;

public interface DAO<T> {
	
	List<T> listarTodos();
	
	T get(int codigo);
	
	void guardar(T t);
	void borrar(int codigo);

}
