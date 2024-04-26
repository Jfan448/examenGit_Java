package sistemas;
import java.util.ArrayList;
import java.util.List;


public class empleados {
	
	
		private String nombres;
		private String apellidos;
		private String telefono;
		private int edad;
		private int salarios;
		
	//contructor
	public empleados(String nombres, String apellidos, String telefono, int edad, int salarios) {
		
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.edad = edad;
		this.telefono = telefono;
		this.salarios = salarios;
		
			
		}
	
	
	empleados[] empleados;
	//metodos getter and setter



	public String getNombres() {
		return nombres;
	}

	public String getTelefono() {
		return telefono;
	}



	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}



	public int getSalarios() {
		return salarios;
	}



	public void setSalarios(int salarios) {
		this.salarios = salarios;
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

	
	   

	public double calcular_promedio_salario(int numero_empleados) {
		int sumaSalarios=0;
		
		for(int i=0;i<numero_empleados;i++) {
			sumaSalarios+=empleados[i].getSalarios();
			
			
		}
		if(numero_empleados==0) {
			return 0.0;
		}else {
			return(double) sumaSalarios/numero_empleados;
		}


		

	}

}
