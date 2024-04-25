package tienda;

import java.util.List;



public class Inventario {
	
	
	List<Producto> inventario ;

	public Inventario(List<Producto> inventario) {
		super();
		this.inventario = inventario;
	}

	public List<Producto> getInventario() {
		return inventario;
	}

	public void setInventario(List<Producto> inventario) {
		this.inventario = inventario;
	}

	@Override
	public String toString() {
		return "Inventario " + inventario;
	}
	

}
