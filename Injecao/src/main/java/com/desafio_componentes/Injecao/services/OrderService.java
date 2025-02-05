package com.desafio_componentes.Injecao.services;

import com.desafio_componentes.Injecao.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service  // Adicione essa anotação para que o Spring gerencie a classe
public class OrderService {

    @Autowired
    private  ShippingService shippingService;

    public OrderService() {

    }

    public OrderService(ShippingService shippingService) {
        this.shippingService = shippingService;
    }

    public Double total(Order order) {
        double valorComDesconto = order.getBasic() - (order.getBasic() * (order.getDiscount() / 100));
        return valorComDesconto + shippingService.shipment(order);
    }
}
