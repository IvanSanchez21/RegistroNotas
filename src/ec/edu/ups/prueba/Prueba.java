package ec.edu.ups.prueba;

import ec.edu.ups.clases.Estudiante;
import ec.edu.ups.clases.Carrera;
import ec.edu.ups.clases.Grupo;
import ec.edu.ups.clases.HistorialCalificacionEstudiante;
import ec.edu.ups.clases.Materia;
import ec.edu.ups.clases.Profesor;
import ec.edu.ups.clases.Sede;

/**
 *
 * @author ivan
 */
public class Prueba {

    public static void main(String args[]) {

        Sede sedeCuenca = new Sede(1, "Sede Cuenca", "Calle vieja", "3012112");
        //CARRERAS
        Carrera computacion = new Carrera(5, "Ingenieria en Computacion", 1, 200, "Ingeniero en ciencias de la computacion");
        Carrera telematica = new Carrera(8, "Telematica", 2, 300, "Ingeniero en telematica");
        Carrera mecatronica = new Carrera(9, "Mecatronica", 6, 200, "Ingeniero en mecatronica");
        //MATERIAS
        Materia programacion = new Materia(4, "Programacion", 6, 240, 3);
        Materia baseDatos = new Materia(2, "Bases de Datos", 4, 180, 3);
        Materia ecuaciones = new Materia(9, "Ecuaciones Diferenciales", 6, 240, 2);
        Materia logica = new Materia(67, "Logica", 4, 160, 1);
        Materia calculo = new Materia(34, "Calculo", 6, 240, 1);
        Materia algebra = new Materia(1, "Fundamentos de programacion", 6, 240, 1);
        //PROFESORES
        Profesor gLeon = new Profesor("Ingeniero", 2500, "Profesor", 23, "Gabriel Leon", "0102351754", "098743441", "Desconocida", "gleon@ups");
        Profesor pIngavelez = new Profesor("Ingeniero", 2500, "Profesor", 45, "Paola Ingavelez", "0106381154", "098243341", "Desconocida", "pingavelez@ups");
        //ESTUDIANTES
        Estudiante eduardo = new Estudiante(4, "Eduardo Ayora", "0106073331", "3012113", "Gustavo Lemus", "aayorao@est.ups.edu.ec");
        Estudiante vinicio = new Estudiante(79, "Vinicio Campoverde", "0109568077", "0993127549", "Cuenca", "vcampoverde@est.ups.edu.ec");
        Estudiante pedro = new Estudiante(12, "Pedro Guamantario", "0106882245", "2274876", "Cuenca", "pguamantario@est.ups.edu.ec");
        Estudiante david = new Estudiante(79, "David Dután", "0104446726", "2670144", "Paute", "ddutan@est.ups.edu.ec");
        //GRUPOS
        Grupo numero1 = new Grupo(4, "Grupo numero 1", 5);
        Grupo numero2 = new Grupo(5, "Grupo numero 2", 8);

        //HISTORIALES
        HistorialCalificacionEstudiante historialEduardoProgramacion = new HistorialCalificacionEstudiante(programacion, eduardo, 9, 9, 10, 9);
        HistorialCalificacionEstudiante historialEduardoDatos = new HistorialCalificacionEstudiante(baseDatos, eduardo, 10, 9, 9, 9);
        HistorialCalificacionEstudiante historialVinicioProgramacion = new HistorialCalificacionEstudiante(programacion, vinicio, 10, 9, 10, 9);
        HistorialCalificacionEstudiante historialPedroAlgebra = new HistorialCalificacionEstudiante(algebra, pedro, 9, 8, 10, 9);
        HistorialCalificacionEstudiante historialPedroLogica = new HistorialCalificacionEstudiante(logica, pedro, 9, 9, 10, 9);
        HistorialCalificacionEstudiante historialDavidCalculo = new HistorialCalificacionEstudiante(calculo, david, 10, 8, 10, 9);
        HistorialCalificacionEstudiante historialDavidEcuaciones = new HistorialCalificacionEstudiante(ecuaciones, david, 9, 9, 9, 9);

        //AÑADIR CARRERAS
        sedeCuenca.agregarCarrera(mecatronica);
        sedeCuenca.agregarCarrera(computacion);
        sedeCuenca.agregarCarrera(telematica);
        //AÑADIR MATERIAS
        mecatronica.agregarMateria(algebra);
        mecatronica.agregarMateria(calculo);
        computacion.agregarMateria(programacion);
        computacion.agregarMateria(baseDatos);
        telematica.agregarMateria(logica);
        telematica.agregarMateria(ecuaciones);
        //AÑADIR GRUPOS
        algebra.setGrupo(numero2);
        calculo.setGrupo(numero2);
        programacion.setGrupo(numero2);
        baseDatos.setGrupo(numero1);
        logica.setGrupo(numero1);
        ecuaciones.setGrupo(numero1);
        //AÑADIR PROFESORES
        algebra.setProfesor(gLeon);
        calculo.setProfesor(pIngavelez);
        programacion.setProfesor(gLeon);
        baseDatos.setProfesor(pIngavelez);
        logica.setProfesor(gLeon);
        ecuaciones.setProfesor(pIngavelez);

        //AÑADIR HISTORIALES
        eduardo.agregarHistorial(historialEduardoProgramacion);
        eduardo.agregarHistorial(historialEduardoDatos);
        vinicio.agregarHistorial(historialVinicioProgramacion);
        pedro.agregarHistorial(historialPedroLogica);
        pedro.agregarHistorial(historialPedroAlgebra);
        david.agregarHistorial(historialDavidCalculo);
        david.agregarHistorial(historialDavidEcuaciones);

        //IMPRIMIR
        System.out.println(sedeCuenca);
        System.out.println(vinicio);
        System.out.println(pedro);
        System.out.println(david);
    }

}
