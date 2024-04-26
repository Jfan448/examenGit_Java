package sistemas;



public class tareasPersonales {
	
	private  String nombreTarea;
	private String fecha_vencimiento;
	private String prioridad_tarea;
	private String estado_tarea;



   public tareasPersonales(String nombreTarea, String fecha_vencimiento, String 
		prioridad_tarea, String estado_tarea){
	   this.nombreTarea =nombreTarea;
	   this.fecha_vencimiento=fecha_vencimiento;
	   this.prioridad_tarea=prioridad_tarea;
	   this.estado_tarea=estado_tarea;
   }



public String getNombreTarea() {
	return nombreTarea;
}



public void setNombreTarea(String nombreTarea) {
	this.nombreTarea = nombreTarea;
}



public String getFecha_vencimiento() {
	return fecha_vencimiento;
}



public void setFecha_vencimiento(String fecha_vencimiento) {
	this.fecha_vencimiento = fecha_vencimiento;
}



public String getPrioridad_tarea() {
	return prioridad_tarea;
}



public void setPrioridad_tarea(String prioridad_tarea) {
	this.prioridad_tarea = prioridad_tarea;
}



public String getEstado_tarea() {
	return estado_tarea;
}



public void setEstado_tarea(String estado_tarea) {
	this.estado_tarea = estado_tarea;
}


   






}