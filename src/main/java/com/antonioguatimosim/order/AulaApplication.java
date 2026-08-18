package com.antonioguatimosim.order;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.antonioguatimosim.order.entities.Order;
import com.antonioguatimosim.order.services.OrderService;

@SpringBootApplication
public class AulaApplication implements  CommandLineRunner{

	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(AulaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Scanner sc = new Scanner(System.in);
		
	    System.out.println("Dados do Pedido:");
		System.out.print("Código: ");
	    int code = sc.nextInt();
		System.out.print("Valor Básico: ");
		double basic = sc.nextDouble();
		System.out.print("Desconto: ");
		double discount = sc.nextDouble();

		Order order = new Order(code, basic, discount);

	    System.out.println("Pedido Código " + order.getCode());
	    System.out.println("Valor Total: " + orderService.total(order));

		sc.close();
	}
}
