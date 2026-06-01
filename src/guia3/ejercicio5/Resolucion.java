
package guia3.ejercicio5;

public class Resolucion {
    int ancho;
    int alto;

    public Resolucion(int ancho, int alto) {
        this.ancho = ancho;
        this.alto = alto;
    }
    
    public String obtenerResolucion(){
        return ancho + "x" + alto;
    }

    @Override
    public String toString() {
        return "Resolucion{" + "ancho=" + ancho + ", alto=" + alto + '}';
    }
    
}
