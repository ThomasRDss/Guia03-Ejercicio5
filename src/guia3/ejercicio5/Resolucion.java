
package guia3.ejercicio5;

public class Resolucion {
    int ancho;
    int alto;

    public Resolucion(int ancho, int alto) {
        this.ancho = ancho;
        this.alto = alto;
    }
    
    public boolean isFullHD(){
        return (ancho == 1920 && alto == 1080);
    }

    public String obtenerResolucion(){
        return toString();
    }
    
    @Override
    public String toString() {
        return ancho + "x" + alto;
    }
    
}
