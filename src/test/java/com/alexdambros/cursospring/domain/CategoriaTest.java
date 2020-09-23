package com.alexdambros.cursospring.domain;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

@DisplayName("Categoria domain")
public class CategoriaTest {
	Categoria categoria;

	@BeforeEach
	void initAll() {
		categoria = new Categoria();
	}

	@Nested
	@DisplayName("id should")
	class IdTests {
		@Test
		@DisplayName("be setted end getted correctly")
		void getAndSetIdTest() {
			categoria.setId(1);
			assertEquals(1, categoria.getId());
		}
	}

	@Nested
	@DisplayName("nome should")
	class NomeTests {
		@Test
		@DisplayName("be setted end getted correctly")
		void getAndSetNomeTest() {
			categoria.setNome("Alex");
			assertEquals("Alex", categoria.getNome());
		}
	}

	@Test
	@DisplayName("should be created with params")
	void createWithParams() {
		Categoria cat = new Categoria(50, "Teste");
		assertAll(
			() -> assertEquals(50, cat.getId()),
			() -> assertEquals("Teste", cat.getNome())
		);
	}

}
