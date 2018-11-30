package lab8_stephaniemartinez;

import java.io.Serializable;

public class Clientes implements Serializable {

    private String nombre;
    private String apellido;
    private String tarjeta;
    private int billetera;
    private String unitec;
    private int cuenta;
    private static final long SerialVersionUID = 777L;

    public Clientes() {
    }

    public Clientes(String nombre, String apellido, String tarjeta, int billetera, String unitec) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.tarjeta = tarjeta;
        this.billetera = billetera;
        this.unitec = unitec;
    }

    public double getBilletera() {
        return billetera;
    }

    public void setBilletera(int billetera) {
        this.billetera = billetera;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(String tarjeta) {
        this.tarjeta = tarjeta;
    }

    public String isUnitec() {
        return unitec;
    }

    public void setUnitec(String unitec) {
        this.unitec = unitec;
    }

    public int getCuenta() {
        return cuenta;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", apellido: " + apellido + ", tarjeta:" + tarjeta + ", billetera: " + billetera + ", alumno de unitec: " + unitec + "\n";
    }

}
