package com.desafio_componentes.Injecao;

import com.desafio_componentes.Injecao.entities.Order;
import com.desafio_componentes.Injecao.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.text.NumberFormat;
import java.util.Locale;

@SpringBootApplication
public class InjecaoApplication implements CommandLineRunner {

	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(InjecaoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Order order = new Order(2282, 800, 10.00);

		double total = orderService.total(order);

		NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
		String valorFormatado = currencyFormat.format(total);

		System.out.println("Pedido código " + order.getCode());
		System.out.println("Valor total: " + valorFormatado);
	}
}
