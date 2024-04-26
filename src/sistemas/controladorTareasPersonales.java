package sistemas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class controladorTareasPersonales {
	
	Scanner SC =  new Scanner(System.in);
	List<String> lista = new ArrayList<>();
	
	
	int numero_tareas;
	tareasPersonales[] tareasPersonales;

	
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

	public void editar_tarea(){
		
	 // while(true) {
			System.out.println("Ingrese le indice de la tarea que quiere editar");
			int indice=SC.nextInt();
			SC.nextLine();
			String desicion;
			
			if(indice >=0 && indice<tareasPersonales.length) {
				//variable de tipo estudiante que guarda el estudiante de la lista
				tareasPersonales tareaEditar = tareasPersonales[indice];
			do {	
					System.out.println("Que deseas editar ");
					System.out.println("1.nombre tarea ");
					System.out.println("2.fecha tarea ");
					System.out.println("3.prioridad ");
					System.out.println("4.estado ");
					
					
					int editar=SC.nextInt();
					SC.nextLine();
					switch(editar) {
						
					case 1:
					    System.out.println("Escribe el nuevo nombre");
						String nombreNuevo=SC.nextLine();
						SC.nextLine();
					    tareaEditar.setNombreTarea(nombreNuevo);;
					    System.out.println("Se edito el nombre");
					    break;
					case 2:
						System.out.println("Escribe la nueva fecha");
						String fechaNuevo=SC.nextLine();
						SC.nextLine();
						tareaEditar.setFecha_vencimiento(fechaNuevo);;
						System.out.println("Se edito el apellido");
						break;
					case 3:
						System.out.println("Escribe la nueva prioridad");
						String prioridadNuevo=SC.nextLine();
						SC.nextLine();
						tareaEditar.setPrioridad_tarea(prioridadNuevo);
						System.out.println("Se edito el prioridad");
						break;
					case 4:
						System.out.println("Escribe el estado nuevo");
						String estadoNueva=SC.nextLine();
						SC.nextLine();
						tareaEditar.setEstado_tarea(estadoNueva);;
						System.out.println("Se edito el estado");
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
	
	
	public void mostrar_tareas() {
		//impresion informacion
				for(int i=0;i<numero_tareas;i++) {
					System.out.println("////////////////////");
					System.out.println("Informacion personal:");
					System.out.println(tareasPersonales[i].getNombreTarea());
					System.out.println(tareasPersonales[i].getFecha_vencimiento());
					System.out.println(tareasPersonales[i].getPrioridad_tarea());
					System.out.println(tareasPersonales[i].getEstado_tarea());
					
					
					System.out.println("////////////////////");
					
					
				}
	}
	
	public void informe_tareas() {
		System.out.println("///////////////////////");
		System.out.println("INFORME EMPLEADOS");
		//int sumaSalarios=0;
		int contPriPoco=0;
		int contPriRegu=0;
		int contPriInme=0;
		
		for(int i=0;i<numero_tareas;i++) {
			System.out.println("--------------------------");
			System.out.println("Informacion personal:");
			System.out.println(tareasPersonales[i].getNombreTarea());
			System.out.println(tareasPersonales[i].getFecha_vencimiento());
			System.out.println(tareasPersonales[i].getPrioridad_tarea());
			System.out.println(tareasPersonales[i].getEstado_tarea());
			System.out.println("--------------------------");
			
			if(tareasPersonales[i].getPrioridad_tarea().equals("poca")) {
				contPriPoco+=1;
			}else if(tareasPersonales[i].getPrioridad_tarea().equals("regulada")) {
				contPriRegu+=1;
			}else if(tareasPersonales[i].getPrioridad_tarea().equals("inmediata")) {
				contPriInme+=1;
			}
			
		 }
		
		
		
		System.out.println("La cantidad de tareas con poca prioridad es: " + contPriPoco );
		System.out.println("La cantidad de tareas con poca prioridad es: " + contPriRegu );
		System.out.println("La cantidad de tareas con poca prioridad es: " + contPriInme );
		//System.out.println("Actual mente hay " + tareasPersonales.length + "empleados" );
		
		System.out.println("//////////////////////////");
		
		
		
		
		
		
		
	}
}
