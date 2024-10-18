package pos.logic;


import pos.logic.Cajero;

import java.io.Serializable;
import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Factura implements Serializable {
    String id;

    String metodoPago;
    double total;

    Cliente cliente;

    Cajero cajero;


    Fecha fecha;

    List<Linea> linea;


    // Constructor por defecto
    public Factura() {
        this("", new Cliente(), "", new Fecha(), 0, new ArrayList<Linea>(), new Cajero());
    }

    // Constructor con parámetros
    public Factura(String id, Cliente cliente, String metodoPago, Fecha fecha, double total, List<Linea> lineas, Cajero cajero) {
        this.id = id;
        this.cliente = cliente;
        this.metodoPago = metodoPago;
        this.fecha = fecha;
        this.total = total;
        this.cajero = cajero;
        this.linea = (lineas != null) ? lineas : new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Cajero getCajero(){return cajero;}

    public String getMetodoPago() {
        return metodoPago;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public List<Linea> getLinea() {
        return linea;
    }
    public Linea getCurrent(){
        // Suponiendo que 'listaLineas' es tu lista de tipo List<Linea>
        if (linea.isEmpty()) {
            return null; // O manejar el caso de lista vacía según tu lógica
        }
        int lastIndex = linea.size() - 1;
        return linea.get(lastIndex);
    }
    public void setCurrent(Linea nuevaLinea){
        if(linea == null || linea.isEmpty()) {
            // Si la lista está vacía, simplemente agrega la nueva línea
            linea.add(nuevaLinea);
        } else {
            // Actualizar la última línea
            int lastIndex = linea.size() - 1;
            linea.set(lastIndex, nuevaLinea); // Reemplaza la última línea
        }
    }
    public String getLineasCodigo(){
        List<Linea> lineas = getLinea();
        StringBuilder sb = new StringBuilder();

        for (Linea linea : lineas) {
            sb.append(linea.getIdLinea()).append("\n"); // Separar cada línea por un salto de línea
        }

        return sb.toString().trim(); // Eliminar el último salto de línea
    }

    public void setLinea(List<Linea> linea) {
        this.linea = linea;
    }

    public void addLinea(Linea linea) {
        if (linea == null) {
            this.linea = new ArrayList<>();
        }else{
            this.linea.add(linea);
        }
    }
    public void setCajero(Cajero cajero) {
        this.cajero = cajero;
    }


    public void setMetodoPago(String metodoPago) {
        this.metodoPago= metodoPago;
    }


    public void setFecha(Fecha f) {
        this.fecha = f;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Factura factura = (Factura) o;
        return Objects.equals(id, factura.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return  id ;
    }
}
