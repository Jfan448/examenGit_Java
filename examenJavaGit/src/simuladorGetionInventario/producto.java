package simuladorGetionInventario;

public class producto {
	String nombre;
	int cantidad;
	int valorUnit;

	public producto(String nombre, int cantidad, int valorUnit) {
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.valorUnit = valorUnit;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public int getValorUnit() {
		return valorUnit;
	}

	public void setValorUnit(int valorUnit) {
		this.valorUnit = valorUnit;
	}
}
