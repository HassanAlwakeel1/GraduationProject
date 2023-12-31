package com.graduationproject.controllers;

import com.graduationproject.DTOs.OrderDTO;
import com.graduationproject.services.impl.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/user")
@RequiredArgsConstructor
public class OrderController {
    private final OrderService orderService;


    @PostMapping("/create-update")
    public ResponseEntity<String> createOrder(@ModelAttribute OrderDTO orderDTO) {
        return orderService.createOrUpdateOrder(orderDTO);
    }
}
