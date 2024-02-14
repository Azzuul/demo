package com.example.demo.manager;

import org.springframework.stereotype.Service;

import com.example.demo.Producto;
import com.example.demo.event.DiscountStock;
import com.example.demo.event.PurcharsedEvent;
import com.example.demo.publisher.PurcharsedPublisher;

@Service
public class PurcharsedManager {
    private PurcharsedPublisher publisher;

    public PurcharsedManager(PurcharsedPublisher publisher) {
        this.publisher = publisher;
    }
    public void purcharsedManager(String id,String description,Producto producto,int cantidad){
        PurcharsedEvent event = new PurcharsedEvent(id, description, producto , cantidad);
        if (event.getCantidad()>producto.getStock()) {
            System.out.println("No hay stock suficiente del producto "+event.getDescripcion());
            return;
        }
        publisher.purcharsedPublisher(event);
        discountStock(producto,event);
    }
    public void discountStock(Producto producto,PurcharsedEvent evento){
        int cantidad = producto.getStock()-evento.getCantidad();
        producto.setStock(cantidad);
        DiscountStock event = new DiscountStock(evento.getId(),evento.getCantidad());

        publisher.discountStockEventPublisher(event);
    }
}
