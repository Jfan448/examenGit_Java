package simuladorGetionInventario;

import java.util.ArrayList;
import java.util.List;


public class principal {
	static ArrayList<producto> inventario = new ArrayList<producto>();
	String sms;
	public static void main(String[] args) {
       menus omc = new menus();
		omc.menu(inventario);
	}
	
}

