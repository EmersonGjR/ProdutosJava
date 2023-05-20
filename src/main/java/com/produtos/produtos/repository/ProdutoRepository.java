package com.produtos.produtos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.produtos.produtos.models.Produto;



public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	Produto findById(long id);
	
}
