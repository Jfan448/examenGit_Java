package colegio;

import java.util.List;

public class Planilla {
	
	List<Estudiante> planilla;
	

	public Planilla(List<Estudiante> estudiantes) {
		super();
		this.planilla = estudiantes;
	}

	public List<Estudiante> getEstudiantes() {
		return planilla;
	}

	public void setEstudiantes(List<Estudiante> estudiantes) {
		this.planilla = estudiantes;
	}

	@Override
	public String toString() {
		return "Estudiantes " + planilla + "\n";
	}

	public void setEstudiantes(int idBuscar, List<Planilla> planilla) {
		// TODO Auto-generated method stub
		
	}
	
}
