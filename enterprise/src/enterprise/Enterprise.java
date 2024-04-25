package enterprise;
import java.util.Scanner;

class Empleado {
    String nombre;
    int edad;
    double salario;

    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Salario: $" + salario);
    }

    public void modificarSalario(double nuevoSalario) {
        salario = nuevoSalario;
        System.out.println("El salario ha sido modificado");
    }
}

public class Enterprise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Empleado[] empleados = new Empleado[3]; 

        while (true) {
            System.out.println("1. Agregar empleado");
            System.out.println("2. Modificar salario");
            System.out.println("3. Mostrar informe");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opcion: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    agregarEmpleado(empleados);
                    break;
                case 2:
                    modificarSalario(empleados);
                    break;
                case 3:
                    mostrarInforme(empleados);
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    return;
                default:
                    System.out.println("Opcion invalida");
            }
        }
    }

    public static void agregarEmpleado(Empleado[] empleados) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < empleados.length; i++) {
            if (empleados[i] == null) {
                System.out.print("Nombre: ");
                String nombre = scanner.next();
                System.out.print("Edad: ");
                int edad = scanner.nextInt();
                System.out.print("Salario: $");
                double salario = scanner.nextDouble();
                empleados[i] = new Empleado(nombre, edad, salario);
                System.out.println("Empleado agregado correctamente");
                return;
            }
        }
        System.out.println("No se pueden agregar mas empleados");
    }

    public static void modificarSalario(Empleado[] empleados) {
        Scanner scanner = new Scanner(System.in);       
        System.out.print("Numero del empleado (0-2): ");
        int indice = scanner.nextInt();
        if (indice >= 0 && indice < empleados.length && empleados[indice] != null) {
            System.out.print("Nuevo salario: $");
            double nuevoSalario = scanner.nextDouble();
            empleados[indice].modificarSalario(nuevoSalario);
        } else {
            System.out.println("Empleado no encontrado");
        }
    }

    public static void mostrarInforme(Empleado[] empleados) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n--- Mostrar informe de un empleado ---");
        System.out.print("Numero del empleado (0-2): ");
        int indice = scanner.nextInt();
        if (indice >= 0 && indice < empleados.length && empleados[indice] != null) {
            empleados[indice].mostrarInformacion();
        } else {
            System.out.println("Empleado no encontrado");
        }
    }
}
