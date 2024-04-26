package sistemas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class controladorEstudiantes {
	
	//estudiantes CE = new estudiantes(null, null, 0);
	Scanner SC =  new Scanner(System.in);
	List<String> lista = new ArrayList<>();
	
	
	int numero_estudiante;
	estudiantes[] estudiantes;

	
	//metodos 
	public void insertar_info_estudiante() {
		System.out.println("Cuantos estudiantes quieres ingresar");
		numero_estudiante=SC.nextInt();
		SC.nextLine();
		//creacion arreglo tipo objetos estudiantes
		//estudiantes[] estudiantes = new estudiantes[numero_estudiante];
		estudiantes = new estudiantes[numero_estudiante];
		for(int i=0;i<numero_estudiante;i++) {
			SC.nextLine();
			System.out.println("Dame el nombre del estudiante numero " + (i) + ":");
			String nombreEstudiante = SC.nextLine();
			
			System.out.println("Dame el apellido del estudiante numero " + (i) + ":");
			String apellidosEstudiante = SC.nextLine();
			
			System.out.println("Cual es la edad del estudiante numero " + (i) + ":");
			int edadEstudiante = SC.nextInt();	
			
			System.out.println("Ingrese las 3 notas del estudiante numero " + (i) + ":");
			double notaEstudiante=0.0;
			
			//en cada iteracion se agrega un objeto student con su informacion y notas
			estudiantes Student = new estudiantes(nombreEstudiante, apellidosEstudiante, edadEstudiante);
			
			
			for(int n=0;n<3;n++) {
				
				notaEstudiante=SC.nextDouble();
				Student.agregar_nota(notaEstudiante);
			}
			System.out.println("--------------------------");
			//asignacion de posicion en el arreglo
			estudiantes[i]=Student;
		}
		
		
	}
	public void editar_estudiante() {
		
	 // while(true) {
			System.out.println("Ingrese le indice del estudiante que quiere editar");
			int indice=SC.nextInt();
			SC.nextLine();
			String desicion;
			
			if(indice >=0 && indice<estudiantes.length) {
				//variable de tipo estudiante que guarda el estudiante de la lista
				estudiantes estudianteEditar = estudiantes[indice];
			do {	
					System.out.println("Que deseas editar ");
					System.out.println("1.nombre ");
					System.out.println("2.apellido ");
					System.out.println("3.edad ");
					System.out.println("4.notas ");
					
					int editar=SC.nextInt();
					SC.nextLine();
					switch(editar) {
						
					case 1:
					    System.out.println("Escribre el nuevo nombre");
						String nombreNuevo=SC.nextLine();
						SC.nextLine();
					    estudianteEditar.setNombres(nombreNuevo);
					    System.out.println("Se edito el nombre");
					    break;
					case 2:
						System.out.println("Escribe el nuevo apellido");
						String apellidoNuevo=SC.nextLine();
						SC.nextLine();
						estudianteEditar.setApellidos(apellidoNuevo);
						System.out.println("Se edito el apellido");
						break;
					case 3:
						System.out.println("Escribe la edad nueva");
						int edadNueva=SC.nextInt();
						SC.nextLine();
						estudianteEditar.setEdad(edadNueva);
						System.out.println("Se edito la edad");
						break;
					case 4:
						System.out.println("Escribe las nuevas 3 notas");
						estudianteEditar.editar_nota();
						for(int i=0;i<3;i++) {
							double notasNuevas=SC.nextDouble();
							estudianteEditar.agregar_nota(notasNuevas);
					
						}
						SC.nextLine();
						System.out.println("Se editaron las notas nuevas");
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
	
	
	public void mostrar_estudiantes() {
		//impresion informacion
				for(int i=0;i<numero_estudiante;i++) {
					System.out.println("////////////////////");
					System.out.println("Informacion personal:");
					System.out.println(estudiantes[i].getNombres());
					System.out.println(estudiantes[i].getApellidos());
					System.out.println(estudiantes[i].getEdad());
					System.out.println(estudiantes[i].getNotas());
					System.out.println(estudiantes[i].calcular_promedio());
					System.out.println("////////////////////");
					
					
				}
	}
	
	public void informe_estudiantes() {
		System.out.println("///////////////////////");
		System.out.println("INFORME ESTUDIANTES");
		int aprobados=0;
		int reprobados=0;
		for(int i=0;i<numero_estudiante;i++) {
			System.out.println("Informacion personal:");
			System.out.println(estudiantes[i].getNombres());
			System.out.println(estudiantes[i].getApellidos());
			System.out.println(estudiantes[i].getEdad());
			System.out.println(estudiantes[i].getNotas());
			System.out.println(estudiantes[i].calcular_promedio());
			if(estudiantes[i].calcular_promedio()>= 3.0) {
				System.out.println("El estudiante aprobo");
				aprobados+=1;
			}else {
				System.out.println("El estudiante reprobo");
				reprobados+=1;
			}
			
			
		 }
		System.out.println("El total de estudiantes que aprobaron fue de: " + aprobados);
		System.out.println("El total de estudiantes que reprobaron fue de: " + reprobados);
		System.out.println("//////////////////////////");
		
		
		
		
		
		
		
	}
	
	
	
	

}
