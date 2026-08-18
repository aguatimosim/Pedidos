package com.antonioguatimosim.order.services;

import org.springframework.stereotype.Service;

import com.antonioguatimosim.order.entities.Order;

@Service
public class ShippingService   {

    public double shipment(Order order) {

        if (order.getBasic() < 100) {
            return 20;
        }
        else if (order.getBasic() >= 100 && order.getBasic() <= 200) {
            return 12;
        }
        else    {
            return 0;
        }
    }
}
