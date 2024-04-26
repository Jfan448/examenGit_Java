package sistemaGestorEmpleados;

public class empleado {
	String identificacion;
	String nombre;
	String cargo;
	int salarioHora;
	int horastrabajadas;
	

	public empleado(String identificacion, String nombre, String cargo, int salarioHora) {
		this.identificacion = identificacion;
		this.nombre = nombre;
		this.cargo = cargo;
		this.salarioHora = salarioHora;
	}


	public String getIdentificacion() {
		return identificacion;
	}


	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getCargo() {
		return cargo;
	}


	public void setCargo(String cargo) {
		this.cargo = cargo;
	}


	public int getSalarioHora() {
		return salarioHora;
	}


	public void setSalarioHora(int salarioHora) {
		this.salarioHora = salarioHora;
	}


	public int getHorastrabajadas() {
		return horastrabajadas;
	}


	public void setHorastrabajadas(int horastrabajadas) {
		this.horastrabajadas = horastrabajadas;
	}

}
