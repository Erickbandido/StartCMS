package com.cursos.startcms.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UsuarioRepository implements UsuarioRepInterface{

	@Autowired
	public JdbcTemplate jdbcTemplate;
	
}
