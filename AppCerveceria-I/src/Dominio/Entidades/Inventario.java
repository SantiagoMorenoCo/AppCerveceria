package Dominio.Entidades;

import java.util.ArrayList;
import java.util.List;

public class Inventario {
 private List<Producto> productos;

 public Inventario() {
        productos = new ArrayList<>();
    }

  public void actualizarStock(Producto producto, int nuevoStock) {
        producto.setStock(nuevoStock);
    }

  public void eliminarProducto(Producto producto) {
        productos.remove(producto);
    }

  public Producto buscarProducto(String nombre) {
        for (Producto producto : productos) {
            if (producto.getNombre().equalsIgnoreCase(nombre)) {
                return producto;
            }
        }
   return null; 
    }

  public void agregarProducto(Producto producto) {
        productos.add(producto);
    }
}

