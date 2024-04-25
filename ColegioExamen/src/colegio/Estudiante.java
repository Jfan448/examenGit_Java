package colegio;

import java.util.Arrays;

public class Estudiante {


	int id;
	String nombre;
	int edad;
	int notas [];
	double promedio;
	public Estudiante(String nombre, int edad, int[] notas, double promedio,int id) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.edad = edad;
		this.notas = notas;
		this.promedio = promedio;
	}
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int[] getNotas() {
		return notas;
	}
	public void setNotas(int[] notas) {
		this.notas = notas;
	}
	public double getPromedio() {
		return promedio;
	}
	public void setPromedio(double promedio) {
		this.promedio = promedio;
	}


	@Override
	public String toString() {
		return "\n Estudiante id=" + id + ", nombre=" + nombre + ", edad=" + edad + ", notas=" + Arrays.toString(notas)
				+ ", promedio=" + promedio + "]";
	}

	

}
