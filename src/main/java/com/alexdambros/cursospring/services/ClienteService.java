package com.alexdambros.cursospring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alexdambros.cursospring.domain.Cliente;
import com.alexdambros.cursospring.repositories.ClienteRepository;
import com.alexdambros.cursospring.services.exeptions.ObjectNotFoundException;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository repo;
	
	public Cliente findById(Integer id) {
		Optional<Cliente> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Cliente.class.getName()));
	}
	
	public List<Cliente> findAll() {
		List<Cliente> obj = repo.findAll();
		if (obj.isEmpty()) {
			throw new ObjectNotFoundException("Nenhuma categoria foi encontrada.");
		}
		return obj;
	}

}
