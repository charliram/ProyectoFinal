 
package misclases;
 
public class nHues implements Comparable{
    String nombre;
   
    int numhab;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumhab() {
        return numhab;
    }

    public void setNumhab(int numhab) {
        this.numhab = numhab;
    }

    @Override
    public String toString() {
        return "\nNombre=" + nombre + ", Número de habitación=" + numhab ;
    }
    


    @Override
    public int compareTo(Object t) {
    nHues obj =  (nHues)t;
        return this.getNombre().compareTo(obj.getNombre());
        }
    
    
    
    
}
