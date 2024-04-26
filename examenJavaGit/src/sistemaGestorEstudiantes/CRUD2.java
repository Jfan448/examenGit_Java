package sistemaGestorEstudiantes;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class CRUD2 {
	String sms;
	public CRUD2() {
		// TODO Auto-generated constructor stub
	}

	public ArrayList<estudiante> AgregarEstudiante(ArrayList<estudiante> estudiantes) {
		
		sms = "Ingrese el nombre del estudiante";
		String nombre = JOptionPane.showInputDialog(sms);
		
		sms = "Ingrese el documento del estudiante";
		String documento = JOptionPane.showInputDialog(sms);
		
		sms = "Ingrese el grado del estudiante";
		String grado = JOptionPane.showInputDialog(sms);
		
		estudiante est = new estudiante(documento,nombre,grado);
		estudiantes.add(est);
		return estudiantes;
	}
	
	public String VerEstudiante(ArrayList<estudiante> estudiantes) {
		sms = "--- LISTADO ACTUAL DE ESTUDIANTES ---\n";
		for (int i=0;i<estudiantes.size();i++) {
			sms+= i+".  "+estudiantes.get(i).documento + " || "+estudiantes.get(i).nombre + " || "+estudiantes.get(i).grado;
			sms+= "\n";
		}
		return sms;
	}

	public ArrayList<estudiante> ActualizarEstudiante(ArrayList<estudiante> estudiantes, String sms,String op) {
		int indice = Integer.parseInt(sms);
		if(op=="1") {
			sms = "Ingrese el nuevo nombre del estudiante";
			String nombre = JOptionPane.showInputDialog(sms);
			
			estudiantes.get(indice).nombre = nombre;
		}
		
		if(op=="2") {
			sms = "Ingrese el nuevo documento del estudiante";
			String doc = JOptionPane.showInputDialog(sms);
			
			estudiantes.get(indice).documento = doc;
		}
		
		if(op=="3") {
			sms = "Ingrese el nuevo grado del estudiante";
			String grado = JOptionPane.showInputDialog(sms);
			
			estudiantes.get(indice).grado = grado;
		}
		
		return estudiantes;
	}

	public void CalcularNota(ArrayList<estudiante> estudiantes, String indi) {
		int indice = Integer.parseInt(indi);
		for(int i =0;i<3;i++) {
			sms="INGRESE NOTA #"+i+1;
			double res= Double.parseDouble(JOptionPane.showInputDialog(sms));
			estudiantes.get(indice).notas[i]=res;
		}
		
		sms = promedio(estudiantes.get(indice).notas).toString();
		JOptionPane.showMessageDialog(null, sms);
	}
	
	public Double promedio(double[] notas) {
		double suma = notas[0]+notas[1]+notas[2];
		double pro = suma/3;
		return pro;
	}
}
