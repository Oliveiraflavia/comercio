package com.itb.inf2hm.comercio.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itb.inf2hm.comercio.model.Produto;

@Controller
@RequestMapping("/comercio/produtos")
public class LojaController {
	
  List<Produto> listaDeProdutos = new ArrayList<Produto>();
	
	
	@GetMapping("/listar")
	public String listarProdutos(Model model) {
		
		Produto produto = new Produto();
		produto.setId(145l);
	    produto.setNome("Televisor 70' Samsung");
	    produto.setCodigoBarras("JFALJFDOE2514");
	    produto.setPreco(6541.25);
	    
	    Produto produto2 = new Produto();
	    produto2.setId(146l);
	    produto2.setNome("Máquina de Lavar Brastemp");
	    produto.setCodigoBarras("JFELJFDOA2910");
	    produto2.setPreco(4321.54);
		
	    //Adicionando os produtos no Arraylist
	    listaDeProdutos.add(produto);
	    listaDeProdutos.add(produto2);
	    
	    model.addAttribute("produtos", listaDeProdutos);
		return "produtos";
	}
	
	@GetMapping("/novo-produto")
	
	public String novoProduto () {
		return "novo-produto";
	}
}
