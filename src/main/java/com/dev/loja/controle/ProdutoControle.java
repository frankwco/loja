package com.dev.loja.controle;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.dev.loja.modelos.Produto;
import com.dev.loja.modelos.Produto;
import com.dev.loja.repositorios.EstadoRepositorio;
import com.dev.loja.repositorios.FuncionarioRepositorio;
import com.dev.loja.repositorios.ProdutoRepositorio;

@Controller
public class ProdutoControle {
	
	@Autowired
	private ProdutoRepositorio produtoRepositorio;
	
	
	@GetMapping("/administrativo/produtos/cadastrar")
	public ModelAndView cadastrar(Produto produto) {
		ModelAndView mv =  new ModelAndView("administrativo/produtos/cadastro");
		mv.addObject("produto",produto);
		return mv;
	}
	
	@GetMapping("/administrativo/produtos/listar")
	public ModelAndView listar() {
		ModelAndView mv=new ModelAndView("administrativo/produtos/lista");
		mv.addObject("listaProdutos", produtoRepositorio.findAll());
		return mv;
	}
	
	@GetMapping("/administrativo/produtos/editar/{id}")
	public ModelAndView editar(@PathVariable("id") Long id) {
		Optional<Produto> produto = produtoRepositorio.findById(id);
		return cadastrar(produto.get());
	}
	
	@GetMapping("/administrativo/produtos/remover/{id}")
	public ModelAndView remover(@PathVariable("id") Long id) {
		Optional<Produto> produto = produtoRepositorio.findById(id);
		produtoRepositorio.delete(produto.get());
		return listar();
	}
	
	@PostMapping("/administrativo/produtos/salvar")
	public ModelAndView salvar(@Valid Produto produto, BindingResult result) {
		
		if(result.hasErrors()) {
			return cadastrar(produto);
		}
		produtoRepositorio.saveAndFlush(produto);
		
		return cadastrar(new Produto());
	}

}
