package com.cursos.startcms.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.cursos.startcms.model.GrupoPermiso;

@Repository
public class GrupoPermisoRepository implements GrupoPermisoRepInterface{

	@Autowired
	public JdbcTemplate jdbcTemplate;

	@Override
	public boolean save(GrupoPermiso object) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(GrupoPermiso object) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<GrupoPermiso> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GrupoPermiso findById(long id) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
