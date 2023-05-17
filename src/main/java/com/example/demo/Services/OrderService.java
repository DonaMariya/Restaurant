package com.example.demo.Services;

import com.example.demo.Repository.RestaurantRepo.OrderRepository;
import com.example.demo.Schema.Orders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.Order;
import java.util.List;
import java.util.Optional;

@Component
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;
    public OrderService(OrderRepository orderRepository){
        this.orderRepository = orderRepository;
    }

    public List<Orders> getAllOrders() {
        return (List<Orders>) orderRepository.findAll();
    }
    public Optional<Orders> getOrderById(Long id) {
        return orderRepository.findById(id);
//                .orElseThrow(() -> new ResourceNotFoundException("Order not found with id: " + id));
    }
    public Orders createOrder(Orders order) {
        return  orderRepository.save(order);
    }
    public void deleteOrder(Long id) {
        orderRepository.deleteById(id);
    }
}





















