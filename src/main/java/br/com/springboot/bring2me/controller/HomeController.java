package br.com.springboot.bring2me.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.springboot.bring2me.entity.Pedido;
import br.com.springboot.bring2me.entity.dto.PedidoDto;
import br.com.springboot.bring2me.entity.service.PedidoService;
import br.com.springboot.bring2me.repository.PedidoRepository;

@Controller
public class HomeController {
	
	@Autowired
	PedidoService pedidoService;

	@GetMapping("/home")
	public String home(Model model) {
		List<Pedido> pedidos = pedidoService.findAll();
		model.addAttribute("pedidos", pedidos);
		return "home";

	}
	
	@GetMapping("/home/{id}")
	public String detalhar(@PathVariable("id") long id, Model model) {
		Pedido pedido = pedidoService.findById(id);
		model.addAttribute("pedido", pedido);
		return "details";
		
	}
	
	@GetMapping("/home/aceito")
	public String aceito(Model model) {
		List<Pedido> pedidos = pedidoService.findAllByStatusAceito();
		model.addAttribute("pedidos", pedidos);
		return "home";
		
	}
}
