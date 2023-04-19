package com.promineotech.jeep.controller;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.web.bind.annotation.RestController;

//import com.promineotech.jeep.dao.S1f4j;
import com.promineotech.jeep.entity.Order;
import com.promineotech.jeep.entity.OrderRequest;
import com.promineotech.jeep.service.JeepOrderService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class BasicJeepOrderController implements JeepOrderController {

//	@Autowired
//	private JeepOrderService jeepOrderService;
	
	@Autowired
	private JeepOrderService jeepOrderService;
	
	
	@Override
	public Order createOrder(OrderRequest orderRequest) {
		log.debug("Order{}", orderRequest);
//		log.debug("model{}, trim={}", model, trim);
//		return jeepOrderService.createOrder(orderRequest);
		return jeepOrderService.createOrder(orderRequest);
	}

}
