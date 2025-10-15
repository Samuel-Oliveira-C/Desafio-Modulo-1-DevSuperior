package com.desafio.desafioModulo1.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.desafio.desafioModulo1.entities.Order;

@Service
public class OrderService {

    @Autowired
    private ShippingService shippingService;

    public double total(Order order){
        Order orderClone = new Order(order.getCode(),order.getBasic(),order.getDiscount());
        double discount = order.getBasic() * (order.getDiscount()/100);
        double valueTotal = order.getBasic() - discount;
        orderClone.setBasic(valueTotal);

        return shippingService.shipment(orderClone) + valueTotal;
    }
}
