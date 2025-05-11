package ar.edu.unahur.obj2;

public class Main {
    public static void main(String[] args) {
        Carpeta root = new Carpeta("root");
        Carpeta carpetaA1 = new Carpeta("Carpeta A Nivel 1");
        Carpeta carpetaB1 = new Carpeta("Carpeta B Nivel 1");
        Carpeta carpetaA2 = new Carpeta("Carpeta A Nivel 2");

        Archivo file1 = new Archivo("Dibujo-A", "jpg", 250);
        Archivo file2 = new Archivo("Notas", "txt", 50);
        Archivo file3 = new Archivo("Rock", "mp3", 300);
        Archivo file4 = new Archivo("Imagen-A", "jpg", 240);
        Archivo file5 = new Archivo("Posticks", "txt", 50);
        Archivo file6 = new Archivo("Video-Parte-I", "mp4", 600);
        Archivo file7 = new Archivo("Video-Parte-II", "mp4", 680);
        Archivo file8 = new Archivo("Rap", "mp3", 300);
        Archivo file9 = new Archivo("Notas Rapidas", "txt", 120);

        root.agregar(file2);
        root.agregar(file1);
        root.agregar(carpetaA1);
        root.agregar(carpetaB1);

        carpetaA1.agregar(file4);
        carpetaA1.agregar(file3);

        carpetaB1.agregar(file7);
        carpetaB1.agregar(carpetaA2);
        carpetaA2.agregar(file9);
        carpetaA2.agregar(file8);

        carpetaB1.agregar(file6);
        carpetaB1.agregar(file5);

        FileSystem sistema = new FileSystem();
        sistema.agregarElemento(root);
        sistema.mostrar();
        
    }
}