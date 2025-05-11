package ar.edu.unahur.obj2;

import java.util.ArrayList;
import java.util.List;

public class FileSystem {
    private List<IElemento> archivos = new ArrayList<>();

    public void mostrar(){
        archivos.stream().forEach(e -> e.mostrar(0));
    }

    public void agregarElemento(IElemento elem){
        archivos.add(elem);
    }
}
