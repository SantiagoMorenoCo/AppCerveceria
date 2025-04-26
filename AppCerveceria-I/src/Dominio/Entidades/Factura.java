package Dominio.Entidades;

import java.util.Date;


public class Factura {
 private int idFactura;
 private Date fechaEmision;
 private Venta venta;

    public int getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }

    public Date getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

public Factura(int idFactura, Date fechaEmision, Venta venta) {
 this.idFactura = idFactura;
 this.fechaEmision = fechaEmision;
 this.venta = venta;   
 }
}
