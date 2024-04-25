package proyects;
import java.util.Scanner;

class Tarea {
    String descripcion;
    boolean completada;

    public Tarea(String descripcion) {
        this.descripcion = descripcion;
        this.completada = false;
    }

    public void completarTarea() {
        this.completada = true;
        System.out.println("La tarea \"" + descripcion + "\" ha sido completada");
    }
}

class MiembroEquipo {
    String nombre;

    public MiembroEquipo(String nombre) {
        this.nombre = nombre;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre del miembro: " + nombre);
    }
}


class Proyecto {
    String nombre;
    int cantidadTareas;
    int tareasCompletadas;
    Tarea[] tareas;
    MiembroEquipo[] equipo;

    public Proyecto(String nombre, int cantidadTareas) {
        this.nombre = nombre;
        this.cantidadTareas = cantidadTareas;
        this.tareasCompletadas = 0;
        this.tareas = new Tarea[cantidadTareas];
        this.equipo = new MiembroEquipo[3];
    }

    public void mostrarInforme() {
        System.out.println("Total de tareas: " + cantidadTareas);
        System.out.println("Tareas completadas: " + tareasCompletadas);
    }

    public void asignarTarea(Tarea tarea, MiembroEquipo miembro) {
        for (int i = 0; i < tareas.length; i++) {
            if (tareas[i] == null) {
                tareas[i] = tarea;
                System.out.println("Tarea " + tarea.descripcion +  " asignada a " + miembro.nombre);
                return;
            }
        }
        System.out.println("No se pueden asignar mas tareas");
    }

    public void completarTarea() {
        if (tareasCompletadas < cantidadTareas) {
            tareasCompletadas++;
            System.out.println("Se ha completado una tarea");
        } else {
            System.out.println("No se pueden completar más tareas ");
        }
    }
}

public class Proyects {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Proyecto[] proyectos = new Proyecto[3];

        while (true) {
            System.out.println("1. Crear nuevo proyecto");
            System.out.println("2. Completar tarea");
            System.out.println("3. Asignar tarea a un miembro del equipo");
            System.out.println("4. Crear nuevo miembro del equipo");
            System.out.println("5. Mostrar informe");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opcion: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    crearProyecto(proyectos);
                    break;
                case 2:
                    completarTarea(proyectos);
                    break;
                case 3:
                    asignarTarea(proyectos);
                    break;
                case 4:
                    crearMiembroEquipo();
                    break;
                case 5:
                    mostrarInforme(proyectos);
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    return;
                default:
                    System.out.println("Opcion invalida");
            }
        }
    }

    public static void crearProyecto(Proyecto[] proyectos) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < proyectos.length; i++) {
            if (proyectos[i] == null) {
                System.out.print("Nombre del proyecto: ");
                String nombre = scanner.next();
                System.out.print("Cantidad de tareas: ");
                int cantidadTareas = scanner.nextInt();
                proyectos[i] = new Proyecto(nombre, cantidadTareas);
                System.out.println("Proyecto creado");
                return;
            }
        }
        System.out.println("No se pueden crear más proyectos");
    }

    public static void completarTarea(Proyecto[] proyectos) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Numero del proyecto (0-2): ");
        int indiceProyecto = scanner.nextInt();
        if (indiceProyecto >= 0 && indiceProyecto < proyectos.length && proyectos[indiceProyecto] != null) {
            proyectos[indiceProyecto].completarTarea();
        } else {
            System.out.println("Proyecto no encontrado.");
        }
    }

    public static void asignarTarea(Proyecto[] proyectos) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Numero del proyecto (0-2): ");
        int indiceProyecto = scanner.nextInt();
        if (indiceProyecto >= 0 && indiceProyecto < proyectos.length && proyectos[indiceProyecto] != null) {
            System.out.print("Descripcion de la tarea: ");
            String descripcionTarea = scanner.next();
            Tarea tarea = new Tarea(descripcionTarea);
            System.out.print("Numero del miembro del equipo (0-2): ");
            int indiceEmpleado = scanner.nextInt();
            if (indiceEmpleado >= 0 && indiceEmpleado < proyectos[indiceProyecto].equipo.length && proyectos[indiceProyecto].equipo[indiceEmpleado] != null) {
                proyectos[indiceProyecto].asignarTarea(tarea, proyectos[indiceProyecto].equipo[indiceEmpleado]);
            } else {
                System.out.println("Miembro del equipo no encontrado.");
            }
        } else {
            System.out.println("Proyecto no encontrado.");
        }
    }

    public static void crearMiembroEquipo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nombre del miembro: ");
        String nombre = scanner.next();
        MiembroEquipo nuevoMiembro = new MiembroEquipo(nombre);
        System.out.println("Miembro del equipo creado");
    }

    public static void mostrarInforme(Proyecto[] proyectos) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Numero del proyecto (0-2): ");
        int indiceProyecto = scanner.nextInt();
        if (indiceProyecto >= 0 && indiceProyecto < proyectos.length && proyectos[indiceProyecto] != null) {
            proyectos[indiceProyecto].mostrarInforme();
        } else {
            System.out.println("Proyecto no encontrado.");
        }
    }
}
