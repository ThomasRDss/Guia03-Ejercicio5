package guia3.ejercicio5;

public class ArchivoDeVideo extends ArchivoMultimedia {

    private Resolucion resolucion;
    private FormatoDeVideo formato;

    public ArchivoDeVideo(Resolucion resolucion, FormatoDeVideo formato, String nombre, double peso, String localizacion, int duracionEnSegundos) {
        super(nombre, peso, localizacion, duracionEnSegundos);
        this.resolucion = resolucion;
        this.formato = formato;
    }

    public String obtenerResolucion(){
        return resolucion.obtenerResolucion();
    }

    @Override
    public String toString() {
        return "ArchivoDeVideo{" + "resolucion=" + resolucion + ", formato=" + formato + '}';
    }

  
        
}