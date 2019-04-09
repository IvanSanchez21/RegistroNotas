
package ec.edu.ups.clases;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ivan
 */
public class Estudiante extends Persona{
    
    private Carrera carrera;
    private List<HistorialCalificacionEstudiante> historial;
    

    public Estudiante(){
        historial = new ArrayList<>();
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }
    
    public Estudiante(int codigo){
        super(codigo);
    }
    
    public Estudiante(int codigo, String nombre, String cedula){
        super(codigo, nombre, cedula);
    }

    public Estudiante(int codigo, String nombre, String cedula, String telefono, String direccion, String correo) {
        super(codigo, nombre, cedula, telefono, direccion, correo);
        historial = new ArrayList<>();
        //this.carrera = carrera;
    }
    
    public void agregarHistorial(HistorialCalificacionEstudiante historial){
        this.historial.add(historial);
    }
    
/*
    @Override
    public String toString() {
        return "Estudiante{" + "codigo=" + codigo + ", nombre=" + nombre + ", cedula=" + cedula + ", telefono=" + telefono + ", direccion=" + direccion + ", correo=" + correo + ", sede=" + sede + "carrera=" + carrera + '}';
    }
    */

    @Override
    public String toString() {
        return "\nEstudiante{" + "historial=" + historial + '}';
    }
    
}
