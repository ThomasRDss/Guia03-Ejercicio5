package guia3.ejercicio5;

public class ArchivoDeAudio extends ArchivoMultimedia {

    private String artista;
    private String album;
    private FormatoDeAudio formato;

    public ArchivoDeAudio(String artista, String album, FormatoDeAudio formato, String nombre, double peso, String localizacion, int duracionEnSegundos) {
        super(nombre, peso, localizacion, duracionEnSegundos);
        this.artista = artista;
        this.album = album;
        this.formato = formato;
    }

    @Override
    public String toString() {
        return "ArchivoDeAudio{" + "artista=" + artista + ", album=" + album + ", formato=" + formato + '}';
    }

}