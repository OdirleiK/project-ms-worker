package br.com.kmpx.mspayroll.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.kmpx.mspayroll.entities.Payment;
import br.com.kmpx.mspayroll.entities.Worker;

@Service
public class PaymentService {

	@Value("${ms-worker.host}")
	private String workerHost;
	
	@Autowired
	private RestTemplate restTemplate;
	
	public Payment getPayment(Long workerId, int days) {
		Map<String, String> uriVariables = new HashMap<>();
		uriVariables.put("id", workerId.toString());
		
		Worker worker = restTemplate.getForObject(workerHost + "/workers/{id}", Worker.class, uriVariables);
		return new Payment(worker.getName(), worker.getDailyIncome(), days);
	}
}
