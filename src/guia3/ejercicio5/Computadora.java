package guia3.ejercicio5;

import java.util.ArrayList;

public class Computadora {

    private ArrayList<Archivo> archivos;

    public Computadora() {
        this.archivos = new ArrayList<Archivo>();
    }

    public void agregarArcivo(Archivo archivo){
        archivos.add(archivo);
    }
    
    public void cerrarTodos(){
        for (Archivo archivo : archivos) {
            if(archivo.isEstaAbierto()){
                archivo.cerrarArchivo();
            }
        }
        System.out.println("Cerrando todos los archivos...");
    }
    
    public int cantArchivosDeTexto(){
        int cantidadTotal = 0;
        int i = 0;
        while(i < archivos.size()){
            if(archivos.get(i) instanceof ArchivoDeTexto){
                cantidadTotal++;
            }
            i++;
        }
        return cantidadTotal;
    }
    
    public void cifrarArchivos(){
        String codificacionRequerida = "UTF-8";
        int i = 0;
        while(i < archivos.size()) {
            if(archivos.get(i) instanceof ArchivoDeTexto){
                ArchivoDeTexto archivoTexto = (ArchivoDeTexto) archivos.get(i);
                if(archivoTexto.getCodificacion().equalsIgnoreCase(codificacionRequerida))
                    archivoTexto.cifrarContenido();
            }
            i++;
        }
    }
    
    public int duracionPromedio(){
        int i = 0;
        int acumulador = 0;
        int cantMultimedia = 0;
        while(i < archivos.size()){
            if(archivos.get(i) instanceof ArchivoMultimedia){
                ArchivoMultimedia archivo = (ArchivoMultimedia) archivos.get(i);
                acumulador += archivo.getDuracionEnSegundos();
                cantMultimedia++;
            }
            i++;
        }
        return (cantMultimedia == 0) ? 0 : acumulador / cantMultimedia;
    }
    
    public ArrayList<ArchivoDeVideo> videosFullHD(){
        ArrayList<ArchivoDeVideo> listaARetornar = new ArrayList<>();
        String fullHD = "1920x1080";
        for (Archivo archivo : archivos) {
            if(archivo instanceof ArchivoDeVideo){
                ArchivoDeVideo archivoVideo = (ArchivoDeVideo) archivo;
                if(archivoVideo.obtenerResolucion().equalsIgnoreCase(fullHD)){
                    listaARetornar.add(archivoVideo);
                }
            }
        }
        return listaARetornar;
    }

    @Override
    public String toString() {
        return "Computadora{" + "archivos=" + archivos + '}';
    }
    
    
}