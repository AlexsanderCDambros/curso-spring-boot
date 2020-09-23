package com.alexdambros.cursospring.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CategoriaTest {
	Categoria categoria;
	
	@BeforeEach
	void initAll() {
		categoria = new Categoria();
	}
	
	@Test
	void getAndSetIdTest() {
		categoria.setId(1);
		assertEquals(1, categoria.getId());
	}	
	
	@Test
	void getAndSetNomeTest() {
		categoria.setNome("Alex");
		assertEquals("Alex", categoria.getNome());
	}	
		
}
