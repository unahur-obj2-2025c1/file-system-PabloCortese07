package ar.edu.unahur.obj2;

public class Archivo implements IElemento {
    private String nombre;
    private Integer tamanio;
    private String extension;

    public Archivo(String nombre, String extension, Integer tamanio) {
        this.nombre = nombre;
        this.tamanio = tamanio;
        this.extension = extension;
    }

    public Archivo(String nombre, Integer tamanio, String extension) {
        this.nombre = nombre;
        this.tamanio = tamanio;
        this.extension = extension;
    }

    @Override
    public Integer tamanio(){
        return tamanio;
    }

    @Override 
    public String nombre(){
        return this.nombre + "." + this.extension; 
    }

    @Override
    public IElemento archivoMasPesado(){
        return this;
    }

    @Override
    public void mostrar(Integer identacion) {
        System.out.println(" ".repeat(identacion) + "├ " + this.nombre());
    }

        @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Archivo other = (Archivo) obj;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        if (tamanio == null) {
            if (other.tamanio != null)
                return false;
        } else if (!tamanio.equals(other.tamanio))
            return false;
        if (extension == null) {
            if (other.extension != null)
                return false;
        } else if (!extension.equals(other.extension))
            return false;
        return true;
    }
}
