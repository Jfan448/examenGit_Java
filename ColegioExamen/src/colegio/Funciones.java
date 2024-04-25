package colegio;


import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Funciones {
	
	
	List<Estudiante> estudiante = new ArrayList<Estudiante>();
	String nombre;
	int id;
	int edad;
	int totalNotas = 0;
	int [] notas;
	int cantNotas = 0;
	double promedio = 0.0;
	int sumaNotas = 0;
	
	List<Planilla> planilla = new ArrayList<Planilla>();
	
	
	Planilla estudiantes = new Planilla(estudiante);
	
	
	public void agregarEstudiante() {
		
		do {
			try {
				id = Integer.parseInt(JOptionPane.showInputDialog("Identificacion del estudiante"));
				
				
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Digite valor valido");
				id = -1;
			}
		} while (id==-1);
		
		do {
			try {
				nombre = JOptionPane.showInputDialog("Nombre de estudiante");
		        if (nombre == null) {
		            return;
		        }
				
			} catch (Exception e) {
		        JOptionPane.showMessageDialog(null, e);
		    }
			
			if (!esStringValido(nombre)) {
		        JOptionPane.showMessageDialog(null, "Ingresa un nombre", "ERROR", JOptionPane.ERROR_MESSAGE);
		    }
	        
	    } while (!esStringValido(nombre));
		
		
		do {
			
			try {
				
				edad = Integer.parseInt(JOptionPane.showInputDialog("Digite la edad"));
				
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Digite la edad" , "ERROR" , JOptionPane.ERROR_MESSAGE);
				edad = -1;
			}
			
		} while (edad == -1);
		
		try {
			
			do {
				try {
					
					String input = JOptionPane.showInputDialog("Digite cantidad de notas del estudiante");
			        
					if(input.equals("")) {
					}
					
			        cantNotas = Integer.parseInt(input);
			        
			        
					
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Digite cantidad");
					cantNotas = -1;
				}
			} while (cantNotas == -1);
			
			notas = new int[cantNotas];
	
	        for (int i = 0; i < cantNotas; i++) {
	            try {
	                notas[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite nota " + (i + 1)));
	            } catch (NumberFormatException e) {
	                JOptionPane.showMessageDialog(null, "La nota ingresada no es un número válido. Por favor, inténtelo de nuevo.");
	                i--; 
	            }
	        }
        
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
		}
		calcularPromedio();
		

		Estudiante nuevoEstudiante = new Estudiante(nombre, edad, notas, promedio, id);
		estudiante.add(nuevoEstudiante);
		
		estudiantes.setEstudiantes(estudiante);
		
		
		
		JOptionPane.showMessageDialog(null, "Estudiante agregado exitoxamente");
		
	}
	
	
	
	public void calcularPromedio() {
		
		totalNotas = Integer.parseInt(JOptionPane.showInputDialog("Digite el total de notas"));
		
		try {

			for(int i=0;i< notas.length;i++) {
				sumaNotas += notas[i];
			}
			
			System.out.println(sumaNotas);
			promedio = sumaNotas / totalNotas;
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Error");
		}
		
	}

	public void editarEstudiante() {
	    try {
	        int idBuscar = Integer.parseInt(JOptionPane.showInputDialog("Digite identificación del estudiante a editar"));
	        String dato = JOptionPane.showInputDialog("que deseas actualizar");

	        Estudiante estudianteEditar = null;

	        for (Estudiante e : estudiante) {
	            if (e.getId() == idBuscar) {
	                estudianteEditar = e;
	                break;
	            }
	        }
	        
	        if(dato.equals("nombre")) {
		        if (estudianteEditar != null) {
		            String nuevaNombre = JOptionPane.showInputDialog("Digite la nuevo nombre para el estudiante");
		            estudianteEditar.setNombre(nuevaNombre);
		            JOptionPane.showMessageDialog(null, "Estudiante editado exitosamente");
		        } else {
		            JOptionPane.showMessageDialog(null, "No se encontró ningún estudiante con esa identificación");
		        }
	        }
	        
	        if(dato.equals("edad")) {
		        if (estudianteEditar != null) {
		            int nuevaEdad = Integer.parseInt(JOptionPane.showInputDialog("Digite la nueva edad para el estudiante"));
		            estudianteEditar.setEdad(nuevaEdad);
		            JOptionPane.showMessageDialog(null, "Estudiante editado exitosamente");
		        } else {
		            JOptionPane.showMessageDialog(null, "No se encontró ningún estudiante con esa identificación");
		        }
	        }
	        
	        
	    } catch (NumberFormatException e) {
	        JOptionPane.showMessageDialog(null, "Error: Formato de número inválido");
	    }
	}

	
	public void mostrarEstudiantes() {
		
		int contador = estudiantes.getEstudiantes().size();
		
		if(contador == 0) {
			JOptionPane.showMessageDialog(null, "No hay estudiantes");
		}else {
			JOptionPane.showMessageDialog(null, estudiantes);
		}
	}
	
	
	private boolean esStringValido(String str) {
	    return str.matches("[a-zA-ZñÑáéíóúÁÉÍÓÚ\\s]+");
	}
	
}
