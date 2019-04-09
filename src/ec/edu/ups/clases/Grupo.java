
package ec.edu.ups.clases;

/**
 *
 * @author ivan
 */
public class Grupo {
    
    private int codigo;
    private String nombre;
    private int cupo;

    public Grupo(int codigo, String nombre, int cupo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.cupo = cupo;
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

    public int getCupo() {
        return cupo;
    }

    public void setCupo(int cupo) {
        this.cupo = cupo;
    }

    @Override
    public String toString() {
        return "\nGrupo{" + "codigo=" + codigo + ", nombre=" + nombre + ", cupo=" + cupo + '}';
    }
    
}
