package com.cursos.startcms.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.cursos.startcms.model.Contenido;

@Repository
public class ContenidoRepository implements ContenidoRepInterface{
	@Autowired
	public JdbcTemplate jdbcTemplate;

	@Override
	public boolean save(Contenido object) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Contenido object) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Contenido> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Contenido findById(long id) {
		// TODO Auto-generated method stub
		return null;
	}
}
