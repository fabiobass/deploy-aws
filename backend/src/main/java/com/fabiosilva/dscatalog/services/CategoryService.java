package com.fabiosilva.dscatalog.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fabiosilva.dscatalog.dto.CategoryDTO;
import com.fabiosilva.dscatalog.entities.Category;
import com.fabiosilva.dscatalog.repositories.CategoryRepository;
import com.fabiosilva.dscatalog.services.exceptions.EntityNotFoundException;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository repository;

	@Transactional(readOnly = true) // readOnly so para leitura
	public List<CategoryDTO> findAll() {
		List<Category> list = repository.findAll();

		return list.stream().map(x -> new CategoryDTO(x)).collect(Collectors.toList());

	}

	@Transactional(readOnly = true)
	public CategoryDTO findById(Long id) {
		Optional<Category> obj = repository.findById(id);
		// orElserThrow faz exceção personalizada  
		Category entity = obj.orElseThrow(() -> new EntityNotFoundException("Entidade não encontrada"));
		return new CategoryDTO(entity);
	}

}
