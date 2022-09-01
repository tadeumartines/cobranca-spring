package com.tm.cobranca.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tm.cobranca.model.Titulo;

public interface Titulos extends JpaRepository<Titulo, Long> {
	
	

}
