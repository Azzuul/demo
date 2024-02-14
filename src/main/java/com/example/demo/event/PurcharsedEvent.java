package com.example.demo.event;

import com.example.demo.Producto;

public class PurcharsedEvent {
    private String id;
    private String descripcion;
    private Producto producto;
    private int cantidad;
    
    public PurcharsedEvent(String id, String descripcion, Producto producto, int cantidad) {
        this.id = id;
        this.descripcion = descripcion;
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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

    @Override
    public String toString() {
        return "Purcharsed Event id=" + id + ", descripcion=" + descripcion + ", producto=" + producto + ", cantidad="
                + cantidad;
    }

    

}
