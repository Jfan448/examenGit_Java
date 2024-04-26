package sistemas;

import java.util.ArrayList;
import java.util.List;

public class estudiantes {
	
	private List<Double> notas;
	private String nombres;
	private String apellidos;
	private int edad;

//contructor
public estudiantes(String nombres, String apellidos, int edad) {
	
	this.nombres = nombres;
	this.apellidos = apellidos;
	this.edad = edad;
	this.notas = new ArrayList<>();
	
		
	}
//metodos getter and setter

public List<Double> getNotas() {
	return notas;
}

public void setNotas(List<Double> notas) {
	this.notas = notas;
}

public String getNombres() {
	return nombres;
}

public void setNombres(String nombres) {
	this.nombres = nombres;
}

public String getApellidos() {
	return apellidos;
}

public void setApellidos(String apellidos) {
	this.apellidos = apellidos;
}

public int getEdad() {
	return edad;
}

public void setEdad(int edad) {
	this.edad = edad;
}

public void agregar_nota(double nota_estudiante) {
	
	notas.add(nota_estudiante);
	
}
public void editar_nota() {
	notas.clear();
	
}
    



public double calcular_promedio() {
	if(notas.isEmpty()) {
		return 0.0;
	}else {
		double suma=0.0;
		for(int i=0; i<notas.size();i++) {
			suma+=notas.get(i);
		}
		return suma/notas.size();
	}
	
}
	


	

}
