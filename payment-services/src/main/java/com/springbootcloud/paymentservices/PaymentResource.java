package com.springbootcloud.paymentservices;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
public class PaymentResource {

    @Value("${config.message}")
    String configValue;

    @GetMapping
    String getMessage(){return configValue;}



}
