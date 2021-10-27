package com.cursos.startcms.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.cursos.startcms.model.Permiso;

@Repository
public class PermisoRepository implements PermisoRepInterface{
	@Autowired
	public JdbcTemplate jdbcTemplate;

	@Override
	public boolean save(Permiso object) {
		try {
			String sql = String.format("insert into permiso "
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
	public boolean update(Permiso object) {
		if (object.getIdPermiso()!=0) {
			return false;
		}
		try {
		String sql = String.format("update permido "
				+ "set nombre='%s'"
				+ "where idComentario='%d'", 
				object.getNombre(),
				object.getIdPermiso());
		jdbcTemplate.execute(sql);
		return true;
		}
		catch (Exception e) {
			return false;
		}
	}

	@Override
	public List<Permiso> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Permiso findById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
