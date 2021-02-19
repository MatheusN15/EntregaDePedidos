package br.com.springboot.bring2me.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.springboot.bring2me.entity.Pedido;

@Controller
public class HomeController {

	@GetMapping("home")
	public String home() {
		Pedido pedido = new Pedido();
		return "home";
		
	}
}
