package guia3.ejercicio5;

public class Archivo {

    private String nombre;
    private double peso;
    private String localizacion;
    private boolean estaAbierto;

    public Archivo(String nombre, double peso, String localizacion) {
        this.nombre = nombre;
        this.peso = peso;
        this.localizacion = localizacion;
        this.estaAbierto = false;
    }

    public void abrirArchivo() {
        estaAbierto = !estaAbierto;
    }

    public void cerrarArchivo() {
        if(estaAbierto)
            estaAbierto = !estaAbierto;
    }

    public void moverUbicacion() {
        System.out.println("moviendo de lugar...");
    }

    public boolean isEstaAbierto() {
        return estaAbierto;
    }

    @Override
    public String toString() {
        return "Archivo{" + "nombre=" + nombre + ", peso=" + peso + ", localizacion=" + localizacion + ", estaAbierto=" + estaAbierto + '}';
    }
    
    
}