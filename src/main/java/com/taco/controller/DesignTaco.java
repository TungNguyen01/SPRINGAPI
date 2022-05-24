package com.taco.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.taco.data.OrderRepository;
import com.taco.data.TacoRepository;
import com.taco.model.Order;
import com.taco.model.Taco;

@RestController
@RequestMapping(path = "/create", produces = "application/json")
@CrossOrigin(origins = "*")
public class DesignTaco {
	private TacoRepository Repotaco;
	private OrderRepository Repoorder;
	@PostMapping(path = "/taco", consumes = "application/json")
	public Taco designTaco(@RequestBody Taco t) {
		return Repotaco.save(t);
	}
	@PostMapping(path = "/order",consumes = "application/json")
	private Order designOrder(@RequestBody Order o) {
		return Repoorder.save(o);
	}
}
