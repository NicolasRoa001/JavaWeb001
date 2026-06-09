package clases;
public class TrabajadorPorcentaje {
  
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String run;
    private String tipo_trabajo;
    private int sueldo;
    private int ahorro;
    private int compras;
    private int vacaciones;
    private int otros;

    public TrabajadorPorcentaje(String nombre, String apellido1, String apellido2, String run, String tipo_trabajo, int sueldo, int ahorro, int compras, int vacaciones, int otros) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.run = run;
        this.tipo_trabajo = tipo_trabajo;
        this.sueldo = sueldo;
        this.ahorro = ahorro;
        this.compras = compras;
        this.vacaciones = vacaciones;
        this.otros = otros;
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

    public String getTipo_trabajo() {
        return tipo_trabajo;
    }

    public void setTipo_trabajo(String tipo_trabajo) {
        this.tipo_trabajo = tipo_trabajo;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public int getAhorro() {
        return ahorro;
    }

    public void setAhorro(int ahorro) {
        this.ahorro = ahorro;
    }

    public int getCompras() {
        return compras;
    }

    public void setCompras(int compras) {
        this.compras = compras;
    }

    public int getVacaciones() {
        return vacaciones;
    }

    public void setVacaciones(int vacaciones) {
        this.vacaciones = vacaciones;
    }

    public int getOtros() {
        return otros;
    }

    public void setOtros(int otros) {
        this.otros = otros;
    }

    @Override
    public String toString() {
        return "TrabajadorPorcentaje{" + "nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2 + ", run=" + run + ", tipo_trabajo=" + tipo_trabajo + ", sueldo=" + sueldo + ", ahorro=" + ahorro + ", compras=" + compras + ", vacaciones=" + vacaciones + ", otros=" + otros + '}';
    }
}
