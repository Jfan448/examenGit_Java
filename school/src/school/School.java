package school;

import java.util.Scanner;

class Estudiante {
    String nombre;
    int edad;
    double[] calificaciones;

    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.calificaciones = new double[3]; 
    }

    public void ingresarCalificaciones(double calificacion1, double calificacion2, double calificacion3) {
        calificaciones[0] = calificacion1;
        calificaciones[1] = calificacion2;
        calificaciones[2] = calificacion3;
    }

    public double calcularPromedio() {
        double suma = 0;
        for (double calificacion : calificaciones) {
            suma += calificacion;
        }
        return suma / calificaciones.length;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Promedio: " + calcularPromedio());
    }
}

public class School {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Estudiante[] estudiantes = new Estudiante[3]; 

        while (true) {
            System.out.println("1. Agregar estudiante");
            System.out.println("2. Modificar calificaciones");
            System.out.println("3. Mostrar informe");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opcion: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    agregarEstudiante(estudiantes);
                    break;
                case 2:
                    modificarCalificaciones(estudiantes);
                    break;
                case 3:
                    mostrarInforme(estudiantes);
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    return;
                default:
                    System.out.println("Opcion invalida");
            }
        }
    }

    public static void agregarEstudiante(Estudiante[] estudiantes) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < estudiantes.length; i++) {
            if (estudiantes[i] == null) {
                System.out.print("Nombre: ");
                String nombre = scanner.next();
                System.out.print("Edad: ");
                int edad = scanner.nextInt();
                estudiantes[i] = new Estudiante(nombre, edad);
                System.out.println("Estudiante agregado correctamente");
                return;
            }
        }
        System.out.println("No se pueden agregar mas estudiantes");
    }

    public static void modificarCalificaciones(Estudiante[] estudiantes) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Numero del estudiante (0-2): ");
        int indice = scanner.nextInt();
        if (indice >= 0 && indice < estudiantes.length && estudiantes[indice] != null) {
            System.out.print("Calificacion 1: ");
            double calificacion1 = scanner.nextDouble();
            System.out.print("Calificacion 2: ");
            double calificacion2 = scanner.nextDouble();
            System.out.print("Calificacion 3: ");
            double calificacion3 = scanner.nextDouble();
            estudiantes[indice].ingresarCalificaciones(calificacion1, calificacion2, calificacion3);
            System.out.println("Calificaciones modificadas");
        } else {
            System.out.println("Estudiante no encontrado");
        }
    }

    public static void mostrarInforme(Estudiante[] estudiantes) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Numero del estudiante (0-2): ");
        int indice = scanner.nextInt();
        if (indice >= 0 && indice < estudiantes.length && estudiantes[indice] != null) {
            estudiantes[indice].mostrarInformacion();
        } else {
            System.out.println("Estudiante no encontrado");
        }
    }
}
