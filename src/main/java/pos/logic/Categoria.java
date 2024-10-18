package pos.logic;


import java.io.Serializable;
import java.util.Objects;

import java.util.Objects;
public class Categoria implements Serializable {
    private String idCategoria;
    private String nombre;

    public Categoria() {this("i","i");}
    public Categoria(String idCategoria, String nombre) {
        this.idCategoria = idCategoria;
        this.nombre= nombre;
    }

    public Categoria(String nombre){
        this.nombre = nombre;
        this.idCategoria = nombre;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(String idCategoria) {
        this.idCategoria = idCategoria;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Categoria categoria = (Categoria) o;
        return Objects.equals(idCategoria, categoria.idCategoria);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCategoria);
    }

    @Override
    public String toString() {
        return nombre;
    }
}
