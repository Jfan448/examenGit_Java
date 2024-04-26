package sistemas;

import java.util.ArrayList;
import java.util.List;

public class productos {
	
	private int id;
	private String nombresProductos;
	private int cantidad;
	private int precio;
	private List<Integer> ventas;
	
	//constructor
	
	public productos(int id, String nombresProductos, int cantidad, int precio) {
		
		this.id=id;
		this.nombresProductos = nombresProductos;
		this.cantidad =cantidad;
		this.precio =precio;
		this.ventas =new ArrayList<>();
	}

	public List<Integer> getVentas() {
		return ventas;
	}

	public void setVentas(List<Integer> ventas) {
		this.ventas = ventas;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombresProductos() {
		return nombresProductos;
	}

	public void setNombresProductos(String nombresProductos) {
		this.nombresProductos = nombresProductos;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public void agregar_venta(int venta_producto) {
		
		ventas.add(venta_producto);
	
	}
	public int buscar_venta(int indice_venta) {
		for(int i=0;i<ventas.size();i++) {
			if(indice_venta==ventas.get(i)) {
				return i;
				
			}
		}
		return -1;//si no encuentra
	}
	public void editar_ventas(int indice_venta, int venta) {
		if(indice_venta>=0 && indice_venta<ventas.size()) {
			ventas.set(indice_venta, venta);
		}else {
			System.out.println("Indice no valido");
		}
		
	}
	
	public int calcular_numero_ventas() {
		if(ventas.isEmpty()) {
			return 0;
		}else {
			int suma=0;
			for(int i=0; i<ventas.size();i++) {
				suma+=ventas.get(i);
			}
			return suma;
		}
		
	}
	
	public void actualizar_inventario() {
		
		int cantidadActualizada=0;
		
		cantidadActualizada=cantidad-calcular_numero_ventas();
		
		if(cantidadActualizada<0) {
			System.out.println("La cantidad actualizada no puede ser menor que 0");
		}else {
			setCantidad(cantidadActualizada);
			System.out.println("Inventario actualizado exitosamente. Nueva cantidad: " + cantidadActualizada);
		}
		
		
	}
	
	}

	
	
	


