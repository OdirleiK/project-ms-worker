package br.com.kmpx.mspayroll.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.kmpx.mspayroll.entities.Payment;
import br.com.kmpx.mspayroll.entities.Worker;
import br.com.kmpx.mspayroll.feignclients.WorkerFeignClient;

@Service
public class PaymentService {

	@Autowired
	private WorkerFeignClient workerFeignClient;
	
	public Payment getPayment(Long workerId, int days) {

		Worker worker = workerFeignClient.findById(workerId).getBody();
		return new Payment(worker.getName(), worker.getDailyIncome(), days);
	}
}
