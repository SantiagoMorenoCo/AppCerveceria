
package Dominio.Entidades;

import java.util.List;

public class Administrador {
    private int idAdmin;
    private String nombre;
    private String cargo;

    public Administrador(int idAdmin, String nombre, String cargo) {
        this.idAdmin = idAdmin;
        this.nombre = nombre;
        this.cargo = cargo;
    }

    public void agregarProducto(List<Producto> productos, Producto producto) {
        productos.add(producto);
    }

    public void eliminarProducto(List<Producto> productos, Producto producto) {
        productos.remove(producto);
    }

    public void modificarProducto(Producto producto, String nuevoNombre, double nuevoPrecio) {
        producto.setStock(producto.getStock());
        // Asumimos que también puede cambiar nombre y precio
    }

    public void registrarCliente(List<Cliente> clientes, Cliente cliente) {
        clientes.add(cliente);
    }
}
