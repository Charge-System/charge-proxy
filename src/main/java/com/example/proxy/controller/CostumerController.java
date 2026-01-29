package com.example.proxy.controller;

import com.example.proxy.dto.CreateCostumerRequest;
import com.example.proxy.dto.CreateCostumerResponse;
import com.example.proxy.service.AsaasProxy;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customers")
public class CostumerController {

        private final AsaasProxy proxy;

        public CostumerController(AsaasProxy proxy) {
            this.proxy = proxy;
        }

        @PostMapping
        public CreateCostumerResponse createCustomer(@RequestBody CreateCostumerRequest request) {
            return proxy.createCostumer(request);
        }

}
