package tienda;

import javax.swing.JOptionPane;


public class Vista {

	int opcion = 0;
	Funciones inventario = new Funciones();
	
	public void mostrarMenu() {
		
		String menu = "Menu \n";
		menu += "1. Agregar producto \n";
		menu += "2. Mostrar productos \n";
		menu += "3. Editar productos \n";
		menu += "0. Salir ";
		
		opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));
		
		try {
								
			switch (opcion) {
			case 1:{
				inventario.agregarProducto();
				mostrarMenu();
				break;
			}
			case 2:{
				inventario.mostrarProductos();
				mostrarMenu();
				break;
			}
			case 3:{
				inventario.editarProducto();
				mostrarMenu();
				break;
			}
			
			case 0:{
				break;
			}
			
			default:
		        JOptionPane.showInternalMessageDialog(null, "Elija Una Opción Valida...");
		        return;
				}
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
}
