package com.desafio.desafioModulo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.desafio.desafioModulo1.entities.Order;
import com.desafio.desafioModulo1.services.OrderService;



@SpringBootApplication
public class DesafioApplication implements CommandLineRunner {
	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(DesafioApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Order orderExemplo1 = new Order(1034,150.0,20.0);
		Order orderExemplo2 = new Order(2282,800.0,10.0);
		Order orderExemplo3 = new Order(1309,95.90,0.0);

		System.out.println("--------------");
		System.out.println("Número do Pedido: " + orderExemplo1.getCode()+" "+"Resultado do Exemplo 1: " + orderService.total(orderExemplo1));
		System.out.println("--------------");
		System.out.println("Número do Pedido: " + orderExemplo2.getCode()+" "+"Resultado do Exemplo 2: " + orderService.total(orderExemplo2));
		System.out.println("--------------");
		System.out.println("Número do Pedido: " + orderExemplo3.getCode()+" "+"Resultado do Exemplo 3: " + orderService.total(orderExemplo3));
	}

	
}
