package com.javatechie.slfb.example;

import lombok.Data;

@Data
public class PaymentRequest {
	private long amount;
	private String paymentMethod;

}
