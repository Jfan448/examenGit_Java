package sistemaGestorEstudiantes;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class menus2 {
	String sms;
	ArrayList<estudiante> estudiantes = new ArrayList<estudiante>();
	CRUD2 op = new CRUD2();
	public menus2() {
	}
	public void menu(ArrayList<estudiante> estudiantes) {
		this.estudiantes = estudiantes;
		sms = "GESTOR DE ESTUDIANTES \n";
		sms += "1. Agregar estudiante \n";
		sms += "2. Ver estudiante \n";
		sms += "3. Actualizar estudiante \n";
		sms += "4. Calcular nota \n";
		sms += "5. SALIR \n";
		
		switch (JOptionPane.showInputDialog(sms)) {
		case "1":{
			estudiantes = op.AgregarEstudiante(estudiantes);
			menu(estudiantes);
			break;
		}
		case "2":{
			JOptionPane.showMessageDialog(null, op.VerEstudiante(estudiantes));
			menu(estudiantes);
			break;
		}
		case "3":{
			sms = op.VerEstudiante(estudiantes);
			sms +="\n INGRESE EL INDICE DEL ESTUDIANTE A MODIFICAR.";
			sms = JOptionPane.showInputDialog(sms);
			menuActualizar(sms);
			menu(estudiantes);
			break;
		}
		case "4":{
			sms = op.VerEstudiante(estudiantes);
			sms +="\n INGRESE EL INDICE DEL ESTUDIANTE.";
			String indice = JOptionPane.showInputDialog(sms);
			op.CalcularNota(estudiantes, indice);
			
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
		sms += "3.  \n";
		
		switch (JOptionPane.showInputDialog(sms)) {
		case "1":{
			estudiantes = op.ActualizarEstudiante(estudiantes,indice,"1");
			menu(estudiantes);
			break;
		}
		case "2":{
			estudiantes = op.ActualizarEstudiante(estudiantes,indice,"2");
			menu(estudiantes);
			break;
		}
		case "3":{
			estudiantes = op.ActualizarEstudiante(estudiantes,indice,"3");
			menu(estudiantes);
			break;
		}
		default:{
			break;
		}
		}
	}


}
