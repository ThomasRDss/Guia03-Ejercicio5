package guia3.ejercicio5;

public abstract class ArchivoMultimedia extends Archivo {

    private int duracionEnSegundos;
    private boolean estaEnReproduccion;

    public ArchivoMultimedia(String nombre, double peso, String localizacion, int duracionEnSegundos) {
        super(nombre, peso, localizacion);
        this.duracionEnSegundos = duracionEnSegundos;
        this.estaEnReproduccion = false;
    }

    public void reproducir() {
        System.out.println("Reproduciendo...");
    }

    public void detener() {
        System.out.println("Pausa...");
    }

    public int getDuracionEnSegundos() {
        return duracionEnSegundos;
    }

    @Override
    public String toString() {
        return "ArchivoMultimedia{" + "duracionEnSegundos=" + duracionEnSegundos + ", estaEnReproduccion=" + estaEnReproduccion + '}';
    }

    
}