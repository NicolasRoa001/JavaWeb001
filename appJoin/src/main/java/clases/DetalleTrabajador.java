package clases;
public class DetalleTrabajador {
    private int trabajador_id;
    private String nombre;
    private String run;

    public DetalleTrabajador(int trabajador_id, String nombre, String run) {
        this.trabajador_id = trabajador_id;
        this.nombre = nombre;
        this.run = run;
    }

    public int getTrabajador_id() {
        return trabajador_id;
    }

    public void setTrabajador_id(int trabajador_id) {
        this.trabajador_id = trabajador_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRun() {
        return run;
    }

    public void setRun(String run) {
        this.run = run;
    }

    @Override
    public String toString() {
        return "DetalleTrabajador{" + "trabajador_id=" + trabajador_id + ", nombre=" + nombre + ", run=" + run + '}';
    }
    
}
