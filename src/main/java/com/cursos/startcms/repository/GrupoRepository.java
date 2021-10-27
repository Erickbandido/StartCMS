package com.cursos.startcms.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.cursos.startcms.model.Grupo;

@Repository
public class GrupoRepository implements GrupoRepInterface{
	@Autowired
	public JdbcTemplate jdbcTemplate;

	@Override
	public boolean save(Grupo object) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Grupo object) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Grupo> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Grupo findById(long id) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
