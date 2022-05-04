package proyectopoo;

import java.io.IOException;

/*
    Integrantes:
    
    Francisco Andres Muñoz Alarcon 20.242.456-2
    Anais Monserrat Foix Monardes  20.834.761-6
    Sofia Carolina Menzel Madrid   20.478.743-3
*/

public class ProyectoPOO {
    public static void main(String[] args)throws IOException { 
        Funciones prueba = new Funciones();
        Menu pruebaMenu = new Menu();
        int Opcion = 0 ;
        prueba.leerCursos();
        prueba.LeerProfesores();     
        prueba.LeerEstudiantes();     
        prueba.leerOfertaLaboral();
        while (Opcion != 18){
            Opcion = pruebaMenu.Menu(); 
            switch(Opcion)
            {    
                case 1 : prueba.CrearEstudiante();
                         break;
                case 2 : prueba.CrearProfesor();
                         break;
                case 3 : prueba.CrearCurso();
                         break;
                case 4 : prueba.CrearOfertaLaboral();
                         break;
                case 5 : prueba.mostrarEstudiantes();
                         break;
                case 6 : prueba.mostrarProfesores();
                         break;
                case 7 : prueba.mostrarCursos();
                         break;
                case 8 : prueba.mostrarOfertasLaborales(); 
                         break;
                case 9 : prueba.ModificarEstudiante();
                         break;
                case 10: prueba.ModificarProfesor();
                         break;
                case 11: prueba.ModificarCurso();
                         break;
                case 12: prueba.ModificarOfertaLaboral();
                         break;
                case 13: prueba.EliminarEstudiante();
                         break;
                case 14: prueba.EliminarProfesor();
                         break;
                case 15: prueba.EliminarCurso();
                         break;
                case 16: prueba.EliminarOfertaLaboral();
                         break;
                case 17 : prueba.GenerarReporteCurso();
                          break;
            }
        }
    }    
}
