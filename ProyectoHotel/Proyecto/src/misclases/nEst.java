
package misclases;


public class nEst implements Comparable{
    String nombre;
    Integer estancia;
    int numhab;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEstancia() {
        return estancia;
    }

    public void setEstancia(Integer estancia) {
        this.estancia = estancia;
    }

    public int getNumhab() {
        return numhab;
    }

    public void setNumhab(int numhab) {
        this.numhab = numhab;
    }

    @Override
    public String toString() {
        return "\nNombre=" + nombre + ", Número de habitación=" + numhab + ", Estancia="+ estancia;
    }

   

    @Override
    public int compareTo(Object t) {
        nEst obj =  (nEst)t;
        return this.getEstancia().compareTo(obj.getEstancia());
    }
    
    

}
