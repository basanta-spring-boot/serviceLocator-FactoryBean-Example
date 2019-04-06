package com.javatechie.slfb.example;

import org.springframework.stereotype.Service;

@Service("Paytm")
public class Paytm implements Payment {

	@Override
	public String pay(PaymentRequest request) {
		return request.getAmount() + " paid successfully using " + request.getPaymentMethod();
	}

}
