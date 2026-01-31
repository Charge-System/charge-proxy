package com.dev.proxy.controller;

import com.dev.proxy.dto.CreateCostumerRequest;
import com.dev.proxy.dto.CreateCostumerResponse;
import com.dev.proxy.service.AsaasProxy;
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
