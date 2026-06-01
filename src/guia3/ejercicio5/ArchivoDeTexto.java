package guia3.ejercicio5;

public class ArchivoDeTexto extends Archivo {

    private String codificacion;

    public ArchivoDeTexto(String nombre, double peso, String localizacion, String codificacion) {
        super(nombre, peso, localizacion);
        this.codificacion = codificacion;
    }

    public String getCodificacion() {
        return codificacion;
    }

    
    public void cifrarContenido() {
        System.out.println("Contenido Cifrado");
    }

    @Override
    public String toString() {
        return "ArchivoDeTexto{" + "codificacion=" + codificacion + '}';
    }

    
}