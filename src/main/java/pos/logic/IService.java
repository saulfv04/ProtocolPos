package pos.logic;

import java.util.List;

public interface IService {

    void create(Producto e) throws Exception;
    Producto read(Producto e) throws Exception;
    void update(Producto e) throws Exception;
    void delete(Producto e) throws Exception;
    List<Producto> search(Producto e);
    void updateExistencias(Producto producto) throws Exception;

    List<Categoria> search(Categoria e);
    List<Categoria> getCategorias();

    void create(Factura e) throws Exception;
    Factura read(Factura e) throws Exception;
    void update(Factura e) throws Exception;
    void delete(Factura e) throws Exception;
    List<Factura> search(Factura e);
    List<Linea> searchByFacturId(String facturaId);

    void create(Cliente e) throws Exception;
    Cliente read(Cliente e) throws Exception;
    void update(Cliente e) throws Exception;
    void delete(Cliente e) throws Exception;
    List<Cliente> search(Cliente e);

    void create(Linea e) throws Exception;
    Linea read(Linea e) throws Exception;
    void update(Linea e) throws Exception;
    void delete(Linea e) throws Exception;
    List<Linea> search(Linea e);

    void create(Cajero e) throws Exception;
    Cajero read(Cajero e) throws Exception;
    void update(Cajero e) throws Exception;
    void delete(Cajero e) throws Exception;
    List<Cajero> search(Cajero e);


    void create(Usuarios e) throws Exception;
    Usuarios read(Usuarios e) throws Exception;
    void delete(Usuarios e) throws Exception;
    List<Usuarios> search(Usuarios e);

    float[][] estadisticas(List<Categoria> rows, List<String> cols, Rango rango) throws Exception;

    void exit();

    void deliver_message(String message);

    public void notifyNewConection();

    public List<Usuarios> usuariosActivos();

    public void enviarFactura(Factura factura, Usuarios usuario) throws Exception;

    List<Factura> enviarFacturas()throws Exception;
}
