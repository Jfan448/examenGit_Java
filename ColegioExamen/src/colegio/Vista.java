package colegio;

import javax.swing.JOptionPane;

public class Vista {
	
	String menu = "";
	Funciones funcion = new Funciones();
	
	
	public void mostrarMenu() {
		
		menu = "Menu \n";
		menu += "1. Agregar estudiante \n";
		menu += "2. Mostrar estudiantes \n";
		menu += "3. Modificar estudiante \n";
		menu += "0. salir";
		
		int opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));
		
		try {
			
			switch (opcion) {
			case 1: {
				funcion.agregarEstudiante();
				mostrarMenu();
				break;
			}
			
			case 2: {
				funcion.mostrarEstudiantes();
				mostrarMenu();
				break;
			}
			case 3:{
				funcion.editarEstudiante();
				mostrarMenu();
				break;
			}
			
			case 0: {
				break;
			}
			
			default:
				JOptionPane.showMessageDialog(null, "Digite una opcion valida");
				mostrarMenu();
				return;
			}
		
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
		}

	}
}
