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
	public boolean save(Categoria object) {
		try {
		String sql = String.format("insert into categoria "
				+ "(nombre, descripcion, categoriaSuperior) "
				+ "values('%s','%s','%d')",
				object.getNombre(),
				object.getDescripcion(),
				object.getCategoriaSuperior());
		jdbcTemplate.execute(sql);
		return true;}
		catch (Exception e){
			
			return false;
		}
	}

	@Override
	public boolean update(Categoria object) {
		if (object.getIdCategoria()!=0) {
			return false;
		}
		try {
			String sql = String.format("update categoria "
					+ "set nombre='%s', descripcion='%s', categoriaSuperior='%d'"
					+ "where idCategoria='%d'", 
					object.getNombre(),
					object.getDescripcion(), 
					object.getCategoriaSuperior(),
					object.getIdCategoria());
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

	@Override
	public Categoria findById(long id) {
		// TODO Auto-generated method stub
		return null;
	}
}
