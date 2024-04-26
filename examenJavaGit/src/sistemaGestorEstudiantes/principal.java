package sistemaGestorEstudiantes;

import java.util.ArrayList;


public class principal {
	static ArrayList<estudiante> inventario = new ArrayList<estudiante>();
	String sms;
	public static void main(String[] args) {
		menus2 omc = new menus2();
		omc.menu(inventario);

	}

}
