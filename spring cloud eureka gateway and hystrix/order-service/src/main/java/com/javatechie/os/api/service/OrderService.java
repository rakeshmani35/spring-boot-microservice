package com.javatechie.os.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.javatechie.os.api.entity.Order;
import com.javatechie.os.api.repository.OrderRepository;
import com.javatechie.ps.api.common.Payment;
import com.javatechie.ps.api.common.TransactionRequest;
import com.javatechie.ps.api.common.TransactionResponse;

@Service
public class OrderService {

	@Autowired
	private OrderRepository repository;

	@Autowired
	private RestTemplate template;

	public TransactionResponse saveOrder(TransactionRequest request) {
		
		String response = "";
		
		Order order = request.getOrder();
		Payment payment = request.getPayment();
		payment.setOrderId(order.getId());
		payment.setAmmount(order.getPrice());

		// rest call
		//String url = "http://localhost:9191/payment/doPayment";
		String url = "http://PAYMENT-SERVICE/payment/doPayment"; // eureka service registry
		Payment paymentResponse = template.postForObject(url, payment, Payment.class);

		response = paymentResponse.getPaymentStatus().equals("success")
				? "payment processing successful and order placed"
				: "there is failure in payment api, order added to cart";

		 repository.save(order);
		
		return new TransactionResponse(order, paymentResponse.getAmmount(), paymentResponse.getTransactionId(), response);
	}
}
