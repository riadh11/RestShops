package com.riadh.Shops.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.riadh.Shops.Service.CategorieService;
import com.riadh.Shops.model.Category;
@RestController
@CrossOrigin
public class CategorieControlle {
	@Autowired
	private CategorieService categorieService;
	 
	    @GetMapping("/Categor")
	    public List<Category> getAllCorse() {
	        return categorieService.getCategories();
	    }
	  

	    @PostMapping("/Categor")
	    public Category createCorse(@RequestBody Category categorie) {
	        return categorieService.save(categorie);
	    }
        @PutMapping("/Categor")
	    public Category updatePost(@RequestBody  Category categorie) {
	    	return categorieService.save(categorie);
	    }


	    @DeleteMapping("/Categor/{id}")
	    public void deletePost(@PathVariable Long id) {
	    	categorieService.delete(id);

	    }
}

