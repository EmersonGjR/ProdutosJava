package com.produtos.produtos.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.produtos.produtos.models.Produto;
import com.produtos.produtos.repository.ProdutoRepository;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping(value="/api")
@Tag(name = "/api*")
public class ProdutoResources {
	
	@Autowired
	ProdutoRepository produtoRepository;
	
	@GetMapping("/produtos")
	
	public List<Produto> listaProdutos(){
		return produtoRepository.findAll();
	}
	@GetMapping("/produtos/{id}")
	
	public Produto listaProdutosUnico(@PathVariable(value="id") long id){
		return produtoRepository.findById(id);
	}
	@PostMapping("/produto")
	
	public Produto salvaProduto(@RequestBody Produto produto){
		return produtoRepository.save(produto);
	}
	@DeleteMapping("/produto")
	
	public Produto deletaProduto(@RequestBody Produto produto){
		produtoRepository.delete(produto);
		//retorna o produto que foi deletado
		return produto;
	}
	@PutMapping("/produto")
	
	public Produto atualizaProduto(@RequestBody Produto produto){
		return produtoRepository.save(produto);
	}

}
