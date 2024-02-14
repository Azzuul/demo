package com.example.demo.event;

public class DiscountStock {
    private String id;
    private int cantidad;

    public DiscountStock(String id,int cantidad) {
        this.cantidad = cantidad;
        this.id =id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

}
