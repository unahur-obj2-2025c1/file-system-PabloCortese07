package ar.edu.unahur.obj2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Carpeta implements IElemento {
    private String name;
    private List<IElemento> elementos = new ArrayList<>();

    public Carpeta(String name){
        this.name = name;
    }

    public void agregar(IElemento elem){
        elementos.add(elem);
    }

    @Override 
    public String nombre(){
        return this.name; 
    }

    @Override
    public Integer tamanio(){
        return elementos.stream().mapToInt(elm -> elm.tamanio()).sum();
    }

    @Override
    public void mostrar(Integer identacion){
        System.out.println(" ".repeat(identacion) + "└ " + name + " (" + this.tamanio() + "-Bytes)");
        elementos.stream().forEach(elem -> elem.mostrar(identacion + 3));
    }

    @Override
    public IElemento archivoMasPesado(){
        return elementos.stream().map(e -> e.archivoMasPesado()).max(
            Comparator.comparingInt(elem -> elem.tamanio())
        ).orElseThrow();
    }
}
