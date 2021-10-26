package com.cursos.startcms.repository;

import java.util.List;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;

import com.cursos.startcms.model.Categoria;

public interface CategoriaRepInterface {

	public boolean save(Categoria categoria);
	public boolean update(Categoria categoria);
	public List<Categoria> findAll(Pageable pageable);
}
