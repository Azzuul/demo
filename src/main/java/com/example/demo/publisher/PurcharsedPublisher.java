package com.example.demo.publisher;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import com.example.demo.event.DiscountStock;
import com.example.demo.event.PurcharsedEvent;

@Component
public class PurcharsedPublisher {
    private ApplicationEventPublisher applicationEventPublisher;

    public PurcharsedPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }

    public void purcharsedPublisher(PurcharsedEvent event){
        applicationEventPublisher.publishEvent(event);
    }

    public void discountStockEventPublisher(DiscountStock event){
        applicationEventPublisher.publishEvent(event);
    }

    
}
