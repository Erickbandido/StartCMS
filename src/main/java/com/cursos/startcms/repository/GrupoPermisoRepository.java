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
		try {
			String sql = String.format("insert into grupo_permiso "
					+ "(idGrupo, idPermiso) "
					+ "values('%d','%d')",
					object.getIdGrupo(),
					object.getIdPermiso());
			jdbcTemplate.execute(sql);
			return true;}
			catch (Exception e){
				
				return false;
			}
	}

	@Override
	public boolean update(GrupoPermiso object) {
//		if ((object.getIdGrupo()!=0)||(object.getIdPermiso()!=0)) {
//			return false;
//		}
//		try {
//		String sql = String.format("update grupo_permiso "
//				+ "set idGrupo='%d', "
//				+ "id='%d', "
//				+ "idpost='%d' "
//				+ "where idContenido='%d'", 
//				object.getTipo(),
//				object.getContenido(),
//				object.getIdPost(),
//				object.getIdContenido());
//		jdbcTemplate.execute(sql);
//		return true;
//		}
//		catch (Exception e) {
//			return false;
//		}
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
