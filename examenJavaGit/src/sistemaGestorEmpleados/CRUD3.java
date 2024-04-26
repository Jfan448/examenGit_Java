package sistemaGestorEmpleados;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class CRUD3 {
	String sms;
	public CRUD3() {
		// TODO Auto-generated constructor stub
	}

	public ArrayList<empleado> AgregarEmpleado(ArrayList<empleado> empleados) {
		
		sms = "Ingrese el nombre del empleado";
		String nombre = JOptionPane.showInputDialog(sms);
		
		sms = "Ingrese el documento del empleado";
		String documento = JOptionPane.showInputDialog(sms);
		
		sms = "Ingrese el cargo del empleado";
		String cargo = JOptionPane.showInputDialog(sms);
		
		sms = "Ingrese el sueldo por hora del empleado";
		int salarioHora = Integer.parseInt(JOptionPane.showInputDialog(sms));
		
		empleado emp = new empleado(documento,nombre,cargo,salarioHora);
		empleados.add(emp);
		return empleados;
	}
	
	public String VerEmpleado(ArrayList<empleado> empleados) {
		sms = "--- LISTADO ACTUAL DE EMPLEADOS ---\n";
		for (int i=0;i<empleados.size();i++) {
			sms+= i+".  "+empleados.get(i).identificacion + " || "+empleados.get(i).nombre + " || "+empleados.get(i).cargo + " || "+empleados.get(i).salarioHora;
			sms+= "\n";
		}
		return sms;
	}

	public ArrayList<empleado> ActualizarEmpleado(ArrayList<empleado> empleados, String sms,String op) {
		int indice = Integer.parseInt(sms);
		if(op=="1") {
			sms = "Ingrese el nuevo nombre del empleado";
			String nombre = JOptionPane.showInputDialog(sms);
			
			empleados.get(indice).nombre = nombre;
		}
		
		if(op=="2") {
			sms = "Ingrese el nuevo documento del empleado";
			String doc = JOptionPane.showInputDialog(sms);
			
			empleados.get(indice).identificacion = doc;
		}
		
		if(op=="3") {
			sms = "Ingrese el nuevo cargo del empleado";
			String cargo = JOptionPane.showInputDialog(sms);
			
			empleados.get(indice).cargo = cargo;
		}
		
		if(op=="4") {
			sms = "Ingrese el nuevo salario por hora del empleado";
			int sph = Integer.parseInt(JOptionPane.showInputDialog(sms));
			
			empleados.get(indice).salarioHora = sph;
		}
		
		return empleados;
	}
	
	public ArrayList<empleado> IngresarHoras(ArrayList<empleado> empleados, String indi,String op) {
		int indice = Integer.parseInt(indi);
		
		if(op=="1") {
			sms = "Ingrese las horas a sumar";
			int horas = Integer.parseInt(JOptionPane.showInputDialog(sms));
			empleados.get(indice).horastrabajadas+=horas;
		}
		
		if(op=="2") {
			sms = "Ingrese las horas a restar";
			int horas = Integer.parseInt(JOptionPane.showInputDialog(sms));
			empleados.get(indice).horastrabajadas-=horas;
		}
		
		return empleados;
	}

	public void CalcularSalario(ArrayList<empleado> empleados, String indi) {
		int indice = Integer.parseInt(indi);
		
		int salarioTotal = empleados.get(indice).horastrabajadas *  empleados.get(indice).salarioHora;
			
		sms = "El sueldo a pagar es de: "+salarioTotal;
		JOptionPane.showMessageDialog(null, sms);
	}
	
	
}
