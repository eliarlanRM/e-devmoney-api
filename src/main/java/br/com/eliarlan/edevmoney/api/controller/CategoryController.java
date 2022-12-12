package br.com.eliarlan.edevmoney.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.eliarlan.edevmoney.domain.model.Category;
import br.com.eliarlan.edevmoney.domain.repository.CategoryRepository;

@RestController
@RequestMapping("/category")
public class CategoryController {
	
	@Autowired
	private CategoryRepository repository;
	
	@GetMapping
	public List<Category> listar(){
		return repository.findAll();
	}
	
}
