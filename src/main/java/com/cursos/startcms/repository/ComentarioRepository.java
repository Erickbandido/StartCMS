package com.cursos.startcms.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ComentarioRepository implements ComentarioRepInterface{
	@Autowired
	public JdbcTemplate jdbcTemplate;

}
