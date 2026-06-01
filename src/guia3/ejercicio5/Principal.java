package guia3.ejercicio5;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {
        
        // 1. Instanciamos la Computadora que albergará la colección
        Computadora miPC = new Computadora();

        // 2. Generamos objetos de tipo Archivo (aprovechando el polimorfismo)
        
        // --- Archivos de Texto ---
        // Uno UTF-8 para probar el cifrado (Punto C) y otro ANSI para validar que se excluya.
        ArchivoDeTexto txtApuntes = new ArchivoDeTexto("apuntes.txt", 1.5, "C:/MisDocumentos", "UTF-8");
        ArchivoDeTexto txtConfig = new ArchivoDeTexto("config.ini", 0.5, "C:/Windows", "ANSI");

        // --- Archivos de Audio ---
        ArchivoDeAudio audioRock = new ArchivoDeAudio("Banda Rock", "Album Hit", FormatoDeAudio.MP3, "cancion1.mp3", 5.2, "C:/Musica", 240);
        ArchivoDeAudio audioPodcast = new ArchivoDeAudio("Podcast Tech", "Episodio 1", FormatoDeAudio.WAV, "podcast.wav", 55.0, "C:/Descargas", 3600);

        // --- Archivos de Video ---
        // Uno con resolución FullHD (1920x1080) para el Punto E, y otro estándar.
        Resolucion r1 = new Resolucion(1920,1080);
        Resolucion r2 = new Resolucion(1366,768);
        ArchivoDeVideo videoVacaciones = new ArchivoDeVideo(r1, FormatoDeVideo.MP4, "vacaciones.mp4", 1500.0, "C:/Videos", 600);
        ArchivoDeVideo videoTutorial = new ArchivoDeVideo(r2, FormatoDeVideo.MKV, "tutorial.mkv", 400.0, "C:/Videos", 300);

        // 3. Agregamos los archivos a la computadora (Upcasting implícito)
        miPC.agregarArcivo(txtApuntes);
        miPC.agregarArcivo(txtConfig);
        miPC.agregarArcivo(audioRock);
        miPC.agregarArcivo(audioPodcast);
        miPC.agregarArcivo(videoVacaciones);
        miPC.agregarArcivo(videoTutorial);

        // 4. Ejecución de pruebas según la consigna

        System.out.println("----- PRUEBA A: cerrarTodos() -----");
        txtApuntes.abrirArchivo();
        videoVacaciones.abrirArchivo();
        System.out.println("Antes de cerrar, txtApuntes esta abierto?: " + txtApuntes.isEstaAbierto());
        miPC.cerrarTodos(); // Debería cerrarlos todos e imprimir el mensaje.
        System.out.println("Despues de cerrar, txtApuntes esta abierto?: " + txtApuntes.isEstaAbierto());
        System.out.println();

        System.out.println("----- PRUEBA B: cantArchivosDeTexto() -----");
        // Tenemos txtApuntes y txtConfig, deberia devolver 2.
        int cantTxt = miPC.cantArchivosDeTexto();
        System.out.println("Cantidad de archivos de texto en la PC: " + cantTxt);
        System.out.println();

        System.out.println("----- PRUEBA C: cifrarArchivos() -----");
        // Solo txtApuntes es "UTF-8", debería imprimir "Contenido Cifrado" una sola vez.
        miPC.cifrarArchivos(); 
        System.out.println();

        System.out.println("----- PRUEBA D: duracionPromedio() -----");
        // Duraciones: 240 + 3600 + 600 + 300 = 4740 segundos.
        // 4740 / 4 archivos multimedia = 1185 segundos de promedio.
        int promedio = miPC.duracionPromedio();
        System.out.println("La duracion promedio de los archivos multimedia es: " + promedio + " segundos.");
        System.out.println();

        System.out.println("----- PRUEBA E: videosFullHD() -----");
        // Solo videoVacaciones es FullHD (1920x1080)
        ArrayList<ArchivoDeVideo> videosFHD = miPC.videosFullHD();
        System.out.println("Cantidad de videos FullHD encontrados: " + videosFHD.size());
        
        // Iteramos para validar que trajo el correcto
        for (ArchivoDeVideo video : videosFHD) {
            System.out.println("- Video FullHD recuperado: Res " + video.obtenerResolucion());
        }
    }
}