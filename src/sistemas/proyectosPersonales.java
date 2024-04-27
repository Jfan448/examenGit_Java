package sistemas;

import java.util.ArrayList;
import java.util.List;

public class proyectosPersonales {
	
	private  String nombreProyecto;
	private List<sistemas.empleados> miembros;
	private List<sistemas.tareasPersonales> tareas;
	
	public proyectosPersonales(String nombreProyecto) {
        this.nombreProyecto = nombreProyecto;
        this.miembros = new ArrayList<>();
        this.tareas = new ArrayList<>();
    }
	
	public String getNombreProyecto() {
		return nombreProyecto;
	}
	public void setNombreProyecto(String nombreProyecto) {
		this.nombreProyecto = nombreProyecto;
	}
	public List<sistemas.empleados> getMiembros() {
		return miembros;
	}
	public void setMiembros(List<sistemas.empleados> miembros) {
		this.miembros = miembros;
	}
	public List<sistemas.tareasPersonales> getTareas() {
		return tareas;
	}
	public void setTareas(List<sistemas.tareasPersonales> tareas) {
		this.tareas = tareas;
	}
	public void agregarMiembro(Empleados empleado) {
        miembros.add(empleado);
    }

    public void quitarMiembro(Empleados empleado) {
        miembros.remove(empleado);
    }

    // Método para asignar una tarea a un empleado en el proyecto
    public void asignarTarea(Empleados empleado, TareasPersonales tarea) {
        if (miembros.contains(empleado)) {
            tarea.setAsignadoA(empleado);
            tareas.add(tarea);
            System.out.println("Tarea asignada exitosamente a " + empleado.getNombres() + " en el proyecto " + nombre);
        } else {
            System.out.println("El empleado no es miembro de este proyecto.");
        }
    }
	

}
