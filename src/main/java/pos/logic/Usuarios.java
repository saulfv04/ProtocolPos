package pos.logic;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class Usuarios implements Serializable {

    String id;
    String clave;
    List<Factura> listaFacturas;

    public List<Factura> getListaFacturas() {
        return listaFacturas;
    }

    public void setListaFacturas(List<Factura> listaFacturas) {
        this.listaFacturas = listaFacturas;
    }

    public void anadirFactura(Factura factura){
        listaFacturas.add(factura);
    }

    public Usuarios() {
        this("", "");
    }

    public Usuarios(String id, String clave) {
        this.id = id;
        this.clave= clave;
    }

    public String getId() {
        return id;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public void setId(String id) {
        this.id = id;
    }




    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuarios usuarios = (Usuarios) o;
        return Objects.equals(id, usuarios.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return id;
    }
}