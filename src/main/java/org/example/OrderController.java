package org.example;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/orders")
public class OrderController {
    private final OrderRepository orderRepository;

    @Autowired
    public OrderController(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @GetMapping
    public List<Order> getAllOrders() {
        log.info("Run method get all orders");
        return (List<Order>) orderRepository.findAll();
    }

    @GetMapping("/{id}")
    public Order getOrderById(@PathVariable Long id) {
        log.info("Run method get order by id");
        return orderRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Order addOrder(@RequestBody Order order) {
        log.info("Run method add new order");
        return orderRepository.save(order);
    }
}
