package com.devsuperior.desafioCap01.services;

import com.devsuperior.desafioCap01.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {
    //responsável por operações referente a frete


    public double shipment(Order order){

        if (order.getBasic() < 100.00) {
            return 20.0;
        } else if (order.getBasic() < 200.00){
            return 12.0;
        } else {
            return 0.0;
        }

    }
}
