package pos.logic;
import java.io.Serializable;
import java.util.Objects;
import java.util.Random;
import java.util.UUID;
public class Linea implements Serializable {

    private String idLinea;
    private Producto producto;
    private int cantidad;
    private double  descuento;
    private String facturaId; // Nuevo campo para el ID de la factura

    public Linea() {
        this(new Producto(), 1, 0);
    }

    public Linea(Producto producto, int cantidad, float descuento) {
        Random random = new Random();
        int randomId = random.nextInt(9000) + 1000;
        this.idLinea = String.valueOf(randomId);
        this.producto = producto;
        this.cantidad = cantidad;
        this.descuento = descuento;
    }

    public String getIdLinea() {
        return this.idLinea;
    }

    public void setIdLinea(String linea) {
        this.idLinea = linea;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public String getFacturaId() {
        return facturaId;
    }

    public void setFacturaId(String facturaId) {
        this.facturaId = facturaId;
    }

    public double calcularDescuento() {
        return (descuento / 100.0) * producto.getPrecioUnitario() * cantidad;
    }

    public double calcularImporte() {
        return (cantidad * producto.getPrecioUnitario()) - calcularDescuento();
    }

    public double calcularNeto() {
        return (producto.getPrecioUnitario()) * (1 - (descuento / 100));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Linea linea = (Linea) o;
        return cantidad == linea.cantidad && Double.compare(descuento, linea.descuento) == 0 && Objects.equals(producto, linea.producto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(producto, cantidad, descuento);
    }

    @Override
    public String toString() {
        return producto != null ? producto.getCodigo() : "Producto desconocido";
    }
}
