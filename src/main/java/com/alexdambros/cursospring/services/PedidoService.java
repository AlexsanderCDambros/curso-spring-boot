package com.alexdambros.cursospring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alexdambros.cursospring.domain.Pedido;
import com.alexdambros.cursospring.repositories.PedidoRepository;
import com.alexdambros.cursospring.services.exeptions.ObjectNotFoundException;

@Service
public class PedidoService {

	@Autowired
	private PedidoRepository repo;
	
	public Pedido findById(Integer id) {
		Optional<Pedido> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Pedido.class.getName()));
	}
	
	public List<Pedido> findAll() {
		List<Pedido> obj = repo.findAll();
		if (obj.isEmpty()) {
			throw new ObjectNotFoundException("Nenhuma categoria foi encontrada.");
		}
		return obj;
	}

}
