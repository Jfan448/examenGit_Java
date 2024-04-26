package sistemas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class controladorEmpleados {
	
	Scanner SC =  new Scanner(System.in);
	List<String> lista = new ArrayList<>();
	
	
	int numero_empleados;
	empleados[] empleados;

	
	//metodos 
	public void insertar_info_empleado() {
		System.out.println("Cuantos empleados quieres ingresar");
		numero_empleados=SC.nextInt();
		
		//creacion arreglo tipo objetos estudiantes
		//estudiantes[] estudiantes = new estudiantes[numero_estudiante];
		empleados = new empleados [numero_empleados];
		for(int i=0;i<numero_empleados;i++) {
				SC.nextLine();
				System.out.println("Dame el nombre del empleado numero " + (i) + ":");
				String nombreEmpleado = SC.nextLine();
				
				System.out.println("Dame el apellido del empleado numero " + (i) + ":");
				String apellidosEmpleado = SC.nextLine();
				
				System.out.println("Cual es la edad del empleado numero " + (i) + ":");
				int edadEmpleado = SC.nextInt();	
				SC.nextLine();
				
				System.out.println("Ingrese el telefono del empleado");
				String telefonoEmpleado=SC.nextLine();		
				
				System.out.println("Ingrese el salario del empleado numero " + (i) + ":");
				int salarioEmpleado=SC.nextInt();
				
				//en cada iteracion se agrega un objeto student con su informacion y notas
				empleados trabajador = new empleados(nombreEmpleado, apellidosEmpleado,telefonoEmpleado, edadEmpleado, salarioEmpleado);
				
				empleados[i]=trabajador;
				System.out.println("--------------------------");
			}
		System.out.println("--------------------------");
			//asignacion de posicion en el arreglo
		
			
		
	}
		
	
	public void editar_empleados(){
		
	 // while(true) {
			System.out.println("Ingrese le indice del empleado que quiere editar");
			int indice=SC.nextInt();
			SC.nextLine();
			String desicion;
			
			if(indice >=0 && indice<empleados.length) {
				//variable de tipo estudiante que guarda el estudiante de la lista
				 empleados empleadosEditar = empleados[indice];
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
				for(int i=0;i<numero_empleados;i++) {
					System.out.println("////////////////////");
					System.out.println("Informacion personal:");
					System.out.println(empleados[i].getNombres());
					System.out.println(empleados[i].getApellidos());
					System.out.println(empleados[i].getEdad());
					System.out.println(empleados[i].getTelefono());
					System.out.println(empleados[i].getSalarios());
					
					System.out.println("////////////////////");
					
					
				}
	}
	
	public void informe_empleados() {
		System.out.println("///////////////////////");
		System.out.println("INFORME EMPLEADOS");
		int sumaSalarios=0;
		double calculo=0.0;
		
		for(int i=0;i<numero_empleados;i++) {
			System.out.println("Informacion personal:");
			System.out.println(empleados[i].getNombres());
			System.out.println(empleados[i].getApellidos());
			System.out.println(empleados[i].getEdad());
			System.out.println(empleados[i].getTelefono());
			System.out.println(empleados[i].getSalarios());
			
			sumaSalarios += empleados[i].getSalarios();
		 }
		calculo=sumaSalarios/numero_empleados;
		
		
		System.out.println("El promedio de salarios de los empleados fue de: " + calculo );
		System.out.println("Actual mente hay " + empleados.length + "empleados" );
		
		System.out.println("//////////////s////////////");
		
		
		
		
		
		
		
	}

}
