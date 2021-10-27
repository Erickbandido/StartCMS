package com.cursos.startcms.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.cursos.startcms.model.Usuario;

@Repository
public class UsuarioRepository implements UsuarioRepInterface{

	@Autowired
	public JdbcTemplate jdbcTemplate;

	@Override
	public boolean save(Usuario object) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Usuario object) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Usuario> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario findById(long id) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
