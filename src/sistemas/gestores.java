package sistemas;

import java.util.Scanner;

public class gestores {
	

	public static void main(String[] args) {
		Scanner SC = new Scanner(System.in);
		controladorEstudiantes CE = new controladorEstudiantes();
		controladorInventario CP = new controladorInventario();
		controladorEmpleados CEM = new controladorEmpleados();
	
	int opc;	
	String gestionadores;	
	do {	
		System.out.println("Bienvenido al sistema de gestionadores");
		System.out.println("/////////////////////////////////");
		System.out.println("Que opcion deseas");
		System.out.println("E.Gestionador de estudiantes");
		System.out.println("I.Gestionador de inventario");
		System.out.println("3.Gestionador de tareas");
		System.out.println("EM.Gestionador de empleados");
		System.out.println("5.Gestionador de proyectos");
		System.out.println("/////////////////////////////////");
		
		gestionadores=SC.nextLine();
		if(gestionadores.equals("E")) {
		
			do {
				
				
				System.out.println("Bienvenido al gestionardor de estudiantes");
				System.out.println("/////////////////////////////////");
				
				System.out.println("Que opcion deseas");
				System.out.println("1.Guardar estudiantes");
				System.out.println("2.Editar estudiante");
				System.out.println("3.mostrar informacion de estudiantes");
				System.out.println("4.Mostrar informe de estudiantes");
				System.out.println("/////////////////////////////////");
			
			
				opc=SC.nextInt();
					switch(opc){
					  case 1:
					   CE.insertar_info_estudiante();
					   break;
					  case 2:
					   CE.editar_estudiante();
						  break;
					  case 3:
					   CE.mostrar_estudiantes();
					   break;
					  case 4:
						  
					   CE.informe_estudiantes();
					   break;
						  
						
					default:
						System.out.println("No fue valida la opcion");
						break;
					
					
					}
				}while(opc!=0);
			break;
		}
		else if(gestionadores.equals("I")){
			do {
				
				
				System.out.println("Bienvenido al gestionardor de inventario");
				System.out.println("/////////////////////////////////");
				
				System.out.println("Que opcion deseas");
				System.out.println("1.Ingresar productos");
				System.out.println("2.Actualizar productos");
				System.out.println("3.mostrar productos");
				System.out.println("4.Mostrar informe de inventario");
				System.out.println("5.Realizar venta");
				System.out.println("/////////////////////////////////");
			
			
				opc=SC.nextInt();
					switch(opc){
					  case 1:
					   CP.insertar_producto();
					   break;
					  case 2:
					   CP.editar_productos();
						  break;
					  case 3:
					   CP.mostrar_productos();
					   break;
					  case 4:
						  
					   CP.informe_inventario();
					   break;
					  case 5:
						  CP.realizar_venta();
						  break;
						  
						
					default:
						System.out.println("No fue valida la opcion");
						break;
					
					
					}
				}while(opc!=0);
			break;
		}
		else if(gestionadores.equals("EM")){
			do {
				
				
				System.out.println("Bienvenido al gestionardor de empleados");
				System.out.println("/////////////////////////////////");
				
				System.out.println("Que opcion deseas");
				System.out.println("1.Guardar empleados");
				System.out.println("2.Editar empleados");
				System.out.println("3.mostrar informacion de empleados");
				System.out.println("4.Mostrar informe de empleados");
				System.out.println("/////////////////////////////////");
			
			
				opc=SC.nextInt();
					switch(opc){
					  case 1:
						  
					   CEM.insertar_info_empleado();
					   break;
					  case 2:
					   CEM.editar_empleados();
						  break;
					  case 3:
					   CEM.mostrar_empleados();
					   break;
					  case 4:
						  
					   CEM.informe_empleados()
;					   break;
					  
						  
						
					default:
						System.out.println("No fue valida la opcion");
						break;
					
					
					}
				}while(opc!=0);
			break;
		};
			
			
			
		
	gestionadores=SC.nextLine();
	}while(!gestionadores.equals("N"));
		
	}

}
