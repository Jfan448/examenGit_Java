package simuladorGetionInventario;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class menus {
	String sms;
	ArrayList<producto> inventario = new ArrayList<producto>();
	CRUD op = new CRUD();
	public menus() {
	}
	public void menu(ArrayList<producto> inventario) {
		this.inventario = inventario;
		sms = "GESTION DE INVENTARIO \n";
		sms += "1. Agregar producto \n";
		sms += "2. Ver producto \n";
		sms += "3. Actualizar producto \n";
		sms += "4. Vender producto \n";
		sms += "5. SALIR \n";
		
		switch (JOptionPane.showInputDialog(sms)) {
		case "1":{
			producto pro = new producto("panela",2,200);
			inventario = op.AgregarProductos(inventario);
			menu(inventario);
			break;
		}
		case "2":{
			JOptionPane.showMessageDialog(null, op.VerProductos(inventario));
			menu(inventario);
			break;
		}
		case "3":{
			sms = op.VerProductos(inventario);
			sms +="\n INGRESE EL INDICE DEL PRODUCTO A MODIFICAR.";
			sms = JOptionPane.showInputDialog(sms);
			menuActualizar(sms);
			menu(inventario);
			break;
		}
		case "4":{
			sms = op.VerProductos(inventario);
			sms +="\n INGRESE EL INDICE DEL PRODUCTO A VENDER.";
			String indice = JOptionPane.showInputDialog(sms);
			sms ="\n INGRESE LA CANTIDAD DEL PRODUCTO A VENDER.";
			String cant = JOptionPane.showInputDialog(sms);
			inventario = op.VenderProducto(inventario,indice,cant);
			JOptionPane.showMessageDialog(null, "PRODUCTO VENDIDO");
			menu(inventario);
			break;
		}
		default:{
			break;
		}
		}
		
	}
	
	public void menuActualizar(String indice) {
		sms = "QUE DESEA ACTUALIZAR \n";
		sms += "1. nombre \n";
		sms += "2. cantidad \n";
		sms += "3. valor \n";
		
		switch (JOptionPane.showInputDialog(sms)) {
		case "1":{
			inventario = op.ActualizarProducto(inventario,indice,"1");
			menu(inventario);
			break;
		}
		case "2":{
			inventario = op.ActualizarProducto(inventario,indice,"2");
			menu(inventario);
			break;
		}
		case "3":{
			inventario = op.ActualizarProducto(inventario,indice,"3");
			menu(inventario);
			break;
		}
		default:{
			break;
		}
		}
	}


}
