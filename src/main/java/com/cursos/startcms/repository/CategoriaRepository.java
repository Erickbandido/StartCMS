package com.cursos.startcms.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.cursos.startcms.model.Categoria;

@Repository
public class CategoriaRepository implements CategoriaRepInterface {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public boolean save(Categoria categoria) {
		try {
		String sql = String.format("insert into categoria "
				+ "(nombre, descripcion, categoriaSuperior) "
				+ "values('%s','%s','%d')",
				categoria.getNombre(),
				categoria.getDescripcion(),
				categoria.getCategoriaSuperior());
		jdbcTemplate.execute(sql);
		return true;}
		catch (Exception e){
			
			return false;
		}
	}

	@Override
	public boolean update(Categoria categoria) {
		if (categoria.getIdCategoria()!=0) {
			return false;
		}
		try {
			String sql = String.format("update categoria "
					+ "set nombre='%s', descripcion='%s', categoriaSuperior='%d'"
					+ "where idCategoria='%d'", 
					categoria.getNombre(),
					categoria.getDescripcion(), 
					categoria.getCategoriaSuperior(),
					categoria.getIdCategoria());
			jdbcTemplate.execute(sql);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}

	@Override
	public List<Categoria> findAll(Pageable pageable) {
		
		
		return null;
	}
}
