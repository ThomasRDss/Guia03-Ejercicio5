package guia3.ejercicio5;

public class ArchivoDeTexto extends Archivo {

    private String codificacion;

    public ArchivoDeTexto(String nombre, double peso, String localizacion, String codificacion) {
        super(nombre, peso, localizacion);
        this.codificacion = codificacion;
    }

    public boolean isUTF8() {
        return codificacion.equalsIgnoreCase("UTF-8");
    }

    
    public void cifrarContenido() {
        System.out.println("Contenido Cifrado");
    }

    @Override
    public String toString() {
        return "ArchivoDeTexto{" + "codificacion=" + codificacion + '}';
    }

    
}