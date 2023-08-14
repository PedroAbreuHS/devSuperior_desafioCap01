package com.devsuperior.desafioCap01.services;


import com.devsuperior.desafioCap01.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    //responsável por operações referentes a pedidos

    @Autowired
    private ShippingService shippingService;

    public double total(Order order){

        double discount = order.getBasic() * (order.getDiscount() / 100);

        return (order.getBasic() - discount) + shippingService.shipment(order);
    };

}
