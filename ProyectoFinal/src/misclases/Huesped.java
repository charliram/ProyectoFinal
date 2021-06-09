
package misclases;
import java.util.Calendar;

public class Huesped {
    String nombre;
    int tipohab;
    String ciudadOrigen;
    Calendar ingreso;
    int personas;
    int estancia;
    int piso;
    int numhab;

    public Huesped(String nombre, int tipohab, String ciudadOrigen, Calendar ingreso, int personas, int estancia, int piso, int numhab) {
        this.nombre = nombre;
        this.tipohab = tipohab;
        this.ciudadOrigen = ciudadOrigen;
        this.ingreso = ingreso;
        this.personas = personas;
        this.estancia = estancia;
        this.piso = piso;
        this.numhab = numhab;
    }

    public Huesped() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTipohab() {
        return tipohab;
    }

    public void setTipohab(int tipohab) {
        this.tipohab = tipohab;
    }

    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    public void setCiudadOrigen(String ciudadOrigen) {
        this.ciudadOrigen = ciudadOrigen;
    }

    public Calendar getIngreso() {
        return ingreso;
    }

    public void setIngreso(Calendar ingreso) {
        this.ingreso = ingreso;
    }

    public int getPersonas() {
        return personas;
    }

    public void setPersonas(int personas) {
        this.personas = personas;
    }

    public int getEstancia() {
        return estancia;
    }

    public void setEstancia(int estancia) {
        this.estancia = estancia;
    }

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public int getNumhab() {
        return numhab;
    }

    public void setNumhab(int numhab) {
        this.numhab = numhab;
    }
           
    
}

