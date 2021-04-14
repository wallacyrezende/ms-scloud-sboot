package com.devwall.hrpayroll.services;

import org.springframework.stereotype.Service;

import com.devwall.hrpayroll.entities.Payment;

@Service
public class PaymentService {
	
	public Payment getPayment(long workerId, int days) {
		return new Payment("Wall", 400.0, days);
	}

}
