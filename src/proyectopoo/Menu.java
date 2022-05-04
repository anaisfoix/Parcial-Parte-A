package proyectopoo;

import java.util.Scanner;

public class Menu {
    public int Menu(){
        /*Se debe hacer un menu ́ para el sistema con las siguientes funcionalidades: (1) 
        Agregar (Create Elemento (s)), (2)
        Mostrar por pantalla listado de elementos, para cada una de las dos colecciones anidadas.*/        
        Funciones prueba = new Funciones();
        Scanner Entrada= new Scanner(System.in);
        System.out.println("BIENVENIDO A ...");
        System.out.println("1.- Agregar un elemento");        
        System.out.println("2.- Mostrar elementos");
        System.out.println("3.- Actualizar elemento");
        System.out.println("4.- Borrar Elemento");
        System.out.println("5.- Generar Reporte Curso");
        System.out.println("6.- Terminar Programa");
        int Opcion=Entrada.nextInt();
        switch (Opcion) {
            case 1:
                System.out.println("¿Qué desea agregar?");
                System.out.println("1.- Alumno");
                System.out.println("2.- Profesor");
                System.out.println("3.- Curso");
                System.out.println("4.- Oferta Laboral");
                Opcion=Entrada.nextInt();
                switch(Opcion)
                {
                    case 1 : return 1;
                    case 2 : return 2;
                    case 3 : return 3;
                    case 4 : return 4;
                }   break;
            case 2:
                System.out.println("¿Qué desea imprimir?");
                System.out.println("1.- Listado de alumnos");
                System.out.println("2.- Listado de profesores");
                System.out.println("3.- Listado de cursos");
                System.out.println("4.- Listado de Ofertas Laborales");
                Opcion=Entrada.nextInt();
                switch(Opcion)
                {
                    case 1 : return 5;
                    case 2 : return 6;
                    case 3 : return 7;
                    case 4 : return 8;
                }   break;
            case 3:
                System.out.println("¿Qué desea Actualizar/Modificar?");
                System.out.println("1.- Estudiante del listado de alumnos");
                System.out.println("2.- Profesor del listado de profesores");
                System.out.println("3.- Curso del listado de cursos");
                System.out.println("4.- Oferta Laboral del listado de Ofertas Laborales");
                Opcion=Entrada.nextInt();
                switch(Opcion)
                {
                    case 1 : return 9;
                    case 2 : return 10;
                    case 3 : return 11;
                    case 4 : return 12;
                }   break;
            case 4:
                System.out.println("¿Qué desea Borrar?");
                System.out.println("1.- Estudiante del listado de alumnos");
                System.out.println("2.- Profesor del listado de profesores");
                System.out.println("3.- Curso del listado de cursos");
                System.out.println("4.- Oferta Laboral del listado de Ofertas Laborales");
                Opcion=Entrada.nextInt();
                switch(Opcion)
                {
                    case 1 : return 13;
                    case 2 : return 14;
                    case 3 : return 15;
                    case 4 : return 16;
                }   break;
            case 5:
                return 17;
            case 6:
                return 18;
            default:
                System.out.println("OPCIÓN INCORRECTA");
                break;
        }
        return 19;
    }
}
