package simuladorGetionInventario;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class CRUD {
	String sms;
	public CRUD() {
		// TODO Auto-generated constructor stub
	}

	public ArrayList<producto> AgregarProductos(ArrayList<producto> inventario) {
		
		sms = "Ingrese el nombre del producto";
		String nombre = JOptionPane.showInputDialog(sms);
		
		sms = "Ingrese la cantidad del producto";
		int cant = Integer.parseInt(JOptionPane.showInputDialog(sms));
		
		sms = "Ingrese el valor del producto";
		int valor = Integer.parseInt(JOptionPane.showInputDialog(sms));
		
		producto pro = new producto(nombre,cant,valor);
		inventario.add(pro);
		return inventario;
	}
	
	public String VerProductos(ArrayList<producto> inventario) {
		sms = "--- LISTADO ACTUAL DE PRODUCTOS ---\n";
		for (int i=0;i<inventario.size();i++) {
			sms+= i+".  "+inventario.get(i).cantidad+ " || "+inventario.get(i).nombre + " || "+inventario.get(i).valorUnit;
			sms+= "\n";
		}
		
		return sms;
	}

	public ArrayList<producto> ActualizarProducto(ArrayList<producto> inventario, String sms,String op) {
		String indi = sms.toString();
		int indice = Integer.parseInt(sms);
		if(op=="1") {
			sms = "Ingrese el nuevo nombre del producto";
			String nombre = JOptionPane.showInputDialog(sms);
			
			inventario.get(indice).nombre = nombre;
		}
		
		if(op=="2") {
			sms = "Ingrese la nueva cantidad del producto";
			int cant = Integer.parseInt(JOptionPane.showInputDialog(sms));
			
			inventario.get(indice).cantidad = cant ;
		}
		
		if(op=="3") {
			sms = "Ingrese el valor del producto";
			int valor = Integer.parseInt(JOptionPane.showInputDialog(sms));
			
			inventario.get(indice).valorUnit=valor;
		}
		
		return inventario;
	}

	public ArrayList<producto> VenderProducto(ArrayList<producto> inventario, String indi, String canti) {
		int indice = Integer.parseInt(indi);
		int cant = Integer.parseInt(canti);
		inventario.get(indice).cantidad = inventario.get(indice).cantidad-cant ;
		return inventario;
	}
}
