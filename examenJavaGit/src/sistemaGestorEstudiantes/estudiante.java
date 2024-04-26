package sistemaGestorEstudiantes;

public class estudiante {
	String documento;
	String nombre;
	String grado;
	double[] notas = {0,0,0};
	
	public estudiante(String documento, String nombre, String grado) {
		this.documento = documento;
		this.nombre = nombre;
		this.grado = grado;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getGrado() {
		return grado;
	}

	public void setGrado(String grado) {
		this.grado = grado;
	}

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}

}
