package tienda;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;


public class Funciones {

	List<Producto>productos = new ArrayList<Producto>();
	int codigo;
	String nombre;
	int precio;
	int cantidad;
	String estado;
	Inventario inventario = new Inventario(productos);
	int num , num2;
	
	
	
	public void agregarProducto () {
		
		try {
		
			for( int i=0; i<1; i++) {
			
				do {
					
					try {
						codigo = Integer.parseInt(JOptionPane.showInputDialog("Codigo"));
						
						if(verificarProducto(codigo) == true) {
							return;
						}
						
						
					} catch (NumberFormatException e) {
						JOptionPane.showMessageDialog(null, "Digite un codigo ","ERROR", JOptionPane.ERROR_MESSAGE);
						codigo = -1;
					}
				}while(codigo == -1);
				
				
				do {
					try {
						nombre = JOptionPane.showInputDialog("Nombre producto");
				        if (nombre == null) {
				            return;
				        }
						
					} catch (Exception e) {
				        JOptionPane.showMessageDialog(null, e);
				    }
					
					if (!esStringValido(nombre)) {
				        JOptionPane.showMessageDialog(null, "Ingresa un nombre", "ERROR", JOptionPane.ERROR_MESSAGE);
				    }
			        
			    } while (!esStringValido(nombre));
				
				
				do {
					
					try {
						precio = Integer.parseInt(JOptionPane.showInputDialog("Precio"));
						
						
					} catch (Exception e) {
						JOptionPane.showMessageDialog(null, "Digite un precio", "ERROR", JOptionPane.ERROR_MESSAGE);
						precio = -1;
						
					}
				} while (precio == -1);
				
				
				
				do {
					
					try {
						cantidad = Integer.parseInt(JOptionPane.showInputDialog("Cantidad"));
					} catch (NumberFormatException e) {
						JOptionPane.showMessageDialog(null, "Digite una cantidad ","ERROR", JOptionPane.ERROR_MESSAGE);
						cantidad = -1;
					}
				}while(cantidad == -1);
				
				
				do {
					try {
						estado = JOptionPane.showInputDialog("Estado");
						if(estado == null) {
							return;
						}
					} catch (Exception e) {
						JOptionPane.showMessageDialog(null, e);
					}
					
					if(!esStringValido(estado)) {
						JOptionPane.showMessageDialog(null, "Digite el estado del producto", "ERROR", JOptionPane.ERROR_MESSAGE);
					}
				} while (!esStringValido(estado));
				
				
				
				Producto nuevoProducto = new Producto(codigo, nombre, precio, cantidad, estado);
				productos.add(nuevoProducto);
				
				inventario.setInventario(productos);
				
				
				
				JOptionPane.showMessageDialog(null, "Producto agregado exitosamente");
				
			}
		}catch (Exception e) {
			System.out.println(e);
		}
		
		
		
	}
	
	
	public void editarProducto() {

	    try {
	        int idBuscar = Integer.parseInt(JOptionPane.showInputDialog("Digite identificación del estudiante a editar"));
	        String dato = JOptionPane.showInputDialog("que deseas actualizar");

	        Producto inventarioEditar = null;

	        for (Producto e : productos) {
	            if (e.getCodigo() == idBuscar) {
	                inventarioEditar = e;
	                break;
	            }
	        }
	        
	        if(dato.equals("producto")) {
		        if (inventarioEditar != null) {
		            String nuevaNombre = JOptionPane.showInputDialog("Digite la nuevo nombre para el producto");
		            inventarioEditar.setNombre(nuevaNombre);
		            JOptionPane.showMessageDialog(null, "Producto editado exitosamente");
		        } else {
		            JOptionPane.showMessageDialog(null, "No se encontró ningún Producto con ese codigo");
		        }
	        }
	        
	        if(dato.equals("estado")) {
		        if (inventarioEditar != null) {
		            String nuevoEstado = JOptionPane.showInputDialog("Digite el nuevo estado del producto");
		            inventarioEditar.setEstado(nuevoEstado);
		            JOptionPane.showMessageDialog(null, "Producto editado exitosamente");
		        } else {
		            JOptionPane.showMessageDialog(null, "No se encontró ningún Producto con ese codigo");
		        }
	        }
	        
	        if(dato.equals("cantidad")) {
		        if (inventarioEditar != null) {
		            int nuevaCantidad = Integer.parseInt(JOptionPane.showInputDialog("Digite la nueva cantidad del producto"));
		            inventarioEditar.setCantidad(nuevaCantidad);
		            JOptionPane.showMessageDialog(null, "Producto editado exitosamente");
		        } else {
		            JOptionPane.showMessageDialog(null, "No se encontró ningún Producto con ese codigo");
		        }
	        }
	        
	        
	        
	    } catch (NumberFormatException e) {
	        JOptionPane.showMessageDialog(null, "Error: Formato de número inválido");
	    }
	
	}
	
	public boolean verificarProducto(int codigo) {
	    for (Producto producto : productos) {
	        if (producto.getCodigo() == codigo) {
	            JOptionPane.showMessageDialog(null, "El código ya está registrado");
	            return true;
	        }
	    }
	    return false;
	}

	
	private boolean esStringValido(String str) {
	    return str.matches("[a-zA-ZñÑáéíóúÁÉÍÓÚ\\s]+");
	}


	public void mostrarProductos() {
			
			int contador = inventario.getInventario().size();
			
			if(contador == 0){
				JOptionPane.showMessageDialog(null, "No hay productos");
			}else {
				JOptionPane.showMessageDialog(null, inventario);
			}
			
		}

}
