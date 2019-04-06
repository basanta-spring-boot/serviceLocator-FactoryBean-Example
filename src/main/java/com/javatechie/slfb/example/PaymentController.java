package com.javatechie.slfb.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment-service")
public class PaymentController {

/*	@Autowired
	private Paytm paytm;

	@Autowired
	private PhonePe phonePe;*/
	
	@Autowired
	private PaymentRegistry registry;

	@PostMapping("/pay")
	public String payNow(@RequestBody PaymentRequest request) {
		String response = "";
		/*if (request.getPaymentMethod().equals("Paytm")) {
			response = paytm.pay(request);
		}
		if (request.getPaymentMethod().equals("PhonePe")) {
			response = phonePe.pay(request);
		}*/
		
		response=registry.getService(request.getPaymentMethod()).pay(request);
		return response;
	}

}
