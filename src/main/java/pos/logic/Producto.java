package pos.logic;


import java.io.Serializable;
import java.util.Objects;

public class Producto implements Serializable {
    String codigo;
    String descripcion;
    String unidadDeMedidad;
    double precioUnitario;
    int existencia;
    Categoria categoria;

    public Producto() {
        this("", "", "", 0.0, 0, new Categoria());
    }

    public Producto(String codigo, String descrpcion, String unidadDeMedidad, double precioUnitario, int existencia, Categoria categoria) {
        this.codigo = codigo;
        this.descripcion = descrpcion;
        this.unidadDeMedidad = unidadDeMedidad;
        this.precioUnitario = precioUnitario;
        this.existencia = existencia;
        this.categoria = categoria;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getUnidadDeMedidad() {
        return unidadDeMedidad;
    }

    public void setUnidadDeMedidad(String unidadDeMedidad) {
        this.unidadDeMedidad = unidadDeMedidad;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public int getExistencia() {
        return existencia;
    }

    public void setExistencia(int existencia) {
        this.existencia = existencia;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Producto producto = (Producto) o;
        return Objects.equals(codigo, producto.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }

    @Override
    public String toString() {
        return codigo;
    }
}