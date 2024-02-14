package com.example.demo.listener;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.example.demo.event.DiscountStock;
import com.example.demo.event.PurcharsedEvent;

@Component
public class PurcharsedListener {

    @EventListener
    public void purcharsedEventListener(PurcharsedEvent event){
        System.out.println("Se ha registrado correctamente la compra.");
    }

    @EventListener
    public void discountStock(DiscountStock eDiscountStock){
        System.out.println("Se desconto correctamente de stock "+eDiscountStock.getCantidad()+" del producto con id: "+eDiscountStock.getId()+", el stock total es de "+eDiscountStock.);
    }
}
