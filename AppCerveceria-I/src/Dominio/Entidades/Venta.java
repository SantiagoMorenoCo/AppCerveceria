package Dominio.Entidades;
import java.util.Date;
import java.util.List;

public class Venta {
   private int idVenta;
    private Date fecha;
    private Cliente cliente;
    private List<DetalleVenta> detalles;

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List getDetalles() {
        return detalles;
    }

    public void setDetalles(List detalles) {
        this.detalles = detalles;
    }

    public Venta(int idVenta, Date fecha, Cliente cliente, List<DetalleVenta> detalles) {
        this.idVenta = idVenta;
        this.fecha = fecha;
        this.cliente = cliente;
        this.detalles = detalles;
    }   
}
