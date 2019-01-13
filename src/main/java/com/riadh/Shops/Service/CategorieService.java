package com.riadh.Shops.Service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.riadh.Shops.Repository.CategoryRepository;
import com.riadh.Shops.model.Category;

@Service
public class CategorieService{
    @Autowired  
	private CategoryRepository categoryRepository;
	public List<Category>getCategories(){
    	return  categoryRepository.findAll();
    }
	
	public  Category update(Category c) {
		return  categoryRepository.save(c);
	}
    
	public void delete(Long  id) {
    	Category c= new Category();
    	c.setId(id);
    	categoryRepository.delete(c);
	}
    
	public Category save(Category c) {
		return categoryRepository.save(c);
	}
    
   
}

	

	
	


