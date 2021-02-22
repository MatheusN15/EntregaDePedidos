package br.com.springboot.bring2me.entity.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.springboot.bring2me.entity.Pedido;
import br.com.springboot.bring2me.entity.Status;
import br.com.springboot.bring2me.repository.PedidoRepository;

@Service
public class PedidoService {
	
	@Autowired
	PedidoRepository pedidoRepository;
	
    public Pedido findById(long id) {
        return pedidoRepository.findById(id).get();
    }
    
    public List<Pedido> findAll() {
        return pedidoRepository.findAll();
    }

	public List<Pedido> findAllByStatusAceito() {
		Pedido pedido = new Pedido();
		pedido.setStatus(Status.ACEITO);
		return pedidoRepository.findByStatus(pedido.getStatus());
	}
	
}
