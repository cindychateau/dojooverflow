package com.codingdojo.cynthia.repositorios;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.cynthia.modelos.Tag;

@Repository
public interface RepositorioEtiquetas extends CrudRepository<Tag, Long> {
	
	List<Tag> findAll();
	
	Tag findByEtiqueta(String e); //SELECT * FROM tags WHERE etiqueta = 'TEXTO'
	
}
