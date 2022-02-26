package com.generation.blogpessoal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.blogpessoal.model.PostagemModel;
@Repository
public interface PostagemRepository extends JpaRepository<PostagemModel, Long> {
	List<PostagemModel> findAllByTituloContainingIgnoreCase(String titulo);
	//select * from tb_postagens where titulo like %titulo%;
	//JpaReposotory precisa de 2 parametros, a tabela que você quer manipular, e o seu id

	
	}
