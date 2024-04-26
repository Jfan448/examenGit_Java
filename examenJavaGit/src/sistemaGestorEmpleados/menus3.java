package sistemaGestorEmpleados;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class menus3 {
	String sms;
	ArrayList<empleado> empleados = new ArrayList<empleado>();
	CRUD3 op = new CRUD3();
	public menus3() {
	}
	public void menu(ArrayList<empleado> estudiantes) {
		this.empleados = estudiantes;
		sms = "GESTOR DE EMPLEADOS \n";
		sms += "1. Agregar empleado \n";
		sms += "2. Ver empleado \n";
		sms += "3. Actualizar empleado \n";
		sms += "4. Ingresar horas \n";
		sms += "5. Calcular sueldo final \n";
		sms += "6. SALIR\n";
		
		switch (JOptionPane.showInputDialog(sms)) {
		case "1":{
			estudiantes = op.AgregarEmpleado(estudiantes);
			menu(estudiantes);
			break;
		}
		case "2":{
			JOptionPane.showMessageDialog(null, op.VerEmpleado(estudiantes));
			menu(estudiantes);
			break;
		}
		case "3":{
			sms = op.VerEmpleado(estudiantes);
			sms +="\n INGRESE EL INDICE DEL EMPLEADO A MODIFICAR.";
			sms = JOptionPane.showInputDialog(sms);
			menuActualizar(sms);
			menu(estudiantes);
			break;
		}
		case "4":{
			sms = op.VerEmpleado(estudiantes);
			sms +="\n INGRESE EL INDICE DEL EMPLEADO.";
			String indice = JOptionPane.showInputDialog(sms);
			menuIngresarHoras(indice);
			
			menu(estudiantes);
			break;
		}
		case "5":{
			sms = op.VerEmpleado(estudiantes);
			sms +="\n INGRESE EL INDICE DEL EMPLEADO.";
			String indice = JOptionPane.showInputDialog(sms);
			op.CalcularSalario(estudiantes, indice);
			
			menu(estudiantes);
			break;
		}
		default:{
			break;
		}
		}
		
	}
	
	public void menuActualizar(String indice) {
		sms = "QUE DESEA ACTUALIZAR \n";
		sms += "1. nombre \n";
		sms += "2. documento \n";
		sms += "3. cargo \n";
		sms += "4. salario por hora \n";
		
		switch (JOptionPane.showInputDialog(sms)) {
		case "1":{
			empleados = op.ActualizarEmpleado(empleados,indice,"1");
			menu(empleados);
			break;
		}
		case "2":{
			empleados = op.ActualizarEmpleado(empleados,indice,"2");
			menu(empleados);
			break;
		}
		case "3":{
			empleados = op.ActualizarEmpleado(empleados,indice,"3");
			menu(empleados);
			break;
		}
		case "4":{
			empleados = op.ActualizarEmpleado(empleados,indice,"4");
			menu(empleados);
			break;
		}
		default:{
			break;
		}
		}
	}
	
	public void menuIngresarHoras(String indice) {
		sms = "QUE ACCION VAMOS A REALIZA \n";
		sms += "1. Agregar horas \n";
		sms += "2. Quitar horas";
		
		switch (JOptionPane.showInputDialog(sms)) {
		case "1":{
			empleados = op.IngresarHoras(empleados,indice,"1");
			menu(empleados);
			break;
		}
		case "2":{
			empleados = op.IngresarHoras(empleados,indice,"2");
			menu(empleados);
			break;
		}
		default:{
			break;
		}
		}
	}


}
