package Dominio.Entidades;

import java.util.Date;

public class Pago {
   private int idPago;
   private double monto;
   private String metodoPago;
   private Date fechaPago;

 public Pago(int idPago, double monto, String metodoPago, Date fechaPago) {
  this.idPago = idPago;
  this.monto = monto;
  this.metodoPago = metodoPago;
  this.fechaPago = fechaPago;  
}

    public int getIdPago() {
        return idPago;
    }

    public void setIdPago(int idPago) {
        this.idPago = idPago;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public Date getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(Date fechaPago) {
        this.fechaPago = fechaPago;
    }
}
