package sistemaGestorEmpleados;

import java.util.ArrayList;


public class principal {
	static ArrayList<empleado> empleados = new ArrayList<empleado>();
	String sms;
	public static void main(String[] args) {
		menus3 omc = new menus3();
		omc.menu(empleados);

	}

}
