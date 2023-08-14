package com.devsuperior.desafioCap01;

import com.devsuperior.desafioCap01.entities.Order;
import com.devsuperior.desafioCap01.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Locale;
import java.util.Scanner;

@SpringBootApplication
public class DesafioCap01Application implements CommandLineRunner {

	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {

		SpringApplication.run(DesafioCap01Application.class, args);
	}


	@Override
	public void run(String... args) throws Exception {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe o número da ordem de serviço: ");
		Integer code_ = sc.nextInt();
		System.out.println("Informe o valor básico: ");
		double basic_value = sc.nextDouble();
		System.out.println("Informe o valor do desconto: ");
		double discount = sc.nextDouble();

		Order order = new Order(code_, basic_value, discount);
		System.out.println("Pedido código: " + order.getCode());
		System.out.println("Valor total: " + orderService.total(order));

	}
}
