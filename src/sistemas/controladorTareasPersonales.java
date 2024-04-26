package sistemas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class controladorTareasPersonales {
	
	Scanner SC =  new Scanner(System.in);
	List<String> lista = new ArrayList<>();
	
	
	int numero_tareas;
	empleados[] tareasPersonales;

	
	//metodos 
	public void insertar_info_tareas() {
	    System.out.println("Cuantas tareas quieres ingresar");
	    numero_tareas = SC.nextInt();
	    
	    tareasPersonales = new tareasPersonales[numero_tareas];
	    for (int i = 0; i < numero_tareas; i++) {
	        SC.nextLine();
	        System.out.println("Dame el nombre de la tarea número " + (i + 1) + ":");
	        String nombreTarea = SC.nextLine();
	        
	        System.out.println("Dame la fecha de vencimiento de la tarea " + (i + 1) + ":");
	        String fechaVencimientoTarea = SC.nextLine();
	        
	        System.out.println("¿Cuál es la prioridad de la tarea " + (i + 1) + "?: (poca/regulada/inmediata)");
	        String prioridadTarea = SC.nextLine();   
	        
	        System.out.println("Ingrese el estado de la tarea (pendiente/incompleta/completa)");
	        String estadoTarea = SC.nextLine();   
	        
	        tareasPersonales tarea = new tareasPersonales(nombreTarea, fechaVencimientoTarea, prioridadTarea, estadoTarea);
	        
	        tareasPersonales[i] = tarea;
	        System.out.println("--------------------------");
	    }
	    System.out.println("--------------------------");
	}

	public void editar_empleados(){
		
	 // while(true) {
			System.out.println("Ingrese le indice del estudiante que quiere editar");
			int indice=SC.nextInt();
			SC.nextLine();
			String desicion;
			
			if(indice >=0 && indice<tareasPersonales.length) {
				//variable de tipo estudiante que guarda el estudiante de la lista
				empleados empleadosEditar = tareasPersonales[indice];
			do {	
					System.out.println("Que deseas editar ");
					System.out.println("1.nombre ");
					System.out.println("2.apellido ");
					System.out.println("3.telefono ");
					System.out.println("4.edad ");
					System.out.println("5.salario ");
					
					int editar=SC.nextInt();
					SC.nextLine();
					switch(editar) {
						
					case 1:
					    System.out.println("Escribre el nuevo nombre");
						String nombreNuevo=SC.nextLine();
						SC.nextLine();
					    empleadosEditar.setNombres(nombreNuevo);
					    System.out.println("Se edito el nombre");
					    break;
					case 2:
						System.out.println("Escribe el nuevo apellido");
						String apellidoNuevo=SC.nextLine();
						SC.nextLine();
						empleadosEditar.setApellidos(apellidoNuevo);
						System.out.println("Se edito el apellido");
						break;
					case 3:
						System.out.println("Escribe el nuevo telefono");
						String telefonoNuevo=SC.nextLine();
						SC.nextLine();
						empleadosEditar.setTelefono(telefonoNuevo);
						System.out.println("Se edito el telefono");
						break;
					case 4:
						System.out.println("Escribe la edad nueva");
						int edadNueva=SC.nextInt();
						SC.nextLine();
						empleadosEditar.setEdad(edadNueva);
						System.out.println("Se edito la edad");
						break;
					case 5:
						System.out.println("Escribe el salario nueva");
						int salarioNueva=SC.nextInt();
						SC.nextLine();
						empleadosEditar.setSalarios(salarioNueva);;
						System.out.println("Se edito el salario");
						break;
					default:
						System.out.println("Opcion no valida");
						break;
					}
				
			System.out.println("Deseas editar algo mas? (S/N)");
			desicion=SC.nextLine();
			}while(!desicion.equals("N"));
		}else {
			System.out.println("Indice no valido");
		}
		
		
	}
	
	
	public void mostrar_empleados() {
		//impresion informacion
				for(int i=0;i<numero_tareas;i++) {
					System.out.println("////////////////////");
					System.out.println("Informacion personal:");
					System.out.println(tareasPersonales[i].getNombres());
					System.out.println(tareasPersonales[i].getApellidos());
					System.out.println(tareasPersonales[i].getEdad());
					System.out.println(tareasPersonales[i].getTelefono());
					System.out.println(tareasPersonales[i].getSalarios());
					
					System.out.println("////////////////////");
					
					
				}
	}
	
	public void informe_empleados() {
		System.out.println("///////////////////////");
		System.out.println("INFORME EMPLEADOS");
		int sumaSalarios=0;
		double calculo=0.0;
		
		for(int i=0;i<numero_tareas;i++) {
			System.out.println("Informacion personal:");
			System.out.println(tareasPersonales[i].getNombres());
			System.out.println(tareasPersonales[i].getApellidos());
			System.out.println(tareasPersonales[i].getEdad());
			System.out.println(tareasPersonales[i].getTelefono());
			System.out.println(tareasPersonales[i].getSalarios());
			
			sumaSalarios += tareasPersonales[i].getSalarios();
		 }
		calculo=sumaSalarios/numero_tareas;
		
		
		System.out.println("El promedio de salarios de los empleados fue de: " + calculo );
		System.out.println("Actual mente hay " + tareasPersonales.length + "empleados" );
		
		System.out.println("//////////////////////////");
		
		
		
		
		
		
		
	}
}
