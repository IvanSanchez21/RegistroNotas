
package ec.edu.ups.clases;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ivan
 */
public class Carrera {
    
    private int codigo;
    private String nombre;
    private int numeroSemestre;
    private int numeroEstudiantes;
    private String titulo;
    private List<Materia> materias;

    public Carrera(int codigo, String nombre, int numeroSemestre, int numeroEstudiantes, String titulo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.numeroSemestre = numeroSemestre;
        this.numeroEstudiantes = numeroEstudiantes;
        this.titulo = titulo;
        materias = new ArrayList<>();
    }
    
    public Carrera(){
        materias = new ArrayList<>();
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroSemestre() {
        return numeroSemestre;
    }

    public void setNumeroSemestre(int numeroSemestre) {
        this.numeroSemestre = numeroSemestre;
    }

    public int getNumeroEstudiantes() {
        return numeroEstudiantes;
    }

    public void setNumeroEstudiantes(int numeroEstudiantes) {
        this.numeroEstudiantes = numeroEstudiantes;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public void agregarMateria(Materia materia){
        materias.add(materia);
    }

    @Override
    public String toString() {
        return "Carrera{" + "codigo=" + codigo + ", nombre=" + nombre + ", numeroSemestre=" + numeroSemestre + ", numeroEstudiantes=" + numeroEstudiantes + ", titulo=" + titulo + ", materias=" + materias + '}';
    }
    
    
}
