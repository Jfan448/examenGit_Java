package tienda;

public class Producto {
	
	int codigo;
	String nombre;
	int precio;
	int cantidad;
	String estado;
	
	public Producto(int codigo, String nombre, int precio, int cantidad, String estado) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
		this.cantidad = cantidad;
		this.estado = estado;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	@Override
	public String toString() {
		return "\n Producto [codigo: " + codigo + ", nombre: " + nombre + ", precio: " + precio + ", cantidad: " + cantidad
				+ ", estado: " + estado + "] \n";
	}

	
	

	

}
