package com.example.demo;

public class Producto {
    private String nombre;
    private int stock;
    
    public Producto(String nombre, int stock) {
        this.nombre = nombre;
        this.stock = stock;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }

    
}
