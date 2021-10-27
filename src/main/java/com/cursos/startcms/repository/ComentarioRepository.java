package com.cursos.startcms.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.cursos.startcms.model.Comentario;

@Repository
public class ComentarioRepository implements ComentarioRepInterface{
	@Autowired
	public JdbcTemplate jdbcTemplate;

	@Override
	public boolean save(Comentario object) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Comentario object) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Comentario> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Comentario findById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
