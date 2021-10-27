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
		try {
			String sql = String.format("insert into grupo "
					+ "(nombre) "
					+ "values('%s')",
					object.getNombre());
			jdbcTemplate.execute(sql);
			return true;}
			catch (Exception e){
				
				return false;
			}
	}

	@Override
	public boolean update(Grupo object) {
		if (object.getIdGrupo()!=0) {
			return false;
		}
		try {
		String sql = String.format("update grupo "
				+ "set nombre='%s'"
				+ "where idGrupo='%d'", 
				object.getNombre(),
				object.getIdGrupo());
		jdbcTemplate.execute(sql);
		return true;
		}
		catch (Exception e) {
			return false;
		}
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
