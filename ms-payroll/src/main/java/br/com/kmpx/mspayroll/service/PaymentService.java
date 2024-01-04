package br.com.kmpx.mspayroll.service;

import org.springframework.stereotype.Service;

import br.com.kmpx.mspayroll.entities.Payment;

@Service
public class PaymentService {

	public Payment getPayment(Long workerId, int days) {
		return new Payment("Bob", 200.0, days);
	}
}
