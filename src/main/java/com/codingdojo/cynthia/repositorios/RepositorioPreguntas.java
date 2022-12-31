package com.codingdojo.cynthia.repositorios;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.cynthia.modelos.Question;

@Repository
public interface RepositorioPreguntas extends CrudRepository<Question, Long> {
	
	List<Question> findAll();
	
}
