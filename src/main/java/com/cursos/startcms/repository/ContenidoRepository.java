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
		try {
			String sql = String.format("insert into contenido "
					+ "(tipo, contenido, idPost) "
					+ "values('%s','%s','%d')",
					object.getTipo(),
					object.getContenido(),
					object.getIdPost());
			jdbcTemplate.execute(sql);
			return true;}
			catch (Exception e){
				
				return false;
			}
	}

	@Override
	public boolean update(Contenido object) {
		if (object.getIdContenido()!=0) {
			return false;
		}
		try {
		String sql = String.format("update contenido "
				+ "set tipo='%s', "
				+ "contenido='%s', "
				+ "idpost='%d' "
				+ "where idContenido='%d'", 
				object.getTipo(),
				object.getContenido(),
				object.getIdPost(),
				object.getIdContenido());
		jdbcTemplate.execute(sql);
		return true;
		}
		catch (Exception e) {
			return false;
		}
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
