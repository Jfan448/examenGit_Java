package sistemas;

import java.util.Scanner;

public class controladorInventario {
	
	Scanner SC =  new Scanner(System.in);
	productos[] productos;
	int numero_productos;
	
	
	public void insertar_producto() {
		
		System.out.println("Cuantos productos quieres ingresar");
		numero_productos=SC.nextInt();
		SC.nextLine();
		
		productos = new productos[numero_productos];
		for(int i=0;i<numero_productos;i++) {
			SC.nextLine();
			System.out.println("Dame el id del producto");
			int idProducto=SC.nextInt();
			SC.nextLine();
			
			System.out.println("Dame el nombre del produto");
			String nombreProducto=SC.nextLine();
			
			System.out.println("Dame la cantidad del producto");
			int cantidadProducto = SC.nextInt();
			
			System.out.println("Cuales es el precio");
			int precioProducto=SC.nextInt();
			
			System.out.println("Cuales fueron las ventas, escriba las que desee y al fianlizar digite 0");
			productos product = new productos(idProducto, nombreProducto, cantidadProducto,precioProducto);
        	
				int venta_Producto;
				while((venta_Producto=SC.nextInt())!=0) {
					
					product.agregar_venta(venta_Producto);
					
				}
			
        	
			System.out.println("--------------------------");
			productos[i]=product;
			
		}
		
		}
	public void editar_productos() {
		
		 // while(true) {
				System.out.println("Ingrese le indice del producto que quiere editar");
				int indice=SC.nextInt();
				SC.nextLine();
				String desicion;
				
				if(indice >=0 && indice<productos.length) {
					//variable de tipo estudiante que guarda el estudiante de la lista
					productos productoEditar = productos[indice];
				do {	
						System.out.println("Que deseas editar ");
						System.out.println("1.nombre producto ");
						System.out.println("2.cantidad producto");
						System.out.println("3.precio producto");
						System.out.println("4.ventas realizadas ");
						
						int editar=SC.nextInt();
						SC.nextLine();
						switch(editar) {
							
						case 1:
						    System.out.println("Escribre el nuevo nombre");
							String nombreNuevo=SC.nextLine();
							SC.nextLine();
						    productoEditar.setNombresProductos(nombreNuevo);
						    System.out.println("Se edito el nombre");
						    break;
						case 2:
							
							System.out.println("Escribe el nuevo cantidad");
							int cantidadNuevo=SC.nextInt();
							SC.nextLine();
							productoEditar.setCantidad(cantidadNuevo);;
							System.out.println("Se edito la cantidad");
							break;
						case 3:
							System.out.println("Escribe el precio nuevo");
							int precioNuevo=SC.nextInt();
							SC.nextLine();
							productoEditar.setPrecio(precioNuevo);
							System.out.println("Se edito el precio");
							break;
						case 4:
							System.out.println("cual es el indice del a venta del 0 en adelante");
							int indice_venta=SC.nextInt();
							productoEditar.buscar_venta(indice_venta);
							System.out.println("Escribe las nuevas ventas");
							int vendido=SC.nextInt();
							productoEditar.editar_ventas(indice_venta, vendido );
						
							
							SC.nextLine();
							
							System.out.println("Se editaron las notas nuevas" );
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
	
	public void mostrar_productos() {
		//impresion informacion
				for(int i=0;i<numero_productos;i++) {
					System.out.println("////////////////////");
					System.out.println("Informacion productos: ");
					System.out.println(productos[i].getId());
					System.out.println(productos[i].getNombresProductos());
					System.out.println(productos[i].getCantidad());
					System.out.println(productos[i].getPrecio());
					
					productos[i].actualizar_inventario();
					
					
					System.out.println("////////////////////");
					
					
				}
	}
	public void informe_inventario() {
		System.out.println("///////////////////////");
		System.out.println("INFORME VENTAS");
		int ventasTotales=0;
		int ventaTotal=0;
		//int reprobados=0;
		
		for(int i=0;i<numero_productos;i++) {
			
			System.out.println("Informacion product: ");
			System.out.println("--------------------------");
			System.out.println("nombre producto " + productos[i].getNombresProductos());
			System.out.println("cantidad de ese producto " + productos[i].getCantidad());
			System.out.println("precio producto " + productos[i].getPrecio());
			System.out.println("cantidad por venta " + productos[i].getVentas());
			System.out.println("numero total de ventas " + productos[i].calcular_numero_ventas());
			ventaTotal= (productos[i].calcular_numero_ventas()*productos[i].getPrecio());
			System.out.println("valor ventas totales del producto " + ventaTotal);
			ventasTotales+=ventaTotal;
			System.out.println("--------------------------");
		 }
		
		System.out.println("El total de ventas de todo el inventario: " + ventasTotales);
		
		System.out.println("//////////////////////////");
		
		
		
		
		
		
		
	}
	
	public void realizar_venta() {
		
		 // while(true) {
				System.out.println("Ingrese le indice del producto que quiere vender");
				int indice=SC.nextInt();
				SC.nextLine();
				
				
				if(indice >=0 && indice<productos.length) {
					//variable de tipo estudiante que guarda el estudiante de la lista
					productos productoVender = productos[indice];
				
							System.out.println("cual es el indice del a venta del 0 en adelante");
							int indice_venta=SC.nextInt();
							
							System.out.println("Escribe el numero de las nuevas ventas");
							int vendido=SC.nextInt();
							productoVender.agregar_venta(vendido);
							
						
							
							SC.nextLine();
							
							System.out.println("Se hizo la venta nueva" );
					
							
							
					}else {
						System.out.println("no fue valido");
					}
	}
	
	

	
	
	
	
	
	
	
	
	
	
}
