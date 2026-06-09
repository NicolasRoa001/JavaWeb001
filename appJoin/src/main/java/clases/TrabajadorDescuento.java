package clases;
public class TrabajadorDescuento {
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String run;
    private int sueldo;
    private int afp;
    private int fonasa;

    public TrabajadorDescuento() {
    }

    public TrabajadorDescuento(String nombre, String apellido1, String apellido2, String run, int sueldo, int afp, int fonasa) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.run = run;
        this.sueldo = sueldo;
        this.afp = afp;
        this.fonasa = fonasa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getRun() {
        return run;
    }

    public void setRun(String run) {
        this.run = run;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public int getAfp() {
        return afp;
    }

    public void setAfp(int afp) {
        this.afp = afp;
    }

    public int getFonasa() {
        return fonasa;
    }

    public void setFonasa(int fonasa) {
        this.fonasa = fonasa;
    }

    @Override
    public String toString() {
        return "TrabajadorDescuento{" + "nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2 + ", run=" + run + ", sueldo=" + sueldo + ", afp=" + afp + ", fonasa=" + fonasa + '}';
    }
}
