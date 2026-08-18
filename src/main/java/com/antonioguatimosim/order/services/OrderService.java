package com.antonioguatimosim.order.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.antonioguatimosim.order.entities.Order;

@Service
public class OrderService {

    @Autowired
    private ShippingService shippingService; 

    public double total(Order order)    {

        double desconto = order.getBasic() * order.getDiscount() / 100;
        return order.getBasic() - desconto + shippingService.shipment(order);
    }

}
